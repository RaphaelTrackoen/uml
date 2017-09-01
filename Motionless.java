

public class Motionless extends Agents{
    private String name;
    
    public Motionless()
    {
        super();
        name = "";
    }
    
    public Motionless(String name)
    {
        super(false);
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}