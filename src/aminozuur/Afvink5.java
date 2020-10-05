package aminozuur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvink5 extends JFrame implements ActionListener {

    private JTextField textin;
    private JTextField textuit;
    private JLabel label;
    private JButton knop;


    public static void main(String[] args) throws InterruptedException {
        Afvink5 frame = new Afvink5();
        frame.setSize(500, 500);
        frame.createGui();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void createGui() throws InterruptedException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        label = new JLabel("Vul de eenletter code van de aminozuren in en krijg de 3 letterige code.");
        window.add(label);

        textin = new JTextField("1 lettercode", 40);
        window.add(textin);

        knop = new JButton("Translate");
        knop.addActionListener(this);
        window.add(knop);

        textuit = new JTextField("3 lettercode", 40);
        window.add(textuit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        for (int i = 0; i < (textin.getText().length(); i++) {
//            aminozuur.Translator.one2three(str.textin.getText().charAt(i));
            //textuit.setText(textin.getText());
        }
    }
}
