import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

class MouseEventsDemo implements MouseListener, MouseMotionListener {

    public MouseEventsDemo() {
        JFrame frame = new JFrame("Mouse Events Demonstration");
        frame.setSize(300, 200);
        frame.setTitle("Mouse Events Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }
}

public class Program_09 {
    public static void main(String[] args) {
        new MouseEventsDemo();
    }
}
