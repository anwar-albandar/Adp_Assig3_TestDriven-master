package ac.za.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MyObjTest {

    private MyObjTest obj1;
    private MyObjTest obj2;
    private MyObjTest obj3;
    private MyObjTest obj4;
    @Before
    public void setUp() throws Exception {
        obj1 = new MyObjTest();
        obj2 = new  MyObjTest();
        obj3 = new  MyObjTest();
        obj4 = new  MyObjTest();
    }

    @Test
    public void testEquality()
    {
        assertEquals(obj1, obj2); // Equal
    }

    @Test
    public void testEquality2()
    {
        assertNotEquals(obj1, obj3); // Not equal
    }

    @Test
    public void testIdentity()
    {
        assertSame(obj1, obj1);
    }

    @Test
    public void testIdentity2()
    {
        assertNotSame(obj1, obj2);
    }

    @Test
    public void testFail()
    {
        fail();
    }

    @Test(timeout = 300)
    public void testTimeout() // Failing a test because the execution time exceeds the timeout
    {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    @Ignore("This test must be ignored")
    @Test
    public void testIgnored()
    {
        assertEquals(obj1, obj4);
    }

}
