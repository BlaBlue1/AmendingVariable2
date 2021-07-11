import java.util.Scanner;

public class AmendingVariable2 {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;
        int annualSalary = 62000;
        float increment = 0.1F;
        float yearOneSalary = annualSalary + (annualSalary * increment);
        float yearTwoSalary = yearOneSalary + (yearOneSalary * increment);
        float yearThreeSalary = yearTwoSalary + (yearTwoSalary * increment);
        float yearFourSalary = yearThreeSalary + (yearThreeSalary * increment);
        float yearFiveSalary = yearFourSalary + (yearFourSalary * increment);
        System.out.println("Fifth year Salary is: " + yearFiveSalary);

        System.out.print("How much is your salary?");
        num1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("How many years did you work?");
        num2 = keyboard.nextInt();
        keyboard.nextLine();


    }


}
