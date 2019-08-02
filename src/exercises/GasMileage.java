package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        float miles;
        float gas;
        float mileage;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        miles = in.nextInt();

        System.out.println("Enter gas used (in gallons): ");
        gas = in.nextInt();

        mileage = gas / miles;
        System.out.println("Your gas mileage is: " + mileage);


    }

}
