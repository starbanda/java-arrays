import java.util.Scanner;
public class NumberCheck{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int n=5;
int [] arr = new int [n];
for (int i =0;i<n;i++){
arr[i] = sc.nextInt();

}
for (int num :arr){
 if(num > 0){
	if(num%2 ==0){
	   System.out.println(num+"is Positive and Even");
	}
 else{
 System.out.print(num +"is positive and odd"); 
}
}
else if (num==0){
System.out.println(num+"Number is Zero");
}
else {
    if(num%2 ==0){
           System.out.println(num+"is Negative and Even"); 
        }
 else{
 System.out.print(num +"is Negative and odd");
}
}
  if (arr[0] > arr[n - 1]) {
            System.out.println("First element is greater than last element.");
        } else if (arr[0] < arr[n - 1]) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }
}

	}
}
