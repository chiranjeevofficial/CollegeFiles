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
    private final JTextField[] studentInfoTextField = new JTextField[5];
    JComboBox<String> courseComboBox;
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
        String[] course = {"Select the course","B.Sc IT","B.A","B.Com","B.Sc FT","B.A. Yoga","B.Sc Home Science"};
        courseComboBox = new JComboBox<>(course);
        courseComboBox.setSelectedIndex(0);
        courseComboBox.setBounds(120,71,200,27);
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
            if (i<5) { // overtake the ArrayIndexOutOfBoundsException
                textFieldY+=i==2?30:0;
                textFieldY+=i==3?30:0;
                studentInfoTextField[i] = new JTextField(20);
                studentInfoTextField[i].setBounds(120, textFieldY, 200, 30);
                studentPanel.add(studentInfoTextField[i]);
                textFieldY += 30;
            }
            y += studentInfoLabel[i].getHeight();
        }
        studentInfoTextField[2].addKeyListener(this);
        studentInfoTextField[3].addKeyListener(this);
        submitButton.setBounds(studentInfoTextField[4].getX(),studentInfoTextField[4].getY()+35,90,30);
        clearButton.setBounds(submitButton.getX()+110, submitButton.getY(),90,30);
        studentPanel.add(courseComboBox);
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
        std.setCourse(courseComboBox.getItemAt(courseComboBox.getSelectedIndex()));
        std.setAge(Integer.parseInt(studentInfoTextField[2].getText()));
        std.setGender(getGenderSelected());
        std.setPhoneNumber(studentInfoTextField[3].getText());
        std.setAddress(studentInfoTextField[4].getText());
        System.out.println(std);
    }

    public void clearStudentForm() {
        for (int i = 0 ; i < 5; i++)
            studentInfoTextField[i].setText("");
        genderButtonGroup.clearSelection();
        if (courseComboBox.getSelectedIndex() != 0)
            courseComboBox.setSelectedIndex(0);
    }

    public char getGenderSelected() {
        return male.isSelected()?'M':'F';
    }

    public boolean studentFormValidation() {
        boolean validate = true;
        for (int i = 0; i < studentInfoTextField.length; i++) {
            if (i != 2 && (studentInfoTextField[i].getText().equals("") || studentInfoTextField[i].getText().length() < 3)) {
                validate = false;
                break;
            }
            if (i == 2 && (studentInfoTextField[i].getText().equals("") || studentInfoTextField[i].getText().length() < 1)) {
                validate = false;
                break;
            }
        }
        validate = validate && (male.isSelected() || female.isSelected());
        if (courseComboBox.getSelectedIndex() == 0)
            validate = false;
        System.out.println(validate ? "true" : "false");
        return validate;
    }

    public boolean generateStudentObjectQuery() {
        return false;
    }
    
    @Override
    public void actionPerformed(@NotNull ActionEvent e) {
        if (submitButton == e.getSource()) {
            if (studentFormValidation()) {
                initializeStudentObject();
                clearStudentForm();
            }
            else
                JOptionPane.showMessageDialog(null, "Please Completely fill the form", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        if (clearButton == e.getSource())
            clearStudentForm();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource() == studentInfoTextField[2]) {
            char ch = e.getKeyChar();
            if (!(Character.isDigit(ch) || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_DELETE))
                e.consume();
            if (studentInfoTextField[2].getText().length() >= 3)
                e.consume();
        }
        if (e.getSource() == studentInfoTextField[3]) {
            char ch = e.getKeyChar();
            if (!(Character.isDigit(ch) || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_DELETE))
                e.consume();
            if (studentInfoTextField[3].getText().length() >= 10)
                e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    public void keyReleased(KeyEvent e) {

    }
}