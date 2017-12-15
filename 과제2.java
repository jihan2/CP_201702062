package 이지한과제;
import java.util.Scanner;
public class 과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   
   double F;
   double C;
   
   System.out.print("화씨온도를 입력해주세요: ");
    F = input.nextDouble();
    
    C = 5/9.0*(F-32);
     System.out.print("섭씨온도는"+C+"입니다.");     		
	}

}
