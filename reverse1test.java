package 이지한과제;
import java.util.Scanner;
public class reverse1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tostring;
		Scanner scan = new Scanner(System.in);
reverse1 myreverse1= new reverse1();
System.out.print("문자열을 입력하시오: ");
tostring = scan.nextLine();
myreverse1.reverse(tostring);

	}

}
