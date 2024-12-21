import java.util.*;

public class Programs {

    // Fibonacci series
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.

    public void Fibonacci_Series(int n) {
        int n1, n2, temp;
        n1 = 0;
        n2 = 1;
        temp = 0;

        for (int i = 0; i < n; i++) {
            temp = n1 + temp;
            System.out.print(temp + " ");
            n1 = n2;
            n2 = temp;
        }

    }

    // Factorial
    // 4! = 4*3*2*1 = 24 , 5! = 5*4*3*2*1 = 120

    public void Factorial(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp = i * temp;
        }
        System.out.print(temp);
    }

    // Palindrome
    // same forward and backward
    // radar, level, madam, 12321, and A man, a plan, a canal, Panama!

    public void Palindrome(int n) {

        int mod, sum = 0;
        // for (int temp = n; temp > 0; temp = temp / 10) {
        // mod = temp % 10;
        // sum = (sum * 10) + mod;

        // }
        int temp = n;
        while (temp > 0) {
            mod = temp % 10;
            sum = (sum * 10) + mod;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(n + " Palindrome");
        else
            System.out.println(n + " not Palindrome");

    }

    // Armstrong Number

    // 1: 11 = 1
    // 2: 21 = 2
    // 3: 31 = 3
    // 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
    // 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
    // 1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643

    public void Armstrong(int n) {
        String num = String.valueOf(n);
        int length = num.length();
        int temp = n;
        int mod, sum = 0;
        while (temp > 0) {
            mod = temp % 10;
            sum = sum + (int) Math.pow(mod, length);
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(n + ": is Armstrong");
        else
            System.out.println(n + ": not Armstrong");

    }

    // Reverse String

    public static String ReverseString(String str) {
        // char[] Ch = str.toCharArray();
        // String Rev = "";
        // for (int i = Ch.length - 1; i >= 0; i--) {
        // Rev = Rev + Ch[i];
        // }
        // return Rev;

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Reverse Number

    public static long ReverseNumber(long n) {
        long tump, sum = 0, mod;
        tump = n;
        while (tump > 0) {
            mod = tump % 10;
            sum = (sum * 10) + mod;
            tump = tump / 10;
        }
        return sum;

    }

    // ASCII Value

    public static void ASCII(char Ch) {
        int num = Ch;
        System.out.println(num);

    }

    public static void main(String args[]) {
        Scanner Myscn = new Scanner(System.in);
        Programs Myobj = new Programs();

        // classnmae obj=new calssnmae();
        // obj.classnmae.methodnmae("value");
        // obj.methodnmae("value");

        // Fibonacci series

        // System.out.println("Fibonacci_Series" + "\n" + "Enter number:");
        // int Fibonacci = Myscn.nextInt();
        // Myobj.Fibonacci_Series(Fibonacci);

        // Factorial

        // System.out.println("Factorial" + "\n" + "Enter number:");
        // int Factorial = Myscn.nextInt();
        // Myobj.Factorial(Factorial);

        // Palindrome

        // System.out.println("Palindrome" + "\n" + "Enter number:");
        // int Palindrome = Myscn.nextInt();
        // Myobj.Palindrome(Palindrome);

        // Armstrong

        // System.out.println("Armstrong" + "\n" + "Enter number:");
        // int Armstrong = Myscn.nextInt();
        // Myobj.Armstrong(Armstrong);

        // // Reverse String
        // System.out.println("Reverse String" + "\n" + "Enter Txt:");
        // String ReverseString = Myscn.nextLine();
        // System.out.println(ReverseString(ReverseString));

        // // Reverse Number

        // System.out.println("Reverse Number" + "\n" + "Enter Number:");
        // long ReverseNumber = Myscn.nextLong();
        // System.out.println(ReverseNumber(ReverseNumber));

        // ASCII Values
        System.out.println("ASCII Value" + "\n" + "Enter Char:");
        char ASCII = Myscn.next().charAt(0);
        ASCII(ASCII);

    }

}
