import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class login extends JFrame {
    private JPanel loginPanel;
    private JTextField usuarioText;
    private JPasswordField passwordText;
    private JComboBox perfilCombo;
    private JButton accesoButton;

    public login(){
        setTitle("Login");
        setContentPane(loginPanel);
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioText.getText();
                String contraseña = String.valueOf(passwordText.getPassword());
                String perfil=(String) perfilCombo.getSelectedItem();

                if (usuario.isEmpty() || contraseña.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Campos invalidos");
                    return;
                } else if (perfil.equals("Administrador")&& usuario.equals("admin") && contraseña.equals("1234")){
                    new Administrador();
                    dispose();
                } else if (perfil.equals("Jugador")&& usuario.equals("jugador") && contraseña.equals("1234")){
                    new FormJugador();
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        new login();
    }
}
