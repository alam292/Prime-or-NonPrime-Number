import java.util.*;
public class prime_nonprime {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if(number == 2){
            System.out.println("Number is prime");
        }
        else{
            boolean isPrime = true;
            for(int i =2;i<=Math.sqrt(number);i++){                         // Math.sqrt(number) == n-1
                if(number%2==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not Prime");
            }
        }
    }
}
