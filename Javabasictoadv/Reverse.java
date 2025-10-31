<<<<<<< HEAD
public class Reverse {
    public static void main(String args[]) {
        System.out.println(MainCode.reverse("Chethan"));
        System.out.println(MainCode.reverse("Chiluveri"));

    }

}

class MainCode {
    public static String reverse(String str) {
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
=======
public class Reverse {
    public static void main(String args[]) {
        System.out.println(MainCode.reverse("Chethan"));
        System.out.println(MainCode.reverse("Chiluveri"));

    }

}

class MainCode {
    public static String reverse(String str) {
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
>>>>>>> 5b345f5adc84ab4e293727bea660d3581fcf5742
}