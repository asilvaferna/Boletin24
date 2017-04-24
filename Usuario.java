import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Adri on 24/4/17.
 */
public class Usuario extends JFrame {

    private JPanel panelCampos;
    private JPanel panelBotones;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLblUser;
    private JLabel jLblName;
    private JLabel jLblUserId;
    private JLabel jLblGroup;
    private JLabel jLblHome;
    private JLabel jLblLogin;
    private JLabel jLblPassword;
    private JLabel jLblConfPassword;
    private JTextField txtUser;
    private JTextField txtName;
    private JTextField txtUserId;
    private JComboBox<String> jCBGroup;
    private JTextField txtHome;
    private JComboBox<String> jCBLogin;
    private JPasswordField jPassword;
    private JPasswordField jPasswordConfirm;
    private JButton cancel;
    private JButton ok;

    public Usuario() {

        this.panelCampos = new JPanel();
        this.panelBotones = new JPanel();
        this.jLabel1 = new JLabel("Create a new user:");
        this.jLabel2 = new JLabel();
        this.jLblUser = new JLabel("User Name:");
        this.jLblName = new JLabel("Full Name:");
        this.jLblUserId = new JLabel("User ID:");
        this.jLblGroup = new JLabel("Group:");
        this.jLblHome = new JLabel("Home Directory:");
        this.jLblLogin = new JLabel("Login Shell:");
        this.jLblPassword = new JLabel("Password:");
        this.jLblConfPassword = new JLabel("Confirm:");
        this.txtUser = new JTextField();
        this.txtName = new JTextField();
        this.txtUserId = new JTextField();
        this.jCBGroup = new JComboBox<>();
        this.txtHome = new JTextField();
        this.jCBLogin = new JComboBox<>();
        this.jPassword = new JPasswordField();
        this.jPasswordConfirm = new JPasswordField();
        this.cancel = new JButton("Cancel");
        this.ok = new JButton("Ok");

        panelCampos.setSize(400, 350);
        panelCampos.setLayout(new GridLayout(9,2));
        panelCampos.add(jLabel1);
        panelCampos.add(jLabel2);
        panelCampos.add(jLblUser);
        panelCampos.add(txtUser);
        panelCampos.add(jLblName);
        panelCampos.add(txtName);
        panelCampos.add(jLblUserId);
        panelCampos.add(txtUserId);
        panelCampos.add(jLblGroup);
        panelCampos.add(jCBGroup);
        panelCampos.add(jLblHome);
        panelCampos.add(txtHome);
        panelCampos.add(jLblLogin);
        panelCampos.add(jCBLogin);
        panelCampos.add(jLblPassword);
        panelCampos.add(jPassword);
        panelCampos.add(jLblConfPassword);
        panelCampos.add(jPasswordConfirm);

        panelBotones.setSize(400,50);
        panelBotones.setLayout(new FlowLayout(FlowLayout.TRAILING));
        panelBotones.add(ok);
        panelBotones.add(cancel);


        this.add(panelCampos);
        this.add(panelBotones);
        this.setSize(400,400);
        this.setLayout(new GridLayout(2,1));
        this.setVisible(true);



    }


}
