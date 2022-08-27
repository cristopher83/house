public class BedRoom {

    private boolean tv;
    private int width;
    private int height;
    private String color;

    private bedsize bed_size;

    public static void main(String []args)
    {
    }

    public bedsize getBed_size() {
        return bed_size;
    }
    public void setBed_size(bedsize bed_size)
    {
        this.bed_size= bed_size;
    }

    public  boolean getTv()
    {
        return tv;
    }
    public void setTv(boolean tv)
    {
        this.tv=tv;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}
