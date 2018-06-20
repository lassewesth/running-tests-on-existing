package lassewesth.internal.terrible;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

public class TerribleTest {
    @Test
    public void shouldYikes() throws Exception {
        String javaVersion = System.getProperty("java.version");

        assumeThat("java version is " + javaVersion, javaVersion, startsWith("10.0"));

        assertThat(javaVersion, is("10.0.1"));
    }
}
