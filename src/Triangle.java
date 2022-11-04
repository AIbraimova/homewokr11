public class Triangle {
    static int a;
    static int b;
    static int c;

    public static void getArea() {
        int s = (a+b+c)/2;
        System.out.println("Area of Triangle is:"+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));
    }
}