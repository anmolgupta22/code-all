package Coaching;

public class Q4 {
    static void  show(int[] arry)
    {
        for(int i=0;i<arry.length;i++)
        {
          arry[i]=12+i;
        }
     // arry[3]=48  ;
    }
    public static void main(String arg[])
    {
        int [] marks={1,3,4,6,7,8};
        show(marks);
        for(int i=0;i<marks.length;i++)
        System.out.println(marks[i]);
    }
}
