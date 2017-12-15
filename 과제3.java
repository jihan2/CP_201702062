package 이지한과제;
 import java.util.Scanner;
 
public class 과제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
    
int x;
   double y;
   double z;
   double a;
   
   
  
   System.out.print("키를 입력하시오: ");
   x = input.nextInt();
    
  

   a = x/(2.54*12);
   y = (int)a;
   z = (x-2.54*12*y)/2.54;
   
   System.out.print(x+"cm는 "+y+"피트"+z+"인치입니다.");
   
   
   
   
   
   
   
   
   
   
   
	}

}
