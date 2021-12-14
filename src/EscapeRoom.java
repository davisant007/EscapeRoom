import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscapeRoom  {
    static JPanel panel;
    static JFrame frame;
    JRadioButton drawer, cabinet, door, clock,bed ;
    static ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {
        new EscapeRoom();
    }

    public EscapeRoom(){
        frame  = new JFrame("Escape room");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();

        bed = new JRadioButton("look under bed");
        drawer = new JRadioButton("open drawer");
        cabinet = new JRadioButton("open cabinet");
        door = new JRadioButton("open door ");
        clock = new JRadioButton("touch clock");

        radios.add(bed);
        radios.add(drawer);
        radios.add(cabinet);
        radios.add(door);
        radios.add(clock);

        panel.add(drawer);
        panel.add(cabinet);
        panel.add(door);
        panel.add(clock);
        panel.add(bed);

        frame.add(panel);
        frame.setVisible(true);

    }

}

