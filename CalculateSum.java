import java.util.Scanner;
class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] arr = new double[n]; 
        double sum = 0.0;
        int index = 0;

        while (true) {
            System.out.println("Enter a number:");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            arr[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println("\nSum is " + sum);
        sc.close(); 
    }
}
