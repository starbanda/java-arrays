import java.util.Scanner;
public class voting{
public static void main (String[] args){
Scanner sc = new Scanner (System.in);
 int[] arr = new int[10];
// input loop
 for (int i=0;i<10;i++){
    arr[i] = sc.nextInt();
	if (arr[i] <=0){
	System.out.println("Invalid Age");
	}
	}
// check avability.
 for (int i=0;i<10;i++){
   if (arr[i] >=18){
	System.out.println("The student with age "+arr[i]+"can Vote.");
	}
   else {
 	System.out.println("The student with the age "+arr[i]+" cannot vote");
	}

      }
   }
}
