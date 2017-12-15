package 이지한과제;
import java.util.Scanner;
 class account {
	 String id,pw;
	 Scanner scan = new Scanner(System.in);
	 public void input() {
		 System.out.print("아이디를 입력하시오: ");
		 id = scan.nextLine();
		 System.out.print("비밀번호를 입력하시오: ");
		 pw = scan.nextLine(); 
		 }
	public void testing(String a,String b) {
		if(id.equals(a)&&pw.equals(b))
			System.out.println("로그인에  성공하였습니다.");
		else
			System.out.println("로그인에 실패했습니다.");
		
	}
	 
}
