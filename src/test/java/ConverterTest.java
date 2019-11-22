import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConverterTest {

    private Converter subject;

    @BeforeEach
    private void before() {
        subject = new Converter();
    }

    @Test
    void testConvert() {
        assertEquals("", subject.convert(0));
        assertEquals("I", subject.convert(1));
        assertEquals("III", subject.convert(3));
        assertEquals("IV", subject.convert(4));
        assertEquals("X", subject.convert(10));
        assertEquals("XX", subject.convert(20));
        assertEquals("MMMCMXCIX", subject.convert(3999));
    }

}
