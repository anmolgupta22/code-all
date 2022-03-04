public class try18 {
    String name;

    void changeref(try18 that, try18 sthat) {
        sthat=that;
        sthat.name = this.name;
        that=sthat;
       // th=null;
        //System.out.println(c1.name);

    }
}
class main{

    public static void main(String arg9[])
    {
       try18 c1 =new try18();
        c1.name="ethnus";
        try18 c2=new try18();
        c2.name="a";
        c1.changeref(c2,c1);


        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
