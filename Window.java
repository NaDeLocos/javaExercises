import javax.swing.JFrame;

public class Window extends JFrame {

    public Window(){
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    static public void main(String[] args){
        new Window();
    }

}