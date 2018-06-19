package lassewesth.internal.terrible;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

public class TerribleTest {
    @Test
    public void shouldYikes() throws Exception {
        String javaVersion = System.getProperty("java.version");

        org.junit.Assume.assumeThat("java version is " + javaVersion, javaVersion, is("1.8"));

        assertNotNull(new Accident());
    }
}
