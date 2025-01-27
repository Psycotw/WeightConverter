import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");
        System.out.println("choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1){
                System.out.println("Enter the weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453492;
                System.out.printf("the new weight in kgs is: %.2f" , newWeight);

            }else if (choice == 2){
                System.out.println("Enter the weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("the new weight in lbs is: %.2f" , newWeight);

            }else {
                System.out.println("that was not a valid choice");
            }

        scanner.close();
        }


    }
