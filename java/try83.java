import java.util.*;
import java.util.Stack;
 class BODMASS
 {
    public  int evaluate(String exe)
    {
        char[] tokens = exe.toCharArray();
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' &&
                    tokens[i] <= '9')
            {
                StringBuilder sb = new StringBuilder();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sb.append(tokens[i++]);
                values.push(Integer.parseInt(sb.toString()));
                i--;
            }
            else if (tokens[i] == '(') ops.push(tokens[i]);
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(') values.push(apply(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
            {
                while (!ops.empty() && pre(tokens[i], ops.peek())) values.push(apply(ops.pop(), values.pop(), values.pop()));ops.push(tokens[i]);
            }
        }
        while (!ops.empty())
            values.push(apply(ops.pop(), values.pop(), values.pop()));
        return values.pop();
    }
    public static boolean pre(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') ||
                (op2 != '+' && op2 != '-');
    }
    public static int apply(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner key=new Scanner(System.in);

        String st=key.nextLine();
        BODMASS BO =new BODMASS();
        String res= String.valueOf(BO.evaluate(st));
        System.out.println("BODMASS approach: "+res);

    }
}
