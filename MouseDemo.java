import java.awt.*;      //Abstract Window Toolkit
import java.awt.event.*;
public class MouseDemo extends Frame 
        implements MouseListener, MouseMotionListener 
        {
    Label l;
    // Constructor
    MouseDemo() 
    {
        l = new Label();
        l.setBounds(20, 50, 250, 20);
        // Register events
        addMouseListener(this);
        addMouseMotionListener(this);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    // MouseListener methods
    public void mouseClicked(MouseEvent e) 
    {
        l.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e) 
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) 
    {
        l.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e) 
    {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) 
    {
        l.setText("Mouse Exited");
    }
    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) 
    {
        l.setText("Moving: " + e.getX() + "," + e.getY());
    }
    public void mouseDragged(MouseEvent e) 
    {
        l.setText("Dragging: " + e.getX() + "," + e.getY());
    }
    public static void main(String[] args) 
    {
        new MouseDemo();
    }
}
