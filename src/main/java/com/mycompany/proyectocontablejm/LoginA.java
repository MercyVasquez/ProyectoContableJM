package proyectocontablejm;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import javax.swing.UIManager;

public class LoginA {

    public static void main(String[] args) {
        UIManager.setLookAndFeel(new FlatCarbonIJTheme());
        java.awt.EventQueue.invokeLater(() -> {
            Login LoginFrame = new Login();
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            LoginFrame.setVisible(true);
        });
    }
}