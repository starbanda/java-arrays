import java.util.Scanner;
class MeanHieght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =11;
        double [] players = new double[11];
        System.out.println("Enter Height of all 11 Players");
        for (int i=0;i<n;i++){
            players[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (double i: players){
            sum+=i;
        }
        Double mean = sum/n;
        System.out.println("Mean of the team is " + mean);

    }
}