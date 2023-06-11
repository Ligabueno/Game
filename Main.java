import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
public class Main {

    int sek = 0;
    public static Dimension frameSize;
   public static Timer gameTimer;
    int fps = 1000/60;


    public static void main(String[] args) {

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize = new Dimension(d.width/2,d.height/2);





        new Gamepanel();

    }
}