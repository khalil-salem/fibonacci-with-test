import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author khalil
 */
public class MainTest {
    
  
     
    @org.junit.jupiter.api.Test
    public void testfib() {
        int output1=Main.fib(150);
        assertEquals(626779336,output1);
    }

  
    
    
}
