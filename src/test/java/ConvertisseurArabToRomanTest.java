import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertisseurArabToRomanTest {

    private Convertisseur Conv;

    @Before
    public void setUp() {
        Conv = new Convertisseur();
    }

    @Test
    public void answer_ShouldReturnI_whenEntryIs1() {
        // When
        String answer = Conv.ArabToRoman(1);

        // Then
        assertEquals("I", answer);
    }

    @Test
    public void answer_ShouldReturnII_whenEntryIs2() {
        // When
        String answer = Conv.ArabToRoman(2);

        // Then
        assertEquals("II", answer);
    }

    @Test
    public void answer_ShouldReturnIII_whenEntryIs3() {
        // When
        String answer = Conv.ArabToRoman(3);

        // Then
        assertEquals("III", answer);
    }

    @Test
    public void answer_ShouldReturnMMXI_whenEntryIs2016() {
        // When
        String answer = Conv.ArabToRoman(2016);

        // Then
        assertEquals("MMXVI", answer);
    }

    @Test
    public void answer_ShouldReturnIV_whenEntryIs4() {
        // When
        String answer = Conv.ArabToRoman(4);

        // Then
        assertEquals("IV", answer);
    }

    @Test
    public void answer_ShouldReturnIX_whenEntryIs9() {
        // When
        String answer = Conv.ArabToRoman(9);

        // Then
        assertEquals("IX", answer);
    }

}
