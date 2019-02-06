import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton btn1;
    private JButton btn2;

    private IStringListener textListener;

    public Toolbar(){

        btn1 = new JButton("Hello");
        btn2 = new JButton("Goodbye");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        btn1.addActionListener(this);
        btn2.addActionListener(this);


        add(btn1);
        add(btn2);
    }

    public void setStringListener(IStringListener listener) {
        textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if (clicked == btn1){
           if(textListener != null){
               textListener.textEmitted("Hello");
           }
    }
        else {
            if(textListener != null){
                textListener.textEmitted("Goodbye");
            }
        }
    }
}
