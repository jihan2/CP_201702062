package 이지한과제;
import java. util.Scanner;
public class asda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner scan=new Scanner(System.in);
System.out.print("정수를 입력하시요: ");
a=scan.nextInt();
System.out.print("정수를 입력하시요: ");
b=scan.nextInt();
System.out.print("정수를 입력하시요: ");
c=scan.nextInt();
if(a>b&&b>c) 
	System.out.print("정렬된 숫자: "+c+" "+b+" "+a);
else if(a>c&&c>b)
	System.out.print("정렬된 숫자: "+b+" "+c+" "+a);
else if(b>a&&a>c)
	System.out.print("정렬된 숫자: "+c+" "+a+" "+b);
else if(b>c&&c>a)
	System.out.print("정렬된 숫자: "+a+" "+c+" "+b);
else if(c>a&&a>b)
	System.out.print("정렬된 숫자: "+b+" "+a+" "+c);
else
	System.out.print("정렬된 숫자: "+a+" "+b+" "+c);



	}

}
