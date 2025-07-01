import javax.swing.*;

public class Administrador extends JFrame{
    private JPanel administradorPanel;

    public Administrador(){
        setTitle("Login");
        setContentPane(administradorPanel);
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
