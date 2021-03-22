package money;

import junit.framework.TestCase;
import org.junit.Test;

public class MoneyTest extends TestCase {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
