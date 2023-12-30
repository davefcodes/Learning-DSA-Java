import org.junit.Assert;
import org.junit.Test;

public class T1_OOPTest {

    @Test
    public void testT1_nameMethod() {
        T1_OOP instance = new T1_OOP();
        instance.t1_name(); // Assuming this method does something testable

        // Perform assertions
        // For example, if t1_name() is supposed to update a field, you can check it:
        // Assert.assertEquals("Expected value", instance.getThatField());
    }
}
