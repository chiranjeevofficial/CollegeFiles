import javax.swing.*;

class MyTable {
    public MyTable() {
        JFrame frame = new JFrame("JTable Demonstration");
        String[] column = {
                "ID",
                "Name",
                "Salary"
        };

        String[][] data = {
                {"101", "Aman", "11000"},
                {"102", "Amit", "13000"},
                {"103", "Saumya", "15000"}
        };

        JTable table = new JTable(data, column);
        table.setBounds(0,0,270,270);
        JScrollPane jScrollPane = new JScrollPane(table);
        frame.add(jScrollPane);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}

public class Program_07 {
    public static void main(String[] args) {
        new MyTable();
    }
}
