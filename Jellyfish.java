
import javax.swing.ImageIcon;


public class Jellyfish extends Motion{
    private int food_level;
    private int satiety;
    private int life;
    private final int birthDelay = 0;
    private ImageIcon img;
    
    public Jellyfish()
    {
        super("Jellyfish");
        this.food_level = 10;
        this.satiety = 15;
        this.life = 0;
        img = new ImageIcon("meduse.png");
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
}