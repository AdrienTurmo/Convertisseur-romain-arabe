import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertisseurRomanToArabTest {

    private Convertisseur Conv;

    @Before
    public void setUp() {
        Conv = new Convertisseur();
    }

    @Test
    public void answer_ShouldReturn1_whenEntryIsI() {
        // When
        int answer = Conv.RomanToArab("I");

        // Then
        assertEquals(1, answer);
    }

    @Test
    public void answer_ShouldReturn5_whenEntryIsV() {
        // When
        int answer = Conv.RomanToArab("V");

        // Then
        assertEquals(5, answer);
    }

    @Test
    public void answer_ShouldReturn10_whenEntryIsX() {
        // When
        int answer = Conv.RomanToArab("X");

        // Then
        assertEquals(10, answer);
    }

    @Test
    public void answer_ShouldReturn50_whenEntryIsL() {
        // When
        int answer = Conv.RomanToArab("L");

        // Then
        assertEquals(50, answer);
    }

    @Test
    public void answer_ShouldReturn100_whenEntryIsC() {
        // When
        int answer = Conv.RomanToArab("C");

        // Then
        assertEquals(100, answer);
    }

    @Test
    public void answer_ShouldReturn500_whenEntryIsD() {
        // When
        int answer = Conv.RomanToArab("D");

        // Then
        assertEquals(500, answer);
    }

    @Test
    public void answer_ShouldReturn1000_whenEntryIsM() {
        // When
        int answer = Conv.RomanToArab("M");

        // Then
        assertEquals(1000, answer);
    }

    @Test
    public void answer_ShouldReturn2_whenEntryIsII() {
        // When
        int answer = Conv.RomanToArab("II");

        // Then
        assertEquals(2, answer);
    }

    @Test
    public void answer_ShouldReturn3_whenEntryIsIII() {
        // When
        int answer = Conv.RomanToArab("III");

        // Then
        assertEquals(3, answer);
    }

    @Test
    public void answer_ShouldReturn4_whenEntryIsIV() {
        // When
        int answer = Conv.RomanToArab("IV");

        // Then
        assertEquals(4, answer);
    }

    @Test
    public void answer_ShouldReturn9_whenEntryIsIX() {
        // When
        int answer = Conv.RomanToArab("IX");

        // Then
        assertEquals(9, answer);
    }

    @Test
    public void answer_ShouldReturn19_whenEntryIsXIX() {
        // When
        int answer = Conv.RomanToArab("XIX");

        // Then
        assertEquals(19, answer);
    }

    @Test
    public void answer_ShouldReturn49_whenEntryIsXLIX() {
        // When
        int answer = Conv.RomanToArab("XLIX");

        // Then
        assertEquals(49, answer);
    }

    @Test
    public void answer_ShouldReturn98_whenEntryIsXCVIII() {
        // When
        int answer = Conv.RomanToArab("XCVIII");

        // Then
        assertEquals(98, answer);
    }

    @Test
    public void answer_ShouldReturn3999_whenEntryIsMMMDMLCIX() {
        // When
        int answer = Conv.RomanToArab("MMMCMXCIX");

        // Then
        assertEquals(3999, answer);
    }


    @Test
    public void answer_ShouldReturn2016_whenEntryIsMMXVI() {
        // When
        int answer = Conv.RomanToArab("MMXVI");

        // Then
        assertEquals(2016, answer);
    }

    @Test
    public void answer_ShouldReturn900_whenEntryIsCM() {
        // When
        int answer = Conv.RomanToArab("CM");

        // Then
        assertEquals(900, answer);
    }

}
