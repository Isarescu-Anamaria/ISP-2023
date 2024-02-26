package isp.lab3.exercise2;

public class Rectangle {
    private int length;
    private int width;
    private String color;

    public Rectangle() {
        length = 2;
        width = 1;
        color = "red";
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length,int width,String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }
    public int getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }

    public long getPerimeter(){
        long perimeter = (2*length) + (2*width);
        return perimeter;
    }
    public long getArea(){
        long area = length*width;
        return area;
    }

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(4,2,"purple");
        System.out.println("length=" + rectangle.getLength());
        System.out.println("width=" + rectangle.getWidth());
        System.out.println("The color is: " + rectangle.getColor());
        System.out.println("The perimeter is: " + rectangle.getPerimeter() + " meters");
        System.out.println("The area is: " + rectangle.getArea() + " square meters");

    }

}

