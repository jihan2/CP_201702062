package 이지한과제;
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
		System.out.println("삼각형의 width를 입력해주세요");
         		width = scan.nextInt();
         		System.out.println("삼각형의 height를 입력해주세요");
         		height = scan.nextInt();
		System.out.println("삼각형의 넓이는: "+width*height*1/2);
	}
	
}
class Rectangle extends Shape{
	

	public void  area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형의 width를 입력해주세요");
		width = scan.nextInt();
		System.out.println("사각형의 height를 입력해주세요");
		height = scan.nextInt();
System.out.println("사각형의 넓이는: "+width*height);
}
}
class Circle extends Shape{
	
	int radius;
	public void area() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 radius를 입력해주세요");
		radius = scan.nextInt();
	System.out.println(radius*radius*3.14);
	}
	
	}