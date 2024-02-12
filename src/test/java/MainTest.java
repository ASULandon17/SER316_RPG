import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MainTest {
    Main main;
    
    @Before
    public void setUp() throws Exception { 
        main = new Main();
    }
    
    @Test
    public void createsMessage() {
        String[] args = {};
        Main.main(args);
        assertEquals("Message is incorrect", "Hello 316", main.getMessage());
    }
}