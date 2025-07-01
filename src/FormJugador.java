import javax.swing.*;

public class FormJugador extends JFrame {
    private JPanel datosPersonalesPanel;
    private JTextField nombreText;
    private JButton mostrarButton;
    private JButton agregarButton;
    private JButton limpiarButton;
    private JTable table1;
    private JTextField apellidoText;
    private JTextField edadText;
    private JTextField estaturaText;
    private JTextField nombreEquipoText;

    public FormJugador(){
        setTitle("Login");
        setContentPane(datosPersonalesPanel);
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
