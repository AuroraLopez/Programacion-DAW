import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import Controlador.CategoriaController;
import Vista.CategoriaView;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame=new JFrame("IES Cura Valera");
        //Crear el TabbedPane
        JTabbedPane tabbedPane =new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);
        CategoriaView view = new CategoriaView();
        // PiezaView view2= new PiezaView();
        // ProveedorView view3= new PorveedorView();
        // SuministroView view4= new SuministriView();
        // Añadir los paneles como pestañas
        tabbedPane.add("Categoria", view);
        // tabbedPane.add("Pieza", view2);
        // tabbedPane.add("Proveedor", view3);
        // tabbedPane.add("Suministro", view4);
        // Definir el controlador asociado
        CategoriaController c1=new CategoriaController(view);
        // PiezaController c2=new PiezaController(view2);
        // ProveedorController c3=new ProveedorController(view3);
        // SuministroController c4=new SuministroController(view4);
        // Asociar el TabbedPane
        frame.setContentPane(tabbedPane);
        // Tamaño y visibilidad
        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
