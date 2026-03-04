package Controlador;

import javax.swing.*;

import Vista.SuministroView;
import modelo.Suministro;
import modelo.SuministroDAO;

import java.sql.Date;
import java.util.List;

public class SuministraController {
    private SuministroView view;
    private SuministroDAO dao = new SuministroDAO();

    public SuministraController(SuministroView view){
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
            int codigoproveedor= Integer.parseInt(view.txtCodigoProveedor.getText());
            int codigopieza= Integer.parseInt(view.txtCodigoPieza.getText());
            int cantidad = Integer.parseInt(view.txtCantidad.getText());
            Date fechadate = Date.valueOf(view.txtFecha.getText());

            dao.insertar(codigoproveedor, codigopieza, cantidad, fechadate);

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
            int codigoproveedor= Integer.parseInt(view.txtCodigoProveedor.getText());
            int codigopieza= Integer.parseInt(view.txtCodigoPieza.getText());
            int cantidad= Integer.parseInt(view.txtCantidad.getText());

            dao.actualizarCantidad(codigoproveedor, codigopieza, cantidad);

            cargarTabla();
            limpiar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Código Inválido");
        }
    }

    private void eliminar(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
    
            int codigoproveedor= Integer.parseInt(view.modeloTabla.getValueAt(fila, 0).toString());
            int codigopieza= Integer.parseInt(view.modeloTabla.getValueAt(fila, 1).toString());

            dao.borrar(codigoproveedor, codigopieza);

            cargarTabla();
            limpiar();
    }

    private void seleccionarFila(){
        
        int fila = view.tabla.getSelectedRow();
        if( fila == -1) return;
            view.txtCodigoProveedor.setText(view.modeloTabla.getValueAt(fila, 0).toString());
            view.txtCodigoPieza.setText(view.modeloTabla.getValueAt(fila, 1).toString());
            view.txtCantidad.setText(view.modeloTabla.getValueAt(fila, 2).toString());
            view.txtFecha.setText(view.modeloTabla.getValueAt(fila, 3).toString());      
    }

    private void cargarTabla(){
        view.modeloTabla.setRowCount(0);

        List<Suministro> lista= dao.listar();
        for(Suministro s: lista){
            view.modeloTabla.addRow(new Object[]{
                s.getCodProveedor(),
                s.getCodPieza(),
                s.getCantidad(),
                s.getFecha()
            });
        }
    }

    private void limpiar(){
        view.txtCodigoProveedor.setText("");
        view.txtCodigoPieza.setText("");
        view.txtCantidad.setText("");
        view.txtFecha.setText("");
        view.tabla.clearSelection();
    }
}
