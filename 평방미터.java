package 이지한과제;
import java.util.Scanner;
public class 평방미터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int 평;
double 평방미터;

	Scanner input = new Scanner(System.in);
	System.out.print("평을 입력하시오: ");
	평 = input.nextInt();
	
	평방미터= 3.3058*평;
	System.out.println(평방미터+"미터제곱입니다.");

	

	}

}
