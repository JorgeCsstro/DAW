public class Ejercicio31 {

	public static void main (String[] args) {

        short a = 8;
        short b = 3;
        short c = -5;


        
        int primero = a+b+c;// a)

            System.out.println(primero);

        int segundo = 2*b+3*(a-c);

            System.out.println(segundo);

        int tercero = a/b;

            System.out.println(tercero);

        int d = a%b;

            System.out.println(d);
        
        int e = a/c;

            System.out.println(e);
        
        int f = a%c;

            System.out.println(f);

        int g = a*b/c;

            System.out.println(g);

        int h = a*(b/c);

            System.out.println(h);

        int i = a*c%b;

            System.out.println(i);

        int j = (a-3*b)%(c+2*a)/(a-c);

            System.out.println(j);

        int k = a-b-c*2;

            System.out.println(k);

	}
}