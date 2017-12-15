package 이지한과제;
import java.util.Scanner;
public class 저금통 {
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a;
	 int b;
	 int c;
	 int d;
	 int sum;
	 Scanner input = new Scanner(System.in);
 System.out.print("오백원을 입력하시오: ");
 a = input.nextInt();
 
 System.out.print("백원을 입력하시오: ");
 b= input.nextInt();
 
 System.out.print("오십원을 입력하시오: ");
 c = input.nextInt();
 
 System.out.print("십원을 입력하시오: ");
 d = input.nextInt();
 
 sum= 500*a+100*b+50*c+10*d;
 System.out.println(sum);
 
 
 
	}

}
