package isp.lab3.exercise1;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyPointTest {
    @Test
    public void testDistance() {

    MyPoint p1 = new MyPoint(1, 1, 1);
    MyPoint p2 = new MyPoint(3, 4, 7);

    assertEquals(7.0,MyPoint.distance1(p1, p2.getX(), p2.getY(), p2.getZ()),1e-15);
    }
}



