package in.samanvitha.unit_1.part_2;

public class Operator {

        public static void main(String[] args)
        {
            int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
            System.out.println("a+b/d = " + (a + b/d));
            System.out.println("a+b*d-e/f = "+ (a + b * d - e / f));
            int x=10;
            System.out.println(x++);
            System.out.println(++x);
            System.out.println(x--);
            System.out.println(--x);
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
            System.out.println(10<<2);
            System.out.println(10<<3);
            System.out.println(20<<2);
            System.out.println(15<<4);
            int min=(a<b)?a:b;
            System.out.println(min);
        }
}
