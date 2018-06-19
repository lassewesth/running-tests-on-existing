package lassewesth.internal.terrible;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

public class DisastrousIT {
    @Test
    public void shouldYikesSlowly() throws Exception {
        // seems to be good enough eh?
        assertThat(new Accident().toString(), startsWith("an"));
    }
}
