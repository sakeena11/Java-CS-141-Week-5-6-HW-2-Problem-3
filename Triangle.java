public class Triangle {
    public static double areaOfTriangle(double a, double b, double c) {
        //TODO: complete this method
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s-c));
        return area;
    }

}