package 이지한과제;
import java.util.Scanner;
public class 과제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double r;
   double h;
   double v;
   double PI;
   Scanner input = new Scanner(System.in);
   
   System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
   r = input.nextDouble();
   
   System.out.print("원기둥의 높이를 입력하시오: ");
   h = input.nextDouble();
   
   PI = 3.141592;
   v = PI*r*r*h;
   
   System.out.print("원기둥의 부피는 "+v+"입니다.");
	}

}
