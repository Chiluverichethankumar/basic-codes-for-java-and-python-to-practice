// class int_to_bin {
//     public static void main(String args[]) {
//         int n = 10;
//         Bin(n);

//     }

//     static void Bin(int n) {

//         int[] arr = new int[1000];
//         int i = 0;
//         while (n > 0) {
//             arr[i] = n % 2;
//             n = n / 2;
//             i++;
//         }
//         for (int j = i - 1; j >= 0; j--) {
//             System.out.print(arr[j]);
//         }
//     }
// }

// public class int_to_bin {
//     public static void main(String[] args) {
//         // Create an object of the Car class
//         Car myCar = new Car();

//         // Set the color of the car
//         myCar.setColor("Red");

//         // Accelerate the car
//         myCar.accelerate();

//         // Get the speed of the car
//         System.out.println("Speed: " + myCar.getSpeed());

//         // Get the color of the car
//         System.out.println("Color: " + myCar.getColor());
//     }
// }

// class Car {
//     // Attributes (data)
//     private String carColor; // Changed instance variable name
//     private int speed;

//     // Method to set the color
//     public void setColor(String color) {
//         carColor = color; // No conflict with parameter name
//     }

//     // Method to get the color
//     public String getColor() {
//         return carColor; // Use the updated variable name
//     }

//     // Method to accelerate the car
//     public void accelerate() {
//         speed++;
//     }

//     // Method to get the speed
//     public int getSpeed() {
//         return speed;
//     }
// }

public class int_to_bin {
    public static void main(String[] args) {
        // create an object of the Car class
        Car myCar = new Car();

        // set the color of the car
        myCar.setColor("Red");

        System.out.println(myCar.getColor());

        // accelerate the car
        myCar.accelerate();

        // get the speed of the car
        System.out.println(myCar.getSpeed());
    }
}

class Car {
    // attributes (data)
    private String color;
    private int speed;

    // method to set the color
    public void setColor(String color) {
        this.color = color;
        // System.out.println(color);

    }

    // method to get the color
    public String getColor() {
        return this.color;
    }

    // method to accelerate the car
    public void accelerate() {
        this.speed++;
        // System.out.println(speed);

    }

    // method to get the speed
    public int getSpeed() {
        return this.speed;
    }
}
