public class J02_variables {
    public static void main(String[] args){
        int x; // declaration
        x = 123; // assignment
        int y = 456; // initialzation
        
        System.out.println("x is: "+x); // concatenation
        System.out.println("y is: "+y);
        
        System.out.printf("x is: %d\n", x); // just as C language
        System.out.printf("y is: %d\n", y);
        
        long z = 999999999999999999L; // use L in the end for long
        System.out.println("z is: "+z);
        
        float a = 3.14f; // use f in the end for float
        System.out.println("a is: "+a);
        
        boolean b = true; // in java boolean all small letters
        System.out.println("b is: "+b);
        
        // float c = 3.12;
        // // narrowing -> can lose data 3.12 is double.
        // lossy conversion => lose data (narrowing)
        // System.out.println("c is:"+c);

        // char symbol = "@";
        // System.out.println("c is: "+symbol);
        // use '' for char "" for string

        char symbol = '@';
        System.out.println("symbol is: "+symbol);

        String name = "Lokesh";
        System.out.println(name);
    }
}
