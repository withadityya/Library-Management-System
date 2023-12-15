import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();   
        if (age > 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are under adult");
        }
    }
}

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
        
//         if (age > 18) {
//             System.out.println("You are an adult");
//         }
//         else {
//             System.out.println("You are under adult");
//         }
//     }
// }

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a==b){
//             System.out.println("Greater");
//         }
//         else {
//             System.out.println("Lesser");
//         }
//     }
// }

// public class conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int button = sc.nextInt();
        
//         switch(button){
//             case 1: System.out.println("Namaste");
//             break;
//             case 2: System.out.println("Hello");
//             break;
//             default: System.out.println("Wrong number");
//         }
//     }
// }

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number a: ");
//         int a = sc.nextInt();
//         System.out.println("Enter a number b: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the operation: ");
//         String operation = sc.next();

//         if(operation.equals("+")){
//             System.out.println("The sum is: " + (a+b));
//         }
//         else if(operation.equals("-")){
//             System.out.println("The difference is: " + (a-b));
//         }
//         else if(operation.equals("*")){
//             System.out.println("The product is: " + (a*b));
//         }
//     }
// }

