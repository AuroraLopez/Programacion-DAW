package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SuministroView extends JPanel{
    // Campos
    public JTextField txtCodigoProveedor = new JTextField(5);
    public JTextField txtCodigoPieza = new JTextField(5);
    public JTextField txtCantidad = new JTextField(5);
    public JTextField txtFecha = new JTextField(10);

    //Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"CodigoProveedor", "CodigoPieza", "Cantidad", "Fecha"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public SuministroView(){

        setLayout(new BorderLayout());

        // ===== PANEL SUPERIOR =======
        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(
            BorderFactory.createTitledBorder("Datos Suministro"));
        
            panelFormulario.add(new JLabel("Código del proveedor: "));
            panelFormulario.add(txtCodigoProveedor);

            panelFormulario.add(new JLabel("Código de la pieza: "));
            panelFormulario.add(txtCodigoPieza);

            panelFormulario.add(new JLabel("Cantidad: "));
            panelFormulario.add(txtCantidad);

            panelFormulario.add(new JLabel("Fecha: "));
            panelFormulario.add(txtFecha);

            panelFormulario.add(btnInsertar);
            panelFormulario.add(btnActualizar);
            panelFormulario.add(btnEliminar);
            panelFormulario.add(btnLimpiar);

        // ===== PANEL INFERIOR =======
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(
            BorderFactory.createTitledBorder("Listado Categoria"));
        
            add(panelFormulario, BorderLayout.NORTH);
            add (scroll, BorderLayout.CENTER);
    }
}
