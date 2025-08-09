import java.util.Scanner; // importing scanner class from java's utility class.

public class J04_user_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        // String name = scanner.next(); // scanner.next() takes only one word as input (stops near space)
        String name = scanner.nextLine(); // takes input until hit enter.
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // to clear the \n , as nextInt only reads integer

        System.out.println("What is your favorite food");
        String food = scanner.nextLine();

        System.out.println("\nyour name is: "+name);
        System.out.println("your age is: "+age);
        System.out.println("your fav food is: "+food);
        scanner.close();
    }
}
