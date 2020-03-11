package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    private Client cli;

    @Before
    public void setUp() throws Exception{

        cli =  new Client("ِAnwar", 5);

    }

    @Test
    public void getBalance() {
        assertEquals(5, cli.getBalance());
    }

    @Test
    public void reduceBalance() { cli.reduceBalance(3); assertEquals(2, cli.getBalance());}

}
