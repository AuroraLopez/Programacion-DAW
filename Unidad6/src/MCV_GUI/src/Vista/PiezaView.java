package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PiezaView extends JPanel{
    // Campos
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(10);
    public JTextField txtColor = new JTextField(10);
    public JTextField txtPrecio = new JTextField(5);
    public JTextField txtCodCategoria = new JTextField(5);

    //Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Codigo", "Nombre"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public PiezaView(){

        setLayout(new BorderLayout());

        // ===== PANEL SUPERIOR =======
        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(
            BorderFactory.createTitledBorder("Datos Categoría"));
        
            panelFormulario.add(new JLabel("Código: "));
            panelFormulario.add(txtCodigo);

            panelFormulario.add(new JLabel("Nombre: "));
            panelFormulario.add(txtNombre);

            panelFormulario.add(new JLabel("Color: "));
            panelFormulario.add(txtColor);

            panelFormulario.add(new JLabel("Precio: "));
            panelFormulario.add(txtPrecio);

            panelFormulario.add(new JLabel("Código de la categoria: "));
            panelFormulario.add(txtCodCategoria);

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
