
public class try90
{
    private int id=21;
    public int getId () {
        return id;
    }
    public int setId ( int newId){
        this.id = newId;
        return id;
    }
    public static void main(String[] args) {
        try90 key= new try90();
       System.out.println(key.setId(32));



    }
}
