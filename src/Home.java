import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JPanel panel1;
    private JButton producerMachinesButton;
    private JLabel hopperCountNumField;
    private JButton packagingMachinesButton;


    public Home(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        producerMachinesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new Producer("Producer");
                frame2.setVisible(true);
            }
        });
        packagingMachinesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new Packager("Packager");
                frame3.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Home("Home");
        frame.setVisible(true);
    }
}
