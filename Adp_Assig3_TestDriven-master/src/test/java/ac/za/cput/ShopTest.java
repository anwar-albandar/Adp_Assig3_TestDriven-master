package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    @Before
    public void setUp() throws Exception {
        shop = new Shop();
    }

    @Test
    public void sellProduct() {
        shop.Product();
        shop.Product();

        assertEquals(3, shop.getStock());
    }
}
