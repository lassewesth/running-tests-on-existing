package lassewesth.shizzle;

import lassewesth.internal.terrible.Accident;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FoIT {
    @Test
    public void shouldMeme() throws Exception {
        Accident accident = new Accident();

        assertArrayEquals(new Accident[]{accident}, new Accident[]{accident});
    }
}
