// public class J03_swap_variables{
//     public static void main(String[] args){
//         int a = 5;
//         int b = 4;
//         System.out.println("a is: "+a);
//         System.out.println("b is: "+b);
//         int temp = b;
//         b = a;
//         a = temp;
//         System.out.println("after swapping...");
//         System.out.println("a is: "+a);
//         System.out.println("b is: "+b);
//     }
// }

public class J03_swap_variables{
    public static void main(String[] args){
        String x = "water";
        String y = "Kool-Aid";
        System.out.println("Before Swapping Varaibles");
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
        String temp = y;
        y = x;
        x = temp;

        // String temp = x;
        // x = y;
        // y = temp;
        System.out.println("After Swapping Varaibles");
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
    }
}
