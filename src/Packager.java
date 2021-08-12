import javax.swing.*;

public class Packager extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton viewMachineButton;
    private JButton removeMachineButton;
    private JButton addNewMachineButton;

    public Packager(String title){
        super(title);

    //    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new Packager("Packager");
        frame.setVisible(true);
    }
}
