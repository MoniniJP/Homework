public class Main {
    public static void main(String[] args) {
        double a;
        double x = 5;
        a = 3 * Math.pow(x, 1. / 3) - 7;
        System.out.println("a= " + a);


        double b;
        double y = 5;
        x = 2;
        b = 4 * x * 3 - 12 * y;
        System.out.println("b= " + b);

        double c;
        x = 3;
        y = 1;
        c = Math.sin(x * (-3 + 2 * y) + 1);
        System.out.println("c=" + c);

        double d;
        d = 122 * Math.pow(x, -2);
        System.out.println("d=" + d);

        double e;
        x = 2;

        e = x * x * x * x * Math.abs(485 - 179 * y);

        System.out.println("e=" + e);

        double f;
        f = 3 + Math.pow(9, x) - 5 / x - 1;
        System.out.println("f=" + f);


        double g;
        g = (2.5 * (4 - 6 * x)) - 5;
        System.out.println("g=" + g);


        double h;
        h = Math.cos(x / 2) + Math.sin(x / 4) + 3 * x / 6;

        System.out.println("h=" + h);


        x = 1;
        y = Math.abs(5 * x - 3 / Math.pow(x, 2) + 6 + 7 * Math.pow(x, 3) - 12);

        System.out.println("y=" + y);

    }
}

