import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public List<String> find_permutation(String S) {
        List<String> list=new ArrayList<>();
        list=permutation(S,list,"");
        Collections.sort(list);
        return list;
    }
     List<String> permutation(String str, List<String> list,String psf){
        if(str.length()==0){
            list.add(psf);
            return list;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            StringBuilder sb=new StringBuilder(str);
            sb.deleteCharAt(i);
            permutation(sb.toString(), list, psf+ch);
        }
        return list;
    }
}
class combinations
{
    public static void main(String[] args)
    {
        Scanner key=new Scanner(System.in) ;
            String S = key.next();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }



