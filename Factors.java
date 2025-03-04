import java.util.*;
class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int M = 10;
        int index = 0;
        int [] arr = new int[M];
        for (int i=1;i<=n;i++){
            if (index ==M){
                M*=2;
                arr = Arrays.copyOf(arr,M);
                
            }
            if (n % i == 0) {  
                arr[index++] = i;  
            }

        }
        System.out.print("Factors of " + n + " are: ");
for (int i = 0; i < index; i++) {
    System.out.print(arr[i] + " ");
}
sc.close();

    }
}