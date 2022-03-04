package Question_Bank;
 class population
{ void illiterate(int pou,int per_men,int per_literate_men)
{
int a=pou*per_men/100;
    System.out.println("The number of the total men="+a);
    int b=pou*per_literate_men/100;
    System.out.println("The number of the literate men="+b);
   // System.out.println("The number of the unilateral men= "+(a-b));
    int c=pou*18/100;
    System.out.println("The number of the literate women="+c);

}
}

public class population_Qu_1 {
    public static void main(String arg[])
    {
        int pou=80000, per_men=52,per_literacy=48,per_literate_men=35;
        System.out.println("population of the town="+pou);
        System.out.println("Percentage of men="+per_men);
        System.out.println("Percentage of total literacy="+per_literacy);
        System.out.println("Percentage of literate men="+per_literate_men);
        System.out.println("******************************************");
population key=new population();
key.illiterate(pou,per_men,per_literate_men);
    }
}
