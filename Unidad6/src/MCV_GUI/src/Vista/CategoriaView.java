package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CategoriaView extends JPanel{
    // Campos
    public JTextField txtCodigo = new JTextField(5);
    public JTextField txtNombre = new JTextField(15);

    //Botones
    public JButton btnInsertar = new JButton("Insertar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnLimpiar = new JButton("Limpiar");

    // Tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Codigo", "Nombre"}, 0);

    public JTable tabla = new JTable(modeloTabla);

    public CategoriaView(){

        setLayout(new BorderLayout());

        // ===== PANEL SUPERIOR =======
        JPanel panelFormulario = new JPanel();
        panelFormulario.setBorder(
            BorderFactory.createTitledBorder("Datos Categoría"));
        
            panelFormulario.add(new JLabel("Código: "));
            panelFormulario.add(txtCodigo);

            panelFormulario.add(new JLabel("Nombre: "));
            panelFormulario.add(txtNombre);

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
