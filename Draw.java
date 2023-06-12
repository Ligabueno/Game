import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Draw extends JPanel {
    Main main;
    Gamepanel gp;

    Keyhandler k = new Keyhandler();

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    int playerWidth = 50, playerHeight = 50;


    String start = "Start";
    String settings = "Settings";
    String quit = "Quit";
    Font font = getFont().deriveFont(Font.PLAIN, 80);





  int startX = main.frameSize.width/2 - 110;
  int startY = main.frameSize.height/2 ;

  int settingsY = startY + main.frameSize.height/6;
  int settingsX = startX - 50;

  int quitX = startX + 15;
  int quitY = settingsY + main.frameSize.height/6;

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
            }
            if (playerX <= 0){
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

            System.out.println(main.frameSize.width);
            System.out.println(playerX+"|"+playerY);
            repaint();
           
        }
    });




    Main.gameTimer.start();


    }



        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;




            g2d.setColor(Color.white);
            g2d.setFont(font);
            g2d.drawString(start, startX, startY);


            g2d.drawString(settings, settingsX, settingsY);
            g2d.drawString(quit,quitX,quitY);
    



            g2d.fillRect(playerX, playerY, playerWidth, playerHeight);
            g2d.setColor(Color.white);
            g2d.dispose();





        }






    }
