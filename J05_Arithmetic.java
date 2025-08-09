public class J05_Arithmetic{
    public static void main(String[] args){
        int friends = 10;
        friends = friends + 1;
        System.out.println(friends);
        friends = friends * 2;
        System.out.println(friends);
        friends = friends - 1;
        System.out.println(friends);

        friends = friends%2;
        System.out.println(friends);

        System.out.println("---");

        int enemies = 1;
        // enemies++;
        // System.out.println(enemies);
        System.out.println(enemies++);
    
        // note that something++ is post increment., it increases after the expression.
        // ++something is pre increment., it increases during the expression.

        // integer division (removes decimal part)
        System.out.println(friends/enemies);

        // with decimal division we have to convert any of Nr or Dr into double.
        System.out.println((double)friends/enemies);
        
    }
}
