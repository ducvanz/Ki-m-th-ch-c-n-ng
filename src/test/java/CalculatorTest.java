import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator cal = new Calculator();

    @Test void testID1() { assertEquals("30.000", cal.calculator(0, 0.0f, "Hoả tốc")); }
    @Test void testID2() { assertEquals("25.000", cal.calculator(0, 0.0f, "Thường")); }
    @Test void testID3() { assertEquals("30.000", cal.calculator(0, 0.1f, "Hoả tốc")); }
    @Test void testID4() { assertEquals("25.000", cal.calculator(0, 0.1f, "Thường")); }
    @Test void testID5() { assertEquals("66.000", cal.calculator(0, 250.0f, "Hoả tốc")); }
    @Test void testID6() { assertEquals("55.000", cal.calculator(0, 250.0f, "Thường")); }
    @Test void testID7() { assertEquals("125.976", cal.calculator(0, 499.9f, "Hoả tốc")); }
    @Test void testID8() { assertEquals("104.980", cal.calculator(0, 499.9f, "Thường")); }
    @Test void testID9() { assertEquals("126.000", cal.calculator(0, 500.0f, "Hoả tốc")); }
    @Test void testID10() { assertEquals("105.000", cal.calculator(0, 500.0f, "Thường")); }

    @Test void testID11() { assertEquals("30.000", cal.calculator(1, 0.0f, "Hoả tốc")); }
    @Test void testID12() { assertEquals("25.000", cal.calculator(1, 0.0f, "Thường")); }
    @Test void testID13() { assertEquals("30.000", cal.calculator(1, 0.1f, "Hoả tốc")); }
    @Test void testID14() { assertEquals("25.000", cal.calculator(1, 0.1f, "Thường")); }
    @Test void testID15() { assertEquals("66.000", cal.calculator(1, 250.0f, "Hoả tốc")); }
    @Test void testID16() { assertEquals("55.000", cal.calculator(1, 250.0f, "Thường")); }
    @Test void testID17() { assertEquals("125.976", cal.calculator(1, 499.9f, "Hoả tốc")); }
    @Test void testID18() { assertEquals("104.980", cal.calculator(1, 499.9f, "Thường")); }
    @Test void testID19() { assertEquals("126.000", cal.calculator(1, 500.0f, "Hoả tốc")); }
    @Test void testID20() { assertEquals("105.000", cal.calculator(1, 500.0f, "Thường")); }

    @Test void testID21() { assertEquals("54.000", cal.calculator(15, 0.0f, "Hoả tốc")); }
    @Test void testID22() { assertEquals("45.000", cal.calculator(15, 0.0f, "Thường")); }
    @Test void testID23() { assertEquals("54.000", cal.calculator(15, 0.1f, "Hoả tốc")); }
    @Test void testID24() { assertEquals("45.000", cal.calculator(15, 0.1f, "Thường")); }
    @Test void testID25() { assertEquals("90.000", cal.calculator(15, 250.0f, "Hoả tốc")); }
    @Test void testID26() { assertEquals("75.000", cal.calculator(15, 250.0f, "Thường")); }
    @Test void testID27() { assertEquals("149.976", cal.calculator(15, 499.9f, "Hoả tốc")); }
    @Test void testID28() { assertEquals("124.980", cal.calculator(15, 499.9f, "Thường")); }
    @Test void testID29() { assertEquals("150.000", cal.calculator(15, 500.0f, "Hoả tốc")); }
    @Test void testID30() { assertEquals("125.000", cal.calculator(15, 500.0f, "Thường")); }

    @Test void testID31() { assertEquals("87.600", cal.calculator(29, 0.0f, "Hoả tốc")); }
    @Test void testID32() { assertEquals("73.000", cal.calculator(29, 0.0f, "Thường")); }
    @Test void testID33() { assertEquals("87.600", cal.calculator(29, 0.1f, "Hoả tốc")); }
    @Test void testID34() { assertEquals("73.000", cal.calculator(29, 0.1f, "Thường")); }
    @Test void testID35() { assertEquals("123.600", cal.calculator(29, 250.0f, "Hoả tốc")); }
    @Test void testID36() { assertEquals("103.000", cal.calculator(29, 250.0f, "Thường")); }
    @Test void testID37() { assertEquals("183.576", cal.calculator(29, 499.9f, "Hoả tốc")); }
    @Test void testID38() { assertEquals("152.980", cal.calculator(29, 499.9f, "Thường")); }
    @Test void testID39() { assertEquals("183.600", cal.calculator(29, 500.0f, "Hoả tốc")); }
    @Test void testID40() { assertEquals("153.000", cal.calculator(29, 500.0f, "Thường")); }

    @Test void testID41() { assertEquals("90.000", cal.calculator(30, 0.0f, "Hoả tốc")); }
    @Test void testID42() { assertEquals("75.000", cal.calculator(30, 0.0f, "Thường")); }
    @Test void testID43() { assertEquals("90.000", cal.calculator(30, 0.1f, "Hoả tốc")); }
    @Test void testID44() { assertEquals("75.000", cal.calculator(30, 0.1f, "Thường")); }
    @Test void testID45() { assertEquals("126.000", cal.calculator(30, 250.0f, "Hoả tốc")); }
    @Test void testID46() { assertEquals("105.000", cal.calculator(30, 250.0f, "Thường")); }
    @Test void testID47() { assertEquals("185.976", cal.calculator(30, 499.9f, "Hoả tốc")); }
    @Test void testID48() { assertEquals("154.980", cal.calculator(30, 499.9f, "Thường")); }
    @Test void testID49() { assertEquals("186.000", cal.calculator(30, 500.0f, "Hoả tốc")); }
    @Test void testID50() { assertEquals("155.000", cal.calculator(30, 500.0f, "Thường")); }
}