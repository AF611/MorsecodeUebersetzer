import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MorsecodeUI {
    private JPanel jpanel;
    private JLabel jLabelÜberschrift;
    private JTextField textFieldAusgabe;
    private JButton übersetzenButton;
    private JLabel jLabelText;
    private JLabel jLabelAusgabe;
    private JTextField textFieldEingabe;

    public MorsecodeUI(){


        übersetzenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                morseZeichenZuweisen();
            }
        });
    }

    public void morseZeichenZuweisen(){
        String[] morsezeichen = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.", "--.."};

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String str = textFieldEingabe.getText();

        for(int i = 0; i < str.length(); i++){

        }
        morsezeichen [1] = alphabet[1];
        textFieldAusgabe.setText("Hallo");
    }


    public static void main (String[] args){
        JFrame frame = new JFrame("Morsecode");
        frame.setContentPane(new MorsecodeUI().jpanel);

        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
