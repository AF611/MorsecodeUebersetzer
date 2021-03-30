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
    private char a;

    String[] morsezeichen = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.", "--.." };

    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public MorsecodeUI(){
        übersetzenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                morseZeichenZuweisen();
            }
        });
    }

    public char morseZeichenZuweisen() {
        //Eingabetext soll analysiert werden
        String eingabe = textFieldEingabe.getText();
        for(int i = 0; i < eingabe.length(); i++){
                char c = eingabe.charAt(i);

            }
        return 0;
    }

        //Zuweisung Buchstabe --> Morsecode
    public void buchstabenZuweisen(char c){
        for(int i = 0; i < alphabet.length - 1; i++) {
            if(c == alphabet[i]){
                System.out.println(morsezeichen[i]);
            }
        }
    }



    public static void main (String[] args){
        JFrame frame = new JFrame("Morsecode");
        frame.setContentPane(new MorsecodeUI().jpanel);

        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
