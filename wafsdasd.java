package �����Ѱ���;
import java.util.Scanner;
public class wafsdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double Ű,ǥ��ü��,������;

Scanner input = new Scanner(System.in);
 System.out.println("Ű�� �Է��ϼ���: ");
 Ű=input.nextDouble();
 System.out.println("�����Ը� �Է��ϼ���: ");
 ������ = input.nextDouble();
 ǥ��ü��=(Ű-100)*0.9;
 if(������>=ǥ��ü��*0.9&&������<=ǥ��ü��*1.1)
	 System.out.println("�����Դϴ�.");
 else if(������>=ǥ��ü��*1.1)
	 System.out.println("��ü�� �Դϴ�.");
 else
 System.out.println("��ü���Դϴ�.");
	}

}
