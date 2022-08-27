import java.util.ArrayList;
import java.util.List;

public class street {

    private String name;
    private List<house> hs;
    int number;

    public static void main (String[]args) /*addHouses*/
    {
        getHouses();
        setHouses(List<house> hs);
        hs.add(number,house);
    }

    public List<house> getHouses() {
        return hs;
    }

    public void setHouses(List<house> hs) {
        this.hs = hs;
    }

    public String getName()
    {
        return name;
    }

    public  void setName(String name)
    {
        this.name=name;
    }


}
