package �����Ѱ���;
import java.util.Scanner;
 class account {
	 String id,pw;
	 Scanner scan = new Scanner(System.in);
	 public void input() {
		 System.out.print("���̵� �Է��Ͻÿ�: ");
		 id = scan.nextLine();
		 System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		 pw = scan.nextLine(); 
		 }
	public void testing(String a,String b) {
		if(id.equals(a)&&pw.equals(b))
			System.out.println("�α��ο�  �����Ͽ����ϴ�.");
		else
			System.out.println("�α��ο� �����߽��ϴ�.");
		
	}
	 
}
