<<<<<<< HEAD
// // with out using this key word

// public class This {
//     // String name = "chethankumar";
//     // int age = 22;
//     String name;
//     int a

//public This(){
//         //
//         //
//     }

//     public This(int Myage, String Myname) {
//         name = Myname;
//         age = Myage;
//         System.out.println(name);
//         System.out.println(age);
//     }

//     public static void main(String args[]) {

//         This THIS = new This();
//         System.out.println(THIS.name);
//         System.out.println(THIS.age);

//         String name = "chethan";
//         int age = 22;

//         This THIS1 = new This(age, name);
//         // System.out.println(THIS1.name);
//         // System.out.println(THIS1.age);
//     }
// }

// with using this key word

class This {
    String name;
    int age;

    public This() {
        System.out.println(name);
        System.out.println(age);
    }

    public This(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public This(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {

        This myobj = new This();

        This myobj2 = new This("chethan", 22);

        This myobj3 = new This(22, "chethankumar");
        System.out.println(myobj3.name);
        System.out.println(myobj3.age);
    }

=======
// // with out using this key word

// public class This {
//     // String name = "chethankumar";
//     // int age = 22;
//     String name;
//     int a

//public This(){
//         //
//         //
//     }

//     public This(int Myage, String Myname) {
//         name = Myname;
//         age = Myage;
//         System.out.println(name);
//         System.out.println(age);
//     }

//     public static void main(String args[]) {

//         This THIS = new This();
//         System.out.println(THIS.name);
//         System.out.println(THIS.age);

//         String name = "chethan";
//         int age = 22;

//         This THIS1 = new This(age, name);
//         // System.out.println(THIS1.name);
//         // System.out.println(THIS1.age);
//     }
// }

// with using this key word

class This {
    String name;
    int age;

    public This() {
        System.out.println(name);
        System.out.println(age);
    }

    public This(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public This(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {

        This myobj = new This();

        This myobj2 = new This("chethan", 22);

        This myobj3 = new This(22, "chethankumar");
        System.out.println(myobj3.name);
        System.out.println(myobj3.age);
    }

>>>>>>> 5b345f5adc84ab4e293727bea660d3581fcf5742
}