import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertisseurArabToRomanTest {

    private Convertisseur convertisseur;

    @Before
    public void setUp() {
        convertisseur = new Convertisseur();
    }

    @Test
    public void answer_ShouldReturnI_whenEntryIs1() {
        // When
        String answer = convertisseur.arabToRoman(1);

        // Then
        assertEquals("I", answer);
    }

    @Test
    public void answer_ShouldReturnII_whenEntryIs2() {
        // When
        String answer = convertisseur.arabToRoman(2);

        // Then
        assertEquals("II", answer);
    }

    @Test
    public void answer_ShouldReturnIII_whenEntryIs3() {
        // When
        String answer = convertisseur.arabToRoman(3);

        // Then
        assertEquals("III", answer);
    }

    @Test
    public void answer_ShouldReturnIV_whenEntryIs4() {
        // When
        String answer = convertisseur.arabToRoman(4);

        // Then
        assertEquals("IV", answer);
    }

    @Test
    public void answer_ShouldReturnIX_whenEntryIs9() {
        // When
        String answer = convertisseur.arabToRoman(9);

        // Then
        assertEquals("IX", answer);
    }

    @Test
    public void answer_ShouldReturnXL_whenEntryIs40() {
        // When
        String answer = convertisseur.arabToRoman(40);

        // Then
        assertEquals("XL", answer);
    }


    @Test
    public void answer_ShouldReturnL_whenEntryIs50() {
        // When
        String answer = convertisseur.arabToRoman(50);

        // Then
        assertEquals("L", answer);
    }

    @Test
    public void answer_ShouldReturnXC_whenEntryIs90() {
        // When
        String answer = convertisseur.arabToRoman(90);

        // Then
        assertEquals("XC", answer);
    }

    @Test
    public void answer_ShouldReturnC_whenEntryIs100() {
        // When
        String answer = convertisseur.arabToRoman(100);

        // Then
        assertEquals("C", answer);
    }

    @Test
    public void answer_ShouldReturnCD_whenEntryIs400() {
        // When
        String answer = convertisseur.arabToRoman(400);

        // Then
        assertEquals("CD", answer);
    }

    @Test
    public void answer_ShouldReturnD_whenEntryIs500() {
        // When
        String answer = convertisseur.arabToRoman(500);

        // Then
        assertEquals("D", answer);
    }

    @Test
    public void answer_ShouldReturnCM_whenEntryIs900() {
        // When
        String answer = convertisseur.arabToRoman(900);

        // Then
        assertEquals("CM", answer);
    }

    @Test
    public void answer_ShouldReturnM_whenEntryIs1000() {
        // When
        String answer = convertisseur.arabToRoman(1000);

        // Then
        assertEquals("M", answer);
    }

    @Test
    public void answer_ShouldReturnMMXI_whenEntryIs2016() {
        // When
        String answer = convertisseur.arabToRoman(2016);

        // Then
        assertEquals("MMXVI", answer);
    }


}
