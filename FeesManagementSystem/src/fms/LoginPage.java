package fms;

import BrahmasmiClasses.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JPanel implements ActionListener, KeyListener {
    Connection con;
    private final JFrame mainFrame = new JFrame("Home Page");
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel verificationMessageLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    LoginPage() {
        con = DatabaseConnectivity.getConnectionWithMySQL("library","root","admin@2023");
        setLeftPanel();
        setRightPanel();
        setMainFrame();
    }

    void setLeftPanel() {
        int leftPanelWidth = 300, leftPanelHeight = 500;

        JLabel imageIconLabel = GetImage.getImageOnLabel("C:\\icon\\user.png",200),
               adminPanelLabel = new JLabel("Admin Panel");

        JPanel leftPanel = new JPanel(null) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, MyFont.orangeColor, 135, getHeight(), MyFont.whiteColor);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        leftPanel.setSize(leftPanelWidth,leftPanelHeight);

        MyFont.setLabelOnCenter(imageIconLabel,leftPanelWidth,300);
        MyFont.setLabelOnCenter(adminPanelLabel,0,250,leftPanelWidth,100);

        MyFont.labelTextDecoration(adminPanelLabel,false);

        leftPanel.add(imageIconLabel);
        leftPanel.add(adminPanelLabel);
        mainFrame.add(leftPanel);
    }

    void setRightPanel() {
        JPanel rightPanel = new JPanel(null);
        JLabel companyLogo = GetImage.getImageOnLabel("C:\\icon\\apple.png", 70);
        JLabel companyName = new JLabel("Apple Inc. Pvt Limited");
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usernameTextField = new JTextField(50);
        passwordField = new JPasswordField(50);
        loginButton = new JButton("Login");
        verificationMessageLabel = new JLabel("");

        bornStageForm();

        MyFont.labelTextDecoration(usernameLabel);
        MyFont.labelTextDecoration(passwordLabel);
        MyFont.headerTextDecoration(companyName);
        MyFont.textFieldDecoration(usernameTextField);
        MyFont.textFieldDecoration(passwordField);
        MyFont.loginButtonDecoration(loginButton);
        MyFont.verificationLabelDecoration(verificationMessageLabel);

        MyFont.setLabelOnCenter(companyLogo,600,80);
        MyFont.setLabelOnCenter(companyName,0,80,600,30);


        loginButton.addActionListener(this);
        usernameTextField.addKeyListener(this);

        rightPanel.setBounds(300,0,600,500);

        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        usernameLabel.setBounds(Literals.labelHeaderX,Literals.labelHeaderY,Literals.labelHeaderWidth,Literals.labelHeaderHeight);
        usernameTextField.setBounds(Literals.textFieldX,Literals.labelHeaderY+8,Literals.textFieldWidth,Literals.textFieldHeight);

        passwordLabel.setBounds(Literals.labelHeaderX,Literals.labelHeaderY*2-50,Literals.labelHeaderWidth,Literals.labelHeaderHeight);
        passwordField.setBounds(Literals.textFieldX,Literals.labelHeaderY*2-50+8,Literals.passwordFieldWidth,Literals.textFieldHeight);

        /*MyFont.setLabelHighlighted(loginButton,Color.YELLOW);
        MyFont.setLabelOnCenter(loginButton,0,300,(int)loginButton.getPreferredSize().getWidth()+20,(int)loginButton.getPreferredSize().getHeight()+10);**/

        loginButton.setBounds(passwordLabel.getX()+150,passwordLabel.getY()+80,200,40);

        rightPanel.add(companyLogo);
        rightPanel.add(companyName);
        rightPanel.add(usernameLabel);
        rightPanel.add(passwordLabel);
        rightPanel.add(passwordField);
        rightPanel.add(usernameTextField);
        rightPanel.add(loginButton);
        rightPanel.add(verificationMessageLabel);
        mainFrame.add(rightPanel);
    }
    
    void setMainFrame() {
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setSize(900,530);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton) {
            if(loginButton.getText().equals("Login")) {
                PreparedStatement ps;
                ResultSet resultSet;
                boolean accountVerification = false;
                String query = "select * from account";
                try {
                    ps = con.prepareStatement(query);
                    resultSet = ps.executeQuery();
                    while (resultSet.next()) {
                        String fetchUsername = resultSet.getString("username");
                        String fetchPassword = resultSet.getString("password");
                        if (fetchUsername.equals(usernameTextField.getText()) && fetchPassword.equals(String.valueOf(passwordField.getPassword())))
                            accountVerification = true;
                    }
                    if(accountVerification) {
                        //System.out.println("Login Successfully");
                        clearForm();
                        verificationMessageLabel.setText("Login Successfully");
                        verificationMessageLabel.setForeground(Color.GREEN);
                        loginButton.setText("Admin Dashboard");
                        usernameLabel.setEnabled(false);
                        passwordLabel.setEnabled(false);
                        usernameTextField.setEnabled(false);
                        passwordField.setEnabled(false);
                    } else {
                        //System.out.println("Incorrect username or password");
                        verificationMessageLabel.setText(" * Incorrect username or password");
                        verificationMessageLabel.setForeground(Color.RED);
                        clearForm();
                        bornStageForm();
                    }
                    //System.out.println(accountVerification?"Login Successfully":"Incorrect username or password");
                } catch (SQLException sqlException) {
                    System.out.println(sqlException.getMessage());
                }
            } else {
                mainFrame.dispose();
                new HomePage();
                /*loginButton.setBackground(Color.GRAY);
                loginButton.setForeground(Color.WHITE);
                verificationMessageLabel.setText("Admin Dashboard Under Construction");
                verificationMessageLabel.setForeground(Color.BLUE);
                loginButton.setEnabled(false);
                System.out.println("Admin Dashboard Under Construction");**/
            }
        }
    }

    void clearForm() {
        usernameTextField.setText("");
        passwordField.setText("");
    }

    void bornStageForm(){
        passwordLabel.setEnabled(false);
        passwordField.setEnabled(false);
        loginButton.setEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /*if(e.getSource() == usernameTextField) {
            passwordLabel.setEnabled(usernameTextField.getText().length() >= 2);
        }**/
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource() == usernameTextField) {
            passwordField.setEnabled(usernameTextField.getText().length() > 2);
            passwordLabel.setEnabled(usernameTextField.getText().length() > 2);
            loginButton.setEnabled(usernameTextField.getText().length() > 2);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == usernameTextField) {
            passwordField.setEnabled(usernameTextField.getText().length() > 2);
            passwordLabel.setEnabled(usernameTextField.getText().length() > 2);
            loginButton.setEnabled(usernameTextField.getText().length() > 2);
        }
    }
}
