import javax.swing.*;

public class Home extends JFrame {
    private JPanel panel1;
    private JButton producerMachinesButton;

    public Home(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new Home("Home");
        frame.setVisible(true);
    }
}
