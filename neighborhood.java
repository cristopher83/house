import java.util.ArrayList;
import java.util.List;

public class neighborhood
{
    private List <street> st;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;
    /*List <street> st = new ArrayList<>();*/

    public static  void main(String []args)
    {

    }

    public List<street> getStreets() {
        return st;
    }
    public void setStreets(List <street> st)
    {
        this.st=st;
    }

    public  int getGardens()
    {
        return gardens;
    }
    public void setGardens(int gardens)
    {
        this.gardens=gardens;
    }

    public boolean getBasket()
    {
        return basketballCourt;
    }
    public void setBasketballCourt(boolean basketballCourt)
    {
        this.basketballCourt=basketballCourt;
    }

    public boolean getfutball()
    {
        return footballCourt;
    }
    public void setFutballCourt(boolean futballCourt)
    {
        this.footballCourt=futballCourt;
    }

    public boolean getSwimmingPool()
    {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool)
    {
        this.swimmingPool=swimmingPool;
    }
}
