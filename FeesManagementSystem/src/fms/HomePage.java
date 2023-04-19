package fms;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HomePage implements ActionListener, KeyListener {
    private final JTabbedPane mainTabbedPanel = new JTabbedPane();
    private final JFrame mainFrame = new JFrame("Home Page");
    private JPanel studentPanel;
    private final JLabel[] studentInfoLabel = new JLabel[7];
    private final JTextField[] studentInfoTextField = new JTextField[6];
    ButtonGroup genderButtonGroup;
    private JRadioButton male, female;
    private final JButton submitButton = new JButton("Submit");
    private final JButton clearButton = new JButton("Clear");

    // Non-Parameterized Constructor
    public HomePage() {
        initializeMainPanel();
        initializeMainFrame();
    }

    void initializeMainPanel() {
        mainTabbedPanel.setSize(380,360);
        studentPanel = new JPanel(null);
        JPanel teacherPanel = new JPanel(null), feesPanel = new JPanel(null);
        initializeNewStudentFormPanel();
        mainTabbedPanel.add("Student", studentPanel);
        mainTabbedPanel.add("Teacher",teacherPanel);
        mainTabbedPanel.add("Fees", feesPanel);
    }

    // initialize Main-Frame
    void initializeMainFrame() {
        mainFrame.setLayout(null);
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
        // open application to center on the screen
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(mainTabbedPanel);
    }

    void initializeNewStudentFormPanel() {
        genderButtonGroup = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);
        male.setBounds(120,130,100,30);
        female.setBounds(220,130,100,30);
        studentPanel.add(male);
        studentPanel.add(female);

        String[] labelNames = {"Student Name", "Father Name", "Course", "Age", "Gender", "Phone Number", "Address"};
        int y = 10, textFieldY = 10;
        for (int i = 0; i < 7; i++) {
            studentInfoLabel[i] = new JLabel(labelNames[i]);
            studentInfoLabel[i].setBounds(10, y, 100, 30);
            studentPanel.add(studentInfoLabel[i]);
            if (i<6) { // overtake the ArrayIndexOutOfBoundsException
                textFieldY+=i==4?30:0;
                studentInfoTextField[i] = new JTextField(20);
                studentInfoTextField[i].setBounds(120, textFieldY, 200, 30);
                studentPanel.add(studentInfoTextField[i]);
                textFieldY += 30;
            }
            y += studentInfoLabel[i].getHeight();
        }
        studentInfoTextField[3].addKeyListener(this);
        submitButton.setBounds(studentInfoTextField[5].getX(),studentInfoTextField[5].getY()+35,90,30);
        clearButton.setBounds(submitButton.getX()+110, submitButton.getY(),90,30);
        studentPanel.add(submitButton);
        studentPanel.add(clearButton);
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    public void initializeStudentObject() {
        Student std = new Student();
        std.setStudentId(0);
        std.setStudentName(studentInfoTextField[0].getText());
        std.setFatherName(studentInfoTextField[1].getText());
        std.setCourse(studentInfoTextField[2].getText());
        try {
            std.setAge(Integer.parseInt(studentInfoTextField[3].getText()));
        } catch (NumberFormatException e) {
            return; // Stop processing the student object creation
        }
        std.setGender(getGenderSelected());
        std.setPhoneNumber(studentInfoTextField[4].getText());
        std.setAddress(studentInfoTextField[5].getText());
        System.out.println(std);
    }

    public void clearStudentForm() {
        for (int i = 0 ; i < 6 ; i++)
            studentInfoTextField[i].setText("");
        genderButtonGroup.clearSelection();
    }

    public char getGenderSelected() {
        return male.isSelected()?'M':'F';
    }

    public boolean studentFormValidation() {
        boolean validate = true;
        for (int i = 0; i < 6; i++) {
            if (studentInfoTextField[i].getText().equals("") || studentInfoTextField[i].getText().length() < 3) {
                validate = false;
                break;
            }
        }
        validate = validate && (male.isSelected() || female.isSelected());
        System.out.println(validate ? "true" : "false");
        return validate;
    }
    
    @Override
    public void actionPerformed(@NotNull ActionEvent e) {
        if (submitButton == e.getSource()) {
            /*if (studentFormValidation()) {
                clearStudentForm();
                System.out.println("Form Submitted");
            }
            else
                JOptionPane.showMessageDialog(null, "Please Completely fill the form", "Alert", JOptionPane.WARNING_MESSAGE);**/
            if(studentFormValidation())
               clearStudentForm();
        }
        if (clearButton == e.getSource())
            clearStudentForm();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource() == studentInfoTextField[3]) {
            char ch = e.getKeyChar();
            if (!(Character.isDigit(ch) || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_DELETE))
                e.consume();
            if (studentInfoTextField[3].getText().length() >= 3)
                e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    public void keyReleased(KeyEvent e) {

    }
}