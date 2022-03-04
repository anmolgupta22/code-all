//import java.util.*;
//
//public class try33 {
//    Scanner sc = new Scanner(System.in);
//    private int dist;
//    private int fl_no;
//    private String dest;
//    private float fuel;
//
//    private void CALFUEL(){
//        System.out.println("Enter distance:");
//        this.setDist(sc.nextInt());
//        if(this.dist <= 1000) {
//            this.setFuel(500);
//        }
//        else if(this.dist > 1000 && this.dist <= 2000) {
//            this.setFuel(1100);
//        }
//        else {
//            this.setFuel(2200);
//        }
//        System.out.println("The distance is :" + this.getDist() + "  and the fuel is " + this.getFuel());
//    }
//
//    public int getFl_no() {
//        return fl_no;
//    }
//
//    public void setFl_no(int fl_no) {
//        this.fl_no = fl_no;
//    }
//
//    public String getDest() {
//        return dest;
//    }
//
//    public void setDest(String dest) {
//        this.dest = dest;
//    }
//
//    public float getFuel() {
//        return fuel;
//    }
//
//    public void setFuel(float fuel) {
//        this.fuel = fuel;
//    }
//
//    public void FEEDINFO(){
//        System.out.println("Enter flight number:");
//        this.setFl_no(sc.nextInt());
//        System.out.println("Enter flight destination:");
//        this.setDest(sc.next());
//        this.CALFUEL();
//    }
//
//    public void SHOWINFO(){
//        this.FEEDINFO();
//        System.out.println("The flight number is: " + this.getFl_no());
//        System.out.println("The Flight destination is: " + this.getDest());
//        this.CALFUEL();
//    }
//
//    public int getDist() {
//        return dist;
//    }
//
//    public void setDist(int dist) {
//        this.dist = dist;
//    }
//
//    public static void main(String[] args) {
//        try33 key
//    }
//}