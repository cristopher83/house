import java.util.Scanner;

public class house {

    private kitchen kitchen1 = new kitchen();
    private LivingRoom LivingRoom1 = new LivingRoom();
    private DiningRoom DinningRoom1 = new DiningRoom();
    private RestRoom RestRoom1 = new RestRoom();
    private BedRoom Bedroom1 = new BedRoom();
    private Yard Yard1 = new Yard();

    public static void main(String []args)
    {

    }
    public kitchen getKitchen1()
    {
        return kitchen1;
    }
    public  void setKitchen1(kitchen kitchen1)
    {
        this.kitchen1=kitchen1;
    }
    public DiningRoom getDinningRoom1()
    {
        return DinningRoom1;
    }
    public void setDinningRoom1(DiningRoom DinningRoom1)
    {
        this.DinningRoom1=DinningRoom1;
    }

    public LivingRoom getLivingRoom1()
    {
        return LivingRoom1;
    }
    public void setLivingRoom1(LivingRoom LivingRoom1)
    {
        this.LivingRoom1=LivingRoom1;
    }

    public RestRoom getRestRoom1()
    {
        return RestRoom1;
    }
    public void setRestRoom1(RestRoom RestRoom1)
    {
        this.RestRoom1=RestRoom1;
    }


    public BedRoom getBedroom1()
    {
        return Bedroom1;
    }
    public void setBedroom1(BedRoom bedroom1)
    {
        this.Bedroom1=bedroom1;
    }

    public Yard getYard1()
    {
        return Yard1;
    }
    public void setYard1(Yard Yard1)
    {
        this.Yard1=Yard1;
    }
    
}
