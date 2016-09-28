import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertisseurTestGlobal {

    private Convertisseur Conv;

    @Before
    public void setUp() {
        Conv = new Convertisseur();
    }

    @Test
    public void answer_ShouldReturnI_whenEntryIs1() {
        for (int i = 1; i<4000; i++) {
            // When
            int answer = Conv.RomanToArab(Conv.ArabToRoman(i));

            // Then
            assertEquals(i, answer);
        }
    }

}