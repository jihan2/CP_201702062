package �����Ѱ���;
import java.util.Scanner;
public class StudentTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
	
		 Scanner input =new Scanner(System.in);
		 System.out.println("�кθ� 1or ���п����̸�2");
		  c= input.nextInt();   
	Undergraudate	  a = new Undergraudate();
 
 Graudate b=new Graudate();
 a.set�Ҽӵ��Ƹ���("admin");
 a.set�̸�("������");
 a.set�й�("201702062");
 a.set�Ҽ��а�("��ǻ�Ͱ��а�");
 a.set�г�(1);
 a.set�̼�������(17);
 b.set�̸�("������");
 b.set�й�("200802062");
 b.set�Ҽ��а�("��ǻ�Ͱ��а�");
 b.set�г�(2);
  b.set�̼�������(20);
 b.set��������("���� ����");
 b.set���бݺ���(0.5);
 
if(c==1) {
	 a.print();
 }
else if (c==2) {
	b.print();
}

	}

}
