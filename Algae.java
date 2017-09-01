
import javax.swing.ImageIcon;

public class Algae extends Motionless{
    private ImageIcon img;
    
    public Algae()
    {
        super("Algae");
        img = new ImageIcon("algue.png");
    }
    
    public ImageIcon getImage()
    {
        return img;
    }
}