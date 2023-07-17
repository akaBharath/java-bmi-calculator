import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("*** BMI CALCULATOR ***");
        while(true){
            try {
                System.out.print("Enter your weight in KG: ");
                int weight = s.nextInt();

                System.out.print("Enter your height in M or CM: ");
                double height = s.nextDouble();

                BMI bmi = new BMI(weight, height);
                System.out.printf("\nYour BMI is '%f' and you are %s! Type any word to exit!\n\n", bmi.getBMI(), bmi.getStatus());

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e){
                break;
            }
        }
    }
}
