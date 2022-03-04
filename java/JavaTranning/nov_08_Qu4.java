package JavaTranning;
import java.lang.Object;

public class nov_08_Qu4
    {
        int id=5;
        String name="Anmol";
        String city="Kanpur";
        nov_08_Qu4(int id, String name , String city)
        {
            this.id=id;
            this.name=name;
            this.city=city;

        }

    public static void main(String[] args) {

        nov_08_Qu4 s1=new nov_08_Qu4(1325,"mathu","India");
        nov_08_Qu4 s2=new nov_08_Qu4(1326,"Dinesh","London");
        System.out.println(s1);
        System.out.println(s2);

    }
}
