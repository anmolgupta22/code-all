//// { Driver Code Starts
////Initial Template for Java
//
//import java.io.*;
//
//class try89 {
//    public static void main(String args[]) throws IOException {
//        BufferedReader read =
//                new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(read.readLine());
//        while (t-- > 0) {
//            String s = read.readLine();
//
//            try92 ob = new try92();
//            String result = ob.removeDups(s);
//
//            System.out.println(result);
//        }
//    }
//}// } Driver Code Ends
//
//
////User function Template for Java
//
//class try111 {
//    String removeDups(String S) {
//        String res="";
//        for(int i=0; i<S.length(); i++){
//            if(res.indexOf(S.charAt(i)) == -1)
//                res += S.charAt(i);
//        }
//        return res;
//    }
//}