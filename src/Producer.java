import javax.swing.*;

public class Producer extends JFrame{
    private JButton addNewMachineButton;
    private JComboBox comboBox1;
    private JButton viewMachineButton;
    private JButton removeMachineButton;
    private JPanel panel1;

    public Producer(String title){
        super(title);

    //    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new Producer("Producer");
        frame.setVisible(true);
    }
}
