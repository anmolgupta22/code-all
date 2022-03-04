// importing Java AWT class  
import java.awt.*;

// extending Frame class to our class AWTExample1  
public class Progrm3 extends Frame {

    // initializing using constructor
    Progrm3() {

        // creating a button
        Button b = new Button("Click Me!!");
        Label l1 = new Label("F value");
        Label l2 = new Label("c value");
        TextArea t1 = new TextArea();
        TextArea t2 = new TextArea();
        // setting button position on screen
        b.setBounds(30,100,80,30);
        l1.setBounds(30,150,100,10);
        l2.setBounds(30,200,100,10);
        t1.setBounds(30,250,100,10);
        t2.setBounds(30, 300,100,10);
        // adding button into frame
        add(b);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        // frame size 300 width and 300 height
        setSize(300,300);

        // setting the title of Frame
        setTitle("This is our basic AWT example");

        // no layout manager
        setLayout(null);

        // now frame will be visible, by default it is not visible
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {

// creating instance of Frame class   
        Progrm3 f = new Progrm3();

    }

}