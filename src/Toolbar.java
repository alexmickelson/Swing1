import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {

    private JButton btn1;
    private JButton btn2;


    public Toolbar(){

        btn1 = new JButton("Hello");
        btn2 = new JButton("Goodbye");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(btn1);
        add(btn2);
    }
}
