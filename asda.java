package �����Ѱ���;
import java. util.Scanner;
public class asda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner scan=new Scanner(System.in);
System.out.print("������ �Է��Ͻÿ�: ");
a=scan.nextInt();
System.out.print("������ �Է��Ͻÿ�: ");
b=scan.nextInt();
System.out.print("������ �Է��Ͻÿ�: ");
c=scan.nextInt();
if(a>b&&b>c) 
	System.out.print("���ĵ� ����: "+c+" "+b+" "+a);
else if(a>c&&c>b)
	System.out.print("���ĵ� ����: "+b+" "+c+" "+a);
else if(b>a&&a>c)
	System.out.print("���ĵ� ����: "+c+" "+a+" "+b);
else if(b>c&&c>a)
	System.out.print("���ĵ� ����: "+a+" "+c+" "+b);
else if(c>a&&a>b)
	System.out.print("���ĵ� ����: "+b+" "+a+" "+c);
else
	System.out.print("���ĵ� ����: "+a+" "+b+" "+c);



	}

}
