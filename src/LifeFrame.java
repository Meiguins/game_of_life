import javax.swing.JFrame;

public class LifeFrame extends JFrame {
    
    public LifeFrame(){

        setSize(1300,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LifeFrame();
    }
}
