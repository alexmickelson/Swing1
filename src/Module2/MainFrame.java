package Module2;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TextPanel1 textPanel;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World");

        setLayout(new BorderLayout());

        textPanel = new TextPanel1();
        toolbar = new Toolbar();


        toolbar.setStringListener(new IStringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });


        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setVisible(true);

    }
}
