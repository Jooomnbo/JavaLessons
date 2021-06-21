public class MyFirstClass {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 4;
        p1.y = 3;
        Point p2 = new Point();
        p2.x = 0;
        p2.y = 0;
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + distance(p1,p2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
    }

}
