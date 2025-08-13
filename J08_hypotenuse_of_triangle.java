import java.util.Scanner; // we are importing scanner from java utilary module...

public class J08_hypotenuse_of_triangle
{
    public static void main(String[] args) // compiler will search for this (javac) 
    {
        Scanner scanner = new Scanner(System.in); // new keyword creating new object s
        // s is of datatype Scanner (Scanner is a class)

        System.out.println("Enter value of a: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter value of b: ");
        double side2 = scanner.nextDouble();

        double hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("The hypotenuse is: "+hypotenuse);
        scanner.close();
    }
}
