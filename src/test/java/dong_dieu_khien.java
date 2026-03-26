import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class dong_dieu_khien {
    private final Calculator cal = new Calculator();

    @Test void testID11() { assertEquals("Invalid", cal.calculator(-10, 0.0f, "Hoả tốc")); }
    @Test void testID12() { assertEquals("30.000", cal.calculator(1, 50.0f, "Hoả tốc")); }
    @Test void testID13() { assertEquals("25.000", cal.calculator(1, 50.0f, "Thường")); }
    @Test void testID14() { assertEquals("42.000", cal.calculator(1, 150.0f, "Hoả tốc")); }
    @Test void testID15() { assertEquals("35.000", cal.calculator(1, 150.0f, "Thường")); }
    @Test void testID16() { assertEquals("34.800", cal.calculator(7, 50.0f, "Hoả tốc")); }
    @Test void testID17() { assertEquals("29.000", cal.calculator(7, 50.0f, "Thường")); }
    @Test void testID18() { assertEquals("46.800", cal.calculator(7, 150.0f, "Hoả tốc")); }
    @Test void testID19() { assertEquals("39.000", cal.calculator(7, 150.0f, "Thường")); }
}