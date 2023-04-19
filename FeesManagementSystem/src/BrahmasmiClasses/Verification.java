package BrahmasmiClasses;

import javax.swing.*;

public class Verification {
    public static boolean validateLoginForm(JTextField username, JPasswordField password, int lengthOfString) {
        return username.getText().length() >= lengthOfString && password.getPassword().length >= lengthOfString;
    }
}
