
public class Agents {
    private boolean canMove;
    
    public Agents()
    {
        canMove = false;
    }
    
    public Agents(boolean canMove)
    {
        this.canMove = canMove;
    }
    
    public boolean getCanMove()
    {
        return canMove;
    }
    
    public void setCanMove(boolean canMove)
    {
        this.canMove = canMove;
    }
}