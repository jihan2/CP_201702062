package �����Ѱ���;
import java.util.Scanner;
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double r;
   double h;
   double v;
   double PI;
   Scanner input = new Scanner(System.in);
   
   System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
   r = input.nextDouble();
   
   System.out.print("������� ���̸� �Է��Ͻÿ�: ");
   h = input.nextDouble();
   
   PI = 3.141592;
   v = PI*r*r*h;
   
   System.out.print("������� ���Ǵ� "+v+"�Դϴ�.");
	}

}
