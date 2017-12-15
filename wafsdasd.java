package 이지한과제;
import java.util.Scanner;
public class wafsdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double 키,표준체중,몸무게;

Scanner input = new Scanner(System.in);
 System.out.println("키를 입력하세요: ");
 키=input.nextDouble();
 System.out.println("몸무게를 입력하세요: ");
 몸무게 = input.nextDouble();
 표준체중=(키-100)*0.9;
 if(몸무게>=표준체중*0.9&&몸무게<=표준체중*1.1)
	 System.out.println("정상입니다.");
 else if(몸무게>=표준체중*1.1)
	 System.out.println("과체중 입니다.");
 else
 System.out.println("저체중입니다.");
	}

}
