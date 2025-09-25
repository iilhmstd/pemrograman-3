import javax.swing.*;

public class Jendela extends JFrame {
    public Jendela () {
        super ("aplikasi Ichikiwir");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        Jendela jendela = new Jendela();

    }
}