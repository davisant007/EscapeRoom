import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class EscapeRoom  {
    static JPanel panel;
    JRadioButton door1, door2, door3, door4;
    static ButtonGroup radios = new ButtonGroup;
    public static void main(String[] args) {

    }
    public EscapeRoom(){
        JFrame window = new JFrame("Escape room");
        JPanel panel = new JPanel();

        window.setSize(600,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(panel);

        window.setVisible(true);

        door1 = new JRadioButton("open door 1");
        door2 = new JRadioButton("open door 2");
        door3 = new JRadioButton("open door 3");
        door4 = new JRadioButton("open door 4");

        radios.add(door1);
        radios.add(door2);
        radios.add(door3);
        radios.add(door4);

        panel.setLayout(null);
        panel.add(door1);
        panel.add(door2);
        panel.add(door3);
        panel.add(door4);
    }

}

