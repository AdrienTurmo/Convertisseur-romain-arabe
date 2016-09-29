import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertisseurTestGlobal {

    private Convertisseur convertisseur;

    @Before
    public void setUp() {
        convertisseur = new Convertisseur();
    }

    @Test
    public void answer_ShouldReturnI_whenEntryIs1() {
        for (int i = 1; i<4000; i++) {
            // When
            int answer = convertisseur.RomanToArab(convertisseur.ArabToRoman(i));

            // Then
            assertEquals(i, answer);
        }
    }

}