import javax.swing.*;

public class CarInsurance
{
    public static void main(String[] args) {
        String Year = JOptionPane.showInputDialog(null, "Enter the year of " +
                "birth:", "Car Insurance", JOptionPane.QUESTION_MESSAGE);
        int intYear = Integer.parseInt(Year);
        int Age = 2018 - intYear;
        if (Age > 30) {
            System.out.println("Eligible for 20% discount");
        }
        else{
            System.out.println("Not eligible for 20% discount");
        }
    }
}
