import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class SmileyDemo extends JFrame{
    
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    
    public static final int FACE_WIDTH = 400;
    public static final int FACE_HEIGHT = 400;
    public static final int FACE_X = 200;
    public static final int FACE_Y = 100;

    public static final int EYE_WIDTH = 50;
    public static final int EYE_HEIGHT = EYE_WIDTH;
    public static final int X_RIGHT_EYE = 300;
    public static final int Y_RIGHT_EYE = 250;
    public static final int X_LEFT_EYE = 430;
    public static final int Y_LEFT_EYE = 250;

    public static final int MOUTH_WIDTH = 100;
    public static final int MOUTH_HEIGHT = 50;
    public static final int X_MOUTH = 350;
    public static final int Y_MOUTH = 400;
    public static final int MOUTH_DEGREES_SHOWN = 180;
    
    public static final int X_ITERATOR = 180;
    public static final int Y_ITERATOR = 650;
    
    
    /*
    Reffered to "Java - GUI - Random Characters in Different Sizes, Colors" 
    https://stackoverflow.com/questions/27261736/java-gui-random-characters-in-different-sizes-colors
    */
   
   //Return a String array of font names. 
   public static final String[] FONT_NAME = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
   
   //Generate a random value between 0 and array length
   int index = (int)(Math.random() * (FONT_NAME.length - 1));
   
   //Extract the required font name
    String FONT_RAN = FONT_NAME[index];
    
    public static final int FONT_SIZE=48;
    
    
    public void paint (Graphics face){
        
        face.setColor(Color.yellow);
        face.fillOval(FACE_X,FACE_Y,FACE_WIDTH,FACE_HEIGHT);
        face.setColor(Color.black);
        face.fillOval(X_RIGHT_EYE,Y_RIGHT_EYE,EYE_WIDTH,EYE_HEIGHT);
        face.fillOval(X_LEFT_EYE,Y_LEFT_EYE,EYE_WIDTH,EYE_HEIGHT);
        face.setColor(Color.red);
        face.fillArc(X_MOUTH,Y_MOUTH,MOUTH_WIDTH,MOUTH_HEIGHT,MOUTH_DEGREES_SHOWN,MOUTH_DEGREES_SHOWN);
        face.setColor(Color.blue);
        face.setFont(new Font(FONT_RAN, Font.BOLD, FONT_SIZE));
        face.drawString("Hi, I'm a smiley face!", X_ITERATOR,Y_ITERATOR);
    }
    
    public static void main(String[] args)
    {
        SmileyDemo drawing = new SmileyDemo( );
        drawing.setVisible(true);
    }

    public SmileyDemo( )
    {
        super("Demo"); 
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane( ).setBackground(Color.white);
    }
}

