public class J03_swap_variables{
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("after swapping...");
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}
