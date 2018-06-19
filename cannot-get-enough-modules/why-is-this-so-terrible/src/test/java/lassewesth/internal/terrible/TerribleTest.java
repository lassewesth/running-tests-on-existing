package lassewesth.internal.terrible;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeThat;

public class TerribleTest {
    @Test
    public void shouldYikes() throws Exception {
        String javaVersion = System.getProperty("java.version");

        System.out.println("***");
        System.out.println("***");
        System.out.println("java version is " + javaVersion);
        System.out.println("***");
        System.out.println("***");

        assumeThat("java version is " + javaVersion, javaVersion, startsWith("1.10"));

        fail("fails on java 10");
    }
}
