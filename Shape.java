package �����Ѱ���;
import java.util.Scanner;
 class Shape {
	 int width,height;
	
	public void area() {System.out.println(); 
		// TODO Auto-generated method stub
		
	}
 }
class Triangle extends Shape{
  

	public void area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� width�� �Է����ּ���");
         		width = scan.nextInt();
         		System.out.println("�ﰢ���� height�� �Է����ּ���");
         		height = scan.nextInt();
		System.out.println("�ﰢ���� ���̴�: "+width*height*1/2);
	}
	
}
class Rectangle extends Shape{
	

	public void  area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�簢���� width�� �Է����ּ���");
		width = scan.nextInt();
		System.out.println("�簢���� height�� �Է����ּ���");
		height = scan.nextInt();
System.out.println("�簢���� ���̴�: "+width*height);
}
}
class Circle extends Shape{
	
	int radius;
	public void area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� radius�� �Է����ּ���");
		radius = scan.nextInt();
	System.out.println(radius*radius*3.14);
	}
	
	}