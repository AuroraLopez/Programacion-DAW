package EjemploGUI;

import javax.swing.*; //No haría falta poner * por cuestión de tamaño programa
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1) Creamos la clase ventana
public class EjemploGUI extends JFrame implements ActionListener {
    private JPanel panelDeContenido;
    private JLabel etiqueta1;
    private JTextField campoDeTexto;
    private JButton boton;
    private JTextField campoDeTexto2;
    private JButton boton2;

    public EjemploGUI() {
        initComponents();
    }

    private void initComponents() {
        // Configuramos los parámetros de la ventana
        setTitle(getTitle());
        setLocation(200, 500); // setLocationRelativeTo(null);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 2) Crear los componentes
        campoDeTexto = new JTextField("0", 20); // Inicializa con 0
        boton = new JButton("Sumar");
        boton.addActionListener(this);// Asociar evento botón
        campoDeTexto2 = new JTextField("0", 20); // Inicializa con 0
        boton2 = new JButton("Restar");
        boton2.addActionListener(this);// Asociar evento botón
        etiqueta1 = new JLabel("El resultado es: ");
        // 3) Crear un contenedor
        panelDeContenido = new JPanel();
        // 4) Asociar los componentes al contenedor
        panelDeContenido.add(campoDeTexto);
        panelDeContenido.add(boton);
        panelDeContenido.add(campoDeTexto2);
        panelDeContenido.add(boton2);
        // 5) Asociar el contenedor a la ventana
        setContentPane(panelDeContenido);
        // 6) Hacer visible la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // numClicks++;
        // campoDeTexto.setText(String.valueOf(numClicks));
    }
    public static void main(String[] args) {
        EjemploGUI ejemplo = new EjemploGUI();
    }
}