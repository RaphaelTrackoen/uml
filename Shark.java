
import javax.swing.ImageIcon;


public class Shark extends Motion{
    private int food_level;
    private int satiety;
    private int life;
    private final int birthDelay = 5;
    private ImageIcon img;
    private int direction;
    
    public Shark()
    {
        super("Shark");
        this.food_level = 10;
        this.satiety = 15;
        this.life = 0;
        img = new ImageIcon("requinRL.png");
        direction = 1;
    }

    public String getSpecie() {
            return super.getName();
    }

    public void setSpecie(String specie) {
            super.setName(specie);
    }

    public int getFood_level() {
            return food_level;
    }

    public void setFood_level(int food_level) {
            this.food_level = food_level;
    }

    public int getSatiety() {
            return satiety;
    }

    public void setSatiety(int satiety) {
            this.satiety = satiety;
    }

    public int getLife() {
            return life;
    }

    public void setLife(int life) {
            this.life = life;
    }

    public int getbirthDelay() {
            return birthDelay;
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
            setImg("requinLR.png");
        }
        else
        {
            setImg("requinRL.png");
        }
    }
    
    public int getDirection()
    {
        return direction;
    }
}