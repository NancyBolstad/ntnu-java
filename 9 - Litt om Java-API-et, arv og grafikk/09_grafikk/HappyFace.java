import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class HappyFace extends JApplet{
    public void paint (Graphics face){
        face.setColor(Color.MAGENTA);
        face.drawOval(100,50,200,200);
        face.fillOval(155,100,10,20);
        face.fillOval(230,100,10,20);
        face.drawArc(150,160,100,50,180,180);
        face.setColor(Color.MAGENTA);
        face.drawString("Hi, I'm a smiley face!", 280,50);
    }
    
    public static void addAppletToFrame(JApplet applet)
    {
        JFrame frame = new JFrame("Smiley!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.setSize(400, 400);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        HappyFace happyFace = new HappyFace();
        addAppletToFrame(happyFace);
    }
}