import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gamepanel extends JFrame{


    Draw draw = new Draw();

    Main main;

    public Gamepanel() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(draw);
        draw.setPreferredSize(new Dimension(main.frameSize));
        draw.setBackground(Color.black);

        draw.setFocusable(true);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);







        }

    }




