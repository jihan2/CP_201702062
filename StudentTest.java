package 이지한과제;
import java.util.Scanner;
public class StudentTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
	
		 Scanner input =new Scanner(System.in);
		 System.out.println("학부면 1or 대학원생이면2");
		  c= input.nextInt();   
	Undergraudate	  a = new Undergraudate();
 
 Graudate b=new Graudate();
 a.set소속동아리명("admin");
 a.set이름("이지한");
 a.set학번("201702062");
 a.set소속학과("컴퓨터공학과");
 a.set학년(1);
 a.set이수학점수(17);
 b.set이름("이지한");
 b.set학번("200802062");
 b.set소속학과("컴퓨터공학과");
 b.set학년(2);
  b.set이수학점수(20);
 b.set조교유형("교육 조교");
 b.set장학금비율(0.5);
 
if(c==1) {
	 a.print();
 }
else if (c==2) {
	b.print();
}

	}

}
