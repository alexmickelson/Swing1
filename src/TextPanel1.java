import javax.swing.*;
import java.awt.*;

public class TextPanel1 extends JPanel {

    private  JTextArea textArea;

    public TextPanel1(){
        textArea = new JTextArea();

        setLayout(new BorderLayout());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String string){
            textArea.append(string);
    }
}
