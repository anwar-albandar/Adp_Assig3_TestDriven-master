package ac.za.cput;

import org.junit.After;
import org.junit.Before;




public class AppTestTest {

    private MyObj myobj1;
    private MyObj myobj2;

    @Before
    public void setUp() throws Exception {
        myobj1 = new MyObj("test1", 10);
        myobj2 = new MyObj("test1", 10);
    }

    @After
    public void tearDown() throws Exception {
    }
}