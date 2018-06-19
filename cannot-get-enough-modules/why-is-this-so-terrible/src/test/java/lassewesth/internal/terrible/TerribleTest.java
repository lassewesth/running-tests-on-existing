package lassewesth.internal.terrible;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TerribleTest {
    @Test
    public void shouldYikes() throws Exception {
        org.junit.Assume.assumeFalse(false || true);

        assertNotNull(new Accident());
    }
}
