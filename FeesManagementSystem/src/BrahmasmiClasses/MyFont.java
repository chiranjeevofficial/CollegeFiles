package BrahmasmiClasses;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class MyFont {
    public static final Font titleFont = new Font("Century Gothic", Font.BOLD,25),
            labelHeaderFont = new Font("Century Gothic",Font.BOLD,40),
            textFieldFont = new Font("MS Reference Sans Serif",Font.PLAIN,20);

    public static final Border underline = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK),
            allSideBorder = BorderFactory.createLineBorder(Color.BLACK,1);

    public static final Color blueColor = new Color(0, 55, 255),
            purpleColor = new Color(183,0,255),
            pinkColor = new Color(255, 0, 183),
            whiteColor = new Color(255,255,255),
            orangeColor = new Color(255,152,0);

    public static void loginButtonDecoration(JButton button) {
        button.setFocusable(false);
        button.setFont(MyFont.textFieldFont);
        button.setOpaque(true);
        button.setBackground(purpleColor);
        button.setForeground(Color.WHITE);
        button.setBorder(MyFont.allSideBorder);
    }

    public static void labelTextDecoration(JLabel label) {
        label.setForeground(Color.BLACK);
        label.setFont(MyFont.labelHeaderFont);
        label.setOpaque(true);
    }

    public static void labelTextDecoration(JLabel label, boolean opaque) {
        label.setForeground(Color.BLACK);
        label.setFont(MyFont.labelHeaderFont);
        label.setOpaque(opaque);
    }

    public static void headerTextDecoration(JLabel label) {
        label.setForeground(Color.BLACK);
        label.setFont(MyFont.titleFont);
        label.setOpaque(true);
    }

    public static void verificationLabelDecoration(JLabel label) {
        label.setFont(MyFont.textFieldFont);
        MyFont.setLabelOnCenter(label,0,350,600,40);
    }

    public static void textFieldDecoration(JTextField textField) {
        textField.setForeground(Color.black);
        textField.setOpaque(false);
        textField.setBorder(MyFont.underline);
        textField.setFont(MyFont.textFieldFont);
    }

    public static void setLabelOnCenter(JLabel label, int width, int height) {
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setSize(width,height);
    }

    public static void setLabelOnCenter(JButton label, int x, int y, int width, int height) {
        label.setSize(width,height);
        label.setLocation(x,y);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
    }

    public static void setLabelHighlighted(JLabel label) {
        label.setBackground(Color.YELLOW);
        label.setOpaque(true);
    }

    public static void setLabelHighlighted(JLabel label, Color color) {
        label.setBackground(color);
        label.setOpaque(true);
    }

    public static void setLabelHighlighted(JButton label, Color color) {
        label.setBackground(color);
        label.setOpaque(true);
    }

    public static void setLabelOnCenter(JLabel label, int x, int y, int width, int height) {
        label.setLocation(x,y);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setSize(width,height);
    }



    /*public static void setYellowBackgroundAndBottomBorder(JLabel label) {
        label.setBorder(MyFont.underline);
        label.setBackground(Color.YELLOW);
        label.setOpaque(true);
    }**/

    /*public static void setMyFont(JTextField textField) {
        textField.setFont(MyFont.textField);
    }**/

    /*public static Color generateGradientColor(Color color1, Color color2, int width, int height) {
        GradientPaint gradient = new GradientPaint(10, 50, color1, width, height, color2);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, width, height);
        //g2d.dispose();
        return new Color(image.getRGB(0, 0));
    }**/
}
