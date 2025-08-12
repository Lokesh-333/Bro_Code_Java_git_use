

public class J07_MathClass
{
    public static void main(String[] args)
    {
        double x = 3.14;
        double y = -10;

        double max = Math.max(x, y);
        System.out.println(max);

        double min = Math.min(x, y);
        System.out.println(min);

        double absol = Math.abs(y); // abs means absolute value, means its just value, no sign (magnitude)
        System.out.println(absol);

        double square_root = Math.sqrt(absol);
        System.out.println(square_root);

        double r = Math.round(x);
        System.out.println(r);

        double c = Math.ceil(x);
        System.out.println(c);

        double f = Math.floor(x);
        System.out.println(f);
    }
}
