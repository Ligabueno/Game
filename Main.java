import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
public class Main {


    // Idee für das Spiel:
    //Man kann in den Settings die Farben ändern und umdrehen
    // diese bestehen aus 1-Bit Farben

    //Secret im Hauptmenü:
    //unten rechts kann man aus dem Bildschirm und kommt in einen neuen
    // secret mit Link


    public static Dimension frameSize;
   public static Timer gameTimer;
   public static Timer bTimer;
    int fps = 1000/60;
    int sek = 0;

    public static void main(String[] args) {

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frameSize = new Dimension(d.width/2,d.height/2);





        new Gamepanel();

    }
}