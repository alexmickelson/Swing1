import javax.swing.*;
import javax.swing.border.Border;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private TextPanel1 textPanel;
    private JButton btn;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World");

        setLayout(new BorderLayout());

        textPanel = new TextPanel1();
        btn  = new JButton( "Click Me!");
        toolbar = new Toolbar();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn , BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setVisible(true);

    }
}
