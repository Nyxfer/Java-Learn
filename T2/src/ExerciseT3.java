public class ExerciseT3 {

    private static double calculateCircleArea(double radius)
    {
        double CircleArea = Math.PI * radius * radius;
        return CircleArea;
    }

    private static double calculateCylinderVolume(double radius, double length)
    {
        double CylinderVolume = Math.round(calculateCircleArea(radius) *
                length *1000)/1000;
        return CylinderVolume;
    }

    private static void displayCalculationResult (double radius, double length)
    {
        System.out.print("The result is: " + calculateCylinderVolume(radius,
                length) + "cm");
    }

    public static void main(String[] args)
    {
        double radius = 5;
        double length = 9.5;
        displayCalculationResult(radius, length);
    }
}
