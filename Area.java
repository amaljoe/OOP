public class Area {
    public static void main(String[] args) {
        FindArea ar = new FindArea();
        ar.area(18, 24, 30);
    }
}

class FindArea{
    void area(int l, int b){
        int area = l * b;
        System.out.println("Area of rectangle = " + area);
    }
    void area(int r){
        double area = 3.14 * r * r;
        System.out.println("Area of circle = " + area);
    }
    void area(int s1, int s2, int s3){
        double p = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
        System.out.println("Area of triangle = " + area);
    }
}