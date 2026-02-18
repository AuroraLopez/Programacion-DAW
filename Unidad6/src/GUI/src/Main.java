import javax.swing.*;

public class Main {
    public static void main(String[] args){
        MySimpleGUI gui = new MySimpleGUI();
    }
}
    class MySimpleGUI extends JFrame{
        public MySimpleGUI(){
            setSize(400, 200);
            setTitle("Hola Mundo");
            setVisible(true);
        }
    }

