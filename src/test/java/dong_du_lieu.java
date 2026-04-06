import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class dong_du_lieu {
    private final Calculator cal = new Calculator();

    @Test void testID11() { assertEquals("Invalid", cal.calculator(-10, 0.0f, "Hoả tốc")); }
    @Test void testID12() { assertEquals("45.000", cal.calculator(10, 150.0f, "Thường")); }
    @Test void testID13() { assertEquals("30.000", cal.calculator(5, 50.0f, "Hoả tốc")); }
}