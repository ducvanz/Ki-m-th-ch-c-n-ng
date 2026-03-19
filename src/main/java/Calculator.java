public class Calculator {
    // Version 1
    public String calculator(int w, float d, String s) {
        float Pw = (w <= 5) ? 15 : 15 + 2 * (w - 5);
        float Pd = (d <= 100) ? 10 : 10 + 0.2f * (d - 100);
        float alpha = "Hoả tốc".equals(s) ? 1.2f : 1.0f;

        float result = (Pw + Pd) * alpha;

        return String.format(java.util.Locale.US, "%.3f", result);
    }

    // Version 2
//    public String calculator(int w, float d, String s) {
//        if (w < 0 || w > 30 || d < 0 || d > 500) {
//            return "Invalid";
//        }
//        float Pw = (w <= 5) ? 15 : 15 + 2 * (w - 5);
//        float Pd = (d <= 100) ? 10 : 10 + 0.2f * (d - 100);
//        float alpha = "Hoả tốc".equals(s) ? 1.2f : 1.0f;
//
//        float result = (Pw + Pd) * alpha;
//
//        return String.format(java.util.Locale.US, "%.3f", result);
//    }
}