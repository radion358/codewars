package Roman_Numerals_Encoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionTest {
    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("MCMXCV",conversion.solution(1995));
        assertEquals("MMXIV", conversion.solution(2014));
        assertEquals("MDCCLXXVI", conversion.solution(1776));
    }
}
