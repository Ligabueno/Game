import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Draw extends JPanel {

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    double playerSpeedSide = Math.sqrt((playerSpeed*playerSpeed)/2);

    int pSSN = playerSpeed;

    boolean startScreen = false;

    Gamepanel gp;

    Main main;

    Keyhandler k = new Keyhandler();
  
  int startX = gp.getWidth()/2;
  int startY = gp.getHeight()/2;

    public Draw() {
        addKeyListener(k);



    Main.gameTimer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k.upPressed == true) {
                playerY -= playerSpeed;
            } else if (k.downPressed == true) {
                playerY += playerSpeed;
            } else if (k.leftPressed == true) {
                playerX -= playerSpeed;
            } else if (k.rightPressed == true) {
                playerX += playerSpeed;
            }// else if (k.upPressed == true && k.leftPressed == true) {
               // playerX -= pSSN;
                //playerY -= pSSN;
            //}

            repaint();
           
        }
    });

    

    Main.gameTimer.start();


    }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

             // draw Title Screen

    g2d.setColor(Color.white);
    
       g2d.drawString("Start", 100, 100);
    

    
    


            g2d.fillRect(playerX, playerY, 50, 50);
            g2d.setColor(Color.white);
            //Rectangle2D.Double player = new Rectangle2D.Double(playerX, playerY, 50, 50);
           // g2d.setColor(Color.white);
           // g2d.fill(player);
            g2d.dispose();





        }







    }
