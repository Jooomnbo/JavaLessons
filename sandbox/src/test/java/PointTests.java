import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public  void testDistance() {
        Point p1 = new Point(4,3);
        Point p2 = new Point(0,0);
        Assert.assertEquals(p1.distance(p2),5);
        Point p3 = new Point(-4,-3);
        Point p4 = new Point(0,0);
        Assert.assertEquals(p1.distance(p2),5);
    }
}
