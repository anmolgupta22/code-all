package online_harr;

public class Qu3 {
    private int id;
    private String name;

    public String getName() {
        return name;

    }
    public void setName(String n){
       this.name=n;

    }
    public void setId(int i){
        id=i;

    }
    public int getId()
    {
        return id;

    }

    public static void main(String[] args) {
        Qu3 key =new Qu3();
        key.id=45;
        key.setName("Anmol");
        System.out.println(key.getName());
    }
}
