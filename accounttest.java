package 이지한과제;
import java.util.Scanner;
public class accounttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    account myaccount = new account();
    myaccount.input();
    String id1,pw1;
    Scanner scan = new Scanner(System.in);
    System.out.print("id: ");
    id1 = scan.nextLine();
    System.out.print("pw: ");
    pw1 = scan.nextLine();
    myaccount.testing(id1,pw1);
	}

}
