package lassewesth.internal.terrible;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertNull;

public class TerribleTest {
    @Test
    public void shouldYikes() throws Exception {
        String javaVersion = System.getProperty("java.version");

        System.out.println();
        System.out.println();
        System.out.println("*** JAVA VERSION *** = " + javaVersion);
        System.out.println();
        System.out.println();

        org.junit.Assume.assumeThat("java version is " + javaVersion, javaVersion, startsWith("1.8"));

        assertNull(new Accident());
    }
}
