package isp.lab3.exercise4;
import java.lang.Math;
public class MyPoint {
    private int x;
    private int y;
    private int z;
    public MyPoint(){
        x = 0;
        y = 0;
        z = 0;
    }
    public MyPoint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public static double distance1(MyPoint thisPoint, int x, int y, int z){
        double d = 0;
        int aux = ((thisPoint.x-x)*(thisPoint.x-x))+((thisPoint.y-y)*(thisPoint.y-y))+((thisPoint.z-z)*(thisPoint.z-z));
        d = Math.sqrt(aux);
        return d;
    }

        public static double distance2(MyPoint thisPoint,MyPoint another){
            double d = 0;
            int aux = ((thisPoint.x-another.x)*(thisPoint.x-another.x))+((thisPoint.y-another.y)*(thisPoint.y-another.y))+((thisPoint.z-another.z)*(thisPoint.z-another.z));
            d = Math.sqrt(aux);
            return d;
        }


    public static void main(String[] args){
        MyPoint p1 = new MyPoint(1,1,1);
        String s1 = p1.toString();
        System.out.println("p1=" + s1);
        MyPoint p2 = new MyPoint(3,4,7);
        String s2 = p2.toString();
        System.out.println("p2=" + s2);
        double dist = distance1(p1,p2.x, p2.y, p2.z);
        System.out.println("The distance between p1 and p2 is: " + dist);
        dist = distance2(p1,p2);
        System.out.println("The distance between p1 and p2 is: " + dist);
    }


}
