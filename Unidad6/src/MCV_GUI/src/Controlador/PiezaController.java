package Controlador;

import javax.swing.*;
import modelo.Pieza;
import Vista.PiezaView;
import modelo.PiezaDAO;


import java.util.List;

public class PiezaController {
    private PiezaView view;
    private PiezaDAO dao = new PiezaDAO();

    public PiezaController(PiezaView view){
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
            String nombre = view.txtNombre.getText();
            String color = view.txtColor.getText();
            double precio= Double.parseDouble(view.txtPrecio.getText());
            int codigo_categoria = Integer.parseInt(view.txtCodCategoria.getText());

            dao.insertar(new Pieza(codigo, nombre, color, precio, codigo_categoria));

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
            String nombre = view.txtNombre.getText();

            dao.actualizar(new Categoria(codigo, nombre));

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

            dao.eliminar(codigo);

            cargarTabla();
            limpiar();
    }

    private void seleccionarFila(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
            view.txtCodigo.setText(view.modeloTabla.getValueAt(fila, 0).toString());
            view.txtNombre.setText(view.modeloTabla.getValueAt(fila, 1).toString());
      
    }
    private void cargarTabla(){
        view.modeloTabla.setRowCount(0);

        List<Categoria> lista= dao.listar();
        for(Categoria c: lista){
            view.modeloTabla.addRow(new Object[]{
                c.getId(),
                c.getNombre()
            });
        }
    }

    private void limpiar(){
        view.txtCodigo.setText("");
        view.txtNombre.setText("");
        view.tabla.clearSelection();
    }
}
