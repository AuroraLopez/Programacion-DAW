package Controlador;

import javax.swing.*;


import Vista.ProveedorView;
import modelo.Proveedor;
import modelo.ProveedorDAO;

import java.util.List;

public class ProveedorController {
    private ProveedorView view;
    private ProveedorDAO dao = new ProveedorDAO();

    public ProveedorController(ProveedorView view){
        this.view= view;

        initController();
        cargarTabla();
    }

    private void initController(){
        view.btnInsertar.addActionListener(e -> insertar());
        view.btnActualizar.addActionListener(e -> actualizar());
        view.btnEliminar.addActionListener(e -> eliminar());
        view.btnLimpiar.addActionListener(e -> limpiar());

        view.tabla.getSelectionModel().addListSelectionListener(e ->{
            if (!e.getValueIsAdjusting()) {
                seleccionarFila();
            }
        });
    }
    // ===============================
    // ==        METODO CRUD        ==
    // ===============================
    private void insertar(){
        try {
            int codigo= Integer.parseInt(view.txtCodigo.getText());
            String direccion = view.txtDireccion.getText();
            String ciudad = view.txtCiudad.getText();
            String provincia = view.txtProvincia.getText();

            dao.insertar(codigo, direccion, ciudad, provincia);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Código Inválido");
        }
    }

    private void actualizar(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
        try {
            int codigo= Integer.parseInt(view.txtCodigo.getText());
            String direccion = view.txtDireccion.getText();

            dao.actualizar(codigo, direccion);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Código Inválido");
        }
    }

    private void eliminar(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
    
            int codigo= Integer.parseInt(view.modeloTabla.getValueAt(fila, 0).toString());

            dao.borrar(codigo);

            cargarTabla();
            limpiar();
    }

    private void seleccionarFila(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
            view.txtCodigo.setText(view.modeloTabla.getValueAt(fila, 0).toString());
            view.txtDireccion.setText(view.modeloTabla.getValueAt(fila, 1).toString());
            view.txtCiudad.setText(view.modeloTabla.getValueAt(fila, 2).toString());
            view.txtProvincia.setText(view.modeloTabla.getValueAt(fila, 3).toString());
    }
    private void cargarTabla(){
        view.modeloTabla.setRowCount(0);

        List<Proveedor> lista= dao.listar();
        for(Proveedor p: lista){
            view.modeloTabla.addRow(new Object[]{
                p.getCodigo(),
                p.getDireccion(),
                p.getCiudad(),
                p.getProvincia()
        });
    }
    }

    private void limpiar(){
        view.txtCodigo.setText("");
        view.txtDireccion.setText("");
        view.txtCiudad.setText("");
        view.txtProvincia.setText("");
        view.tabla.clearSelection();
    }
}
