import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Smiley extends JApplet
{
    public static final int FACE_DIAMETER = 200;
    public static final int X_FACE = 100;
    public static final int Y_FACE = 50;

    public static final int EYE_WIDTH = 10;
    public static final int EYE_HEIGHT = 20;
    public static final int X_RIGHT_EYE = 155;
    public static final int Y_RIGHT_EYE = 95;
    public static final int X_LEFT_EYE = 230;
    public static final int Y_LEFT_EYE = Y_RIGHT_EYE;

    public static final int Y_NOSE = 135;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = 100;
    public static final int Y_MOUTH = 50;
    public static final int MOUTH_DEGREES_SHOWN = 180;
    
    public int noseDiameter = 10;         // initial value of the nose's diameter
    public int xNose = 195;               // initial value of the nose's x-position
    public int mouthStartAngle = 180;     // initial start angle of the mouth's arc
    public Color eyeColor = Color.BLACK;  // initial eye color

    public void paint(Graphics graphics)
    {
        // Draw face circle:
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);

        // Draw eyes:
        graphics.setColor(eyeColor);
        graphics.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        graphics.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);

        // Draw nose:
        graphics.setColor(Color.BLACK);
        graphics.fillOval(xNose, Y_NOSE, noseDiameter, noseDiameter);

        // Draw mouth:
        graphics.setColor(Color.RED);
        graphics.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH, MOUTH_HEIGHT,
            mouthStartAngle, MOUTH_DEGREES_SHOWN);
    }
    
    public void modifyFace()
    {
        String inputString;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which would you like to change?\nMOUTH, NOSE, or EYES");
        inputString = keyboard.nextLine();

        // your code goes here, you do not have to modify any code before this point



        // you do not have to modify code after this point
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
        Smiley smiley = new Smiley();
        smiley.modifyFace();
        
        addAppletToFrame(smiley);
    }
}