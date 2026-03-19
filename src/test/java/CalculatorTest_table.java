import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorBoundaryTest {

    private final Calculator cal = new Calculator();

    // Nhóm 1: Hoả tốc
    @Test void testID1() { assertEquals("Invalid", cal.calculator(-1, -1.0f, "Hoả tốc")); }
    @Test void testID2() { assertEquals("Invalid", cal.calculator(1, -1.0f, "Hoả tốc")); }
    @Test void testID3() { assertEquals("30.000", cal.calculator(1, 10.0f, "Hoả tốc")); }
    @Test void testID4() { assertEquals("42.000", cal.calculator(1, 150.0f, "Hoả tốc")); }
    @Test void testID5() { assertEquals("Invalid", cal.calculator(1, 550.0f, "Hoả tốc")); }
    @Test void testID6() { assertEquals("Invalid", cal.calculator(10, -1.0f, "Hoả tốc")); }
    @Test void testID7() { assertEquals("42.000", cal.calculator(10, 10.0f, "Hoả tốc")); }
    @Test void testID8() { assertEquals("54.000", cal.calculator(10, 150.0f, "Hoả tốc")); }
    @Test void testID9() { assertEquals("Invalid", cal.calculator(10, 550.0f, "Hoả tốc")); }
    @Test void testID10() { assertEquals("Invalid", cal.calculator(50, -1.0f, "Hoả tốc")); }
    @Test void testID11() { assertEquals("Invalid", cal.calculator(50, 10.0f, "Hoả tốc")); }
    @Test void testID12() { assertEquals("Invalid", cal.calculator(50, 150.0f, "Hoả tốc")); }
    @Test void testID13() { assertEquals("Invalid", cal.calculator(50, 550.0f, "Hoả tốc")); }

    // Nhóm 2: Thường
    @Test void testID14() { assertEquals("Invalid", cal.calculator(-1, -1.0f, "Thường")); }
    @Test void testID15() { assertEquals("Invalid", cal.calculator(1, -1.0f, "Thường")); }
    @Test void testID16() { assertEquals("25.000", cal.calculator(1, 10.0f, "Thường")); }
    @Test void testID17() { assertEquals("35.000", cal.calculator(1, 150.0f, "Thường")); }
    @Test void testID18() { assertEquals("Invalid", cal.calculator(1, 550.0f, "Thường")); }
    @Test void testID19() { assertEquals("Invalid", cal.calculator(10, -1.0f, "Thường")); }
    @Test void testID20() { assertEquals("35.000", cal.calculator(10, 10.0f, "Thường")); }
    @Test void testID21() { assertEquals("45.000", cal.calculator(10, 150.0f, "Thường")); }
    @Test void testID22() { assertEquals("Invalid", cal.calculator(10, 550.0f, "Thường")); }
    @Test void testID23() { assertEquals("Invalid", cal.calculator(50, -1.0f, "Thường")); }
    @Test void testID24() { assertEquals("Invalid", cal.calculator(50, 10.0f, "Thường")); }
    @Test void testID25() { assertEquals("Invalid", cal.calculator(50, 150.0f, "Thường")); }
    @Test void testID26() { assertEquals("Invalid", cal.calculator(50, 550.0f, "Thường")); }
}