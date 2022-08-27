import java.util.Scanner;

public class house {

    private kitchen kitch = new kitchen();
    private LivingRoom LR = new LivingRoom();
    private DiningRoom DR = new DiningRoom();
    private RestRoom RR = new RestRoom();
    private BedRoom BR = new BedRoom();
    private Yard Yrd = new Yard();

    public static void main(String []args)
    {
        addRestRoom();
        addBedRoom();
    }
    public kitchen getKitchen()
    {
        return kitch;
    }
    public  void setKitchen(kitchen kitch)
    {
        this.kitch=kitch;
    }
    public DiningRoom getDinningRoom1()
    {
        return DR;
    }
    public void setDinningRoom(DiningRoom DR)
    {
        this.DR=DR;
    }

    public LivingRoom getLivingRoom()
    {
        return LR;
    }
    public void setLivingRoom(LivingRoom LR)
    {
        this.LR=LR;
    }

    public RestRoom getRestRoom()
    {
        return RR;
    }
    public void setRestRoom(RestRoom RR)
    {
        this.RR=RR;
    }


    public BedRoom getBedroom()
    {
        return BR;
    }
    public void setBedroom(BedRoom BR)
    {
        this.BR=BR;
    }

    public Yard getYard()
    {
        return Yrd;
    }
    public void setYard(Yard Yrd)
    {
        this.Yrd=Yrd;
    }

    public void addBedRoom()
    {
        getBedroom();
        setBedroom(BR);
        BR.getTv();
        BR.setTv(true);
        BR.getColor();
        BR.setColor("Amarillo");
        BR.getWidth();
        BR.setWidth(34);
        BR.getHeight();
        BR.setHeight(45);
        BR.getBed_size();
        BR.setBed_size(bedsize.MATRIMONIAL);
    }
    public void addRestRoom()
    {
        getRestRoom();
        setRestRoom(RR);
        RR.getColor();
        RR.setColor("Amarillo");
        RR.getWidth();
        RR.setWidth(34);
        RR.getHeight();
        RR.setHeight(45);
    }
}
