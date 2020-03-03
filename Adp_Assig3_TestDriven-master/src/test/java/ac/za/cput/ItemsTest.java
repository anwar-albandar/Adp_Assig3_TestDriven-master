package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsTest {
    private Items prod;
    @Before
    public void setUp() throws Exception {
        prod=new Items("Orange", 10);
    }

    @Test
    public void getPrice() {
        assertEquals(10, prod.getPrice());
    }

}
