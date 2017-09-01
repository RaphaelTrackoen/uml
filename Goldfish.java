
import javax.swing.ImageIcon;

public class Goldfish extends Motion{
    private ImageIcon img;
    private int direction;
    
    public Goldfish()
    {
        super("Goldfish");
        img = new ImageIcon("poissonRL.png");
        direction = 1;
    }
    
    public String getSpecie() {
            return super.getName();
    }

    public void setSpecie(String specie) {
            super.setName(specie);
    }

    public ImageIcon getImg()
    {
        return img;
    }
    
    public void setImg(String url)
    {
        img = new ImageIcon(url);
    }
    
    public void setDirection(int d)
    {
        direction = d;
        if(d == -1)
        {
            setImg("poissonLR.png");
        }
        else
        {
            setImg("poissonRL.png");
        }
    }
    
    public int getDirection()
    {
        return direction;
    }
}