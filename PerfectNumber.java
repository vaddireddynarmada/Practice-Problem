import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num= sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum==num){
            System.out.println(sum+" is perfect number");
        }
        else{
            System.out.println(sum+" is not perfect number");
        }
    }
}