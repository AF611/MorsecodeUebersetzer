import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MorsecodeUI {
    private JPanel jpanel;
    private JLabel jLabelÜberschrift;
    private JTextField textFieldEingabe;
    private JTextField textFieldAusgabe;
    private JButton übersetzenButton;
    private JLabel jLabelText;
    private JLabel jLabelAusgabe;

    public MorsecodeUI(){


        übersetzenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Übersetzt");
            }
        });
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
