import java.util.*;
public class try84 {

    public boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('1', '1');
        map.put('0', '0');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int left = 0, right = num.length() - 1;
        while (left <= right) {
            if (!map.containsKey(num.charAt(left)) || !map.get(num.charAt(left)).equals(num.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String arg[]) {
        Scanner key = new Scanner(System.in);
        String t = key.nextLine();
        try84 t1 = new try84();
        t1.isStrobogrammatic(t);
        System.out.print(t1.isStrobogrammatic(t));
    }
}