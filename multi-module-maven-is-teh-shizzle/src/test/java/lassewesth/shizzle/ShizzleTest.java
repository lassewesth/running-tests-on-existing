package lassewesth.shizzle;

import lassewesth.internal.terrible.Accident;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ShizzleTest {
    @Test
    public void shouldShizzolate() throws Exception {
        assertNotEquals(new Accident(), new Accident());
    }
}
