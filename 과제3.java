package �����Ѱ���;
 import java.util.Scanner;
 
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
    
int x;
   double y;
   double z;
   double a;
   
   
  
   System.out.print("Ű�� �Է��Ͻÿ�: ");
   x = input.nextInt();
    
  

   a = x/(2.54*12);
   y = (int)a;
   z = (x-2.54*12*y)/2.54;
   
   System.out.print(x+"cm�� "+y+"��Ʈ"+z+"��ġ�Դϴ�.");
   
   
   
   
   
   
   
   
   
   
   
	}

}
