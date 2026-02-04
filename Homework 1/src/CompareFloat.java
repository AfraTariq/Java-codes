public class CompareFloat
{
    public static void main(String[] args)
    {
        double value = 0.9994;
        int places = 3;
        double scale = Math.pow(10, places);
        double rounded = Math.round(value * scale) / scale;
        System.out.println(rounded);
    }
}
