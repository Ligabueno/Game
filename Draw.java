import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Draw extends JPanel {
    Main main;


    Keyhandler k = new Keyhandler();

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    int playerWidth = 50, playerHeight = 50;

    int startX = main.frameSize.width/2 - 110;
    int startY = main.frameSize.height/2 ;

    int settingsY = startY + main.frameSize.height/6;
    int settingsX = startX - 50;

    int quitX = startX + 15;
    int quitY = settingsY + main.frameSize.height/6;

    int startRectX = startX + 4;
    int startRectY = startY - 60;
    int startRectW = 164;
    int startRectH = 61;
    int settingsRectX = settingsX + 4;
    int settingsRectY = settingsY - 60;
    int settingsRectW = 282;
    int settingsRectH = 77;
    int quitRectX = quitX + 4;
    int quitRectY = quitY - 60;
    int quitRectW = 142;
    int quitRectH = 64;



    String start = "Start";
    int startS = 80;
    int settingsS = 80;
    int quitS = 80;
    String settings = "Settings";
    String quit = "Quit";


    Font startF = getFont().deriveFont(Font.PLAIN, startS);
    Font settingsF = getFont().deriveFont(Font.PLAIN, settingsS);
    Font quitF = getFont().deriveFont(Font.PLAIN, quitS);






    public Draw() {
        addKeyListener(k);




    Main.gameTimer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {                          //Steruerung
            if (k.upPressed == true) {
                playerY -= playerSpeed;
            } else if (k.downPressed == true) {
                playerY += playerSpeed;
            } else if (k.leftPressed == true) {
                playerX -= playerSpeed;
            } else if (k.rightPressed == true) {
                playerX += playerSpeed;
            }


            if (playerX <= 0){                                                      // Sorgt dafür, das der Spieler nicht aus dem Sichtfeld läuft.
                playerX = 0;
            }
            if (playerY <= 0) {
                playerY = 0;
            }
            if (playerX >= main.frameSize.width-playerWidth) {
                playerX = main.frameSize.width-playerWidth;
            }
            if (playerY >= main.frameSize.height-playerHeight) {
              playerY = main.frameSize.height-playerHeight;
            }

            //System.out.println(playerX+"|"+playerY);


            repaint();
           
        }
    });




    Main.gameTimer.start();


    }
    



        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;





            g2d.setColor(new Color(34, 35,35));
            Rectangle2D.Double startRect = new Rectangle2D.Double(startRectX,startRectY,startRectW,startRectH);
            Rectangle2D.Double settingsRect = new Rectangle2D.Double(settingsRectX, settingsRectY, settingsRectW,settingsRectH);
            Rectangle2D.Double quitRect = new Rectangle2D.Double(quitRectX,quitRectY,quitRectW,quitRectH);


            g2d.setColor(new Color(240,246,240));
            g2d.setFont(startF);
            g2d.drawString(start, startX, startY);
            g2d.setFont(settingsF);
            g2d.drawString(settings, settingsX, settingsY);
            g2d.setFont(quitF);
            g2d.drawString(quit,quitX,quitY);


            Rectangle2D.Double player = new Rectangle2D.Double(playerX, playerY, playerWidth, playerHeight);
            g2d.fill(player);
            // g2d.fillRect(playerX, playerY, playerWidth, playerHeight);


            if (player.intersects(startRect)){

                startS += 1;
                System.out.println(startS);
                repaint();

            }
            if (player.intersects(settingsRect)){

                settingsS += 1;
                repaint();

            }
            if (player.intersects(quitRect)){

                quitS += 1;
                repaint();

            }

            g2d.dispose();



        }






    }
