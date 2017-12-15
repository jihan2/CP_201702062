package 이지한과제;
import java.util.Scanner;
public class 과제1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
  
		Scanner input = new Scanner(System.in);
   
   double x;
   double y;
   
   System.out.print("마일을 입력하시오: ");
   x = input.nextDouble();
   
   y = x*1.609;
		   
	 System.out.print(x+"마일은"+y+"킬로미터 입니다.");
	 }
}
