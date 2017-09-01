
public class Motion extends Agents{
    private String name;
    
    public Motion()
    {
        super();
        name = "";
    }
    
    public Motion(String name)
    {
        super(true);
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