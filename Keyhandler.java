import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyhandler implements KeyListener {
    Main main;
    boolean upPressed, downPressed, leftPressed, rightPressed, escPressed, spacePressed;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (KeyEvent.VK_W == e.getKeyCode()) {
            upPressed = true;
           // System.out.println("true");
        }
        if (KeyEvent.VK_A == e.getKeyCode()) {
            leftPressed = true;
        }
        if (KeyEvent.VK_S == e.getKeyCode()) {
            downPressed = true;

        }
        if (KeyEvent.VK_D == e.getKeyCode()) {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (KeyEvent.VK_W == e.getKeyCode()){
            upPressed = false;
            //System.out.println("false");
        }

        if (KeyEvent.VK_A == e.getKeyCode()){
            leftPressed = false;
        }
        if (KeyEvent.VK_S == e.getKeyCode()){
            downPressed = false;
        }
        if (KeyEvent.VK_D == e.getKeyCode()){
            rightPressed = false;
        }
    }
}
