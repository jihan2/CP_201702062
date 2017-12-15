package 이지한과제;
import java.util.Random;
public class 로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0; 
int num2=0;
int num3=0; 
int num4=0; 
int num5=0; 
int num6=0; 
int a;
 Random rand = new Random(System.currentTimeMillis());
	for(int i=0; i<6; i++) { 
		a = rand.nextInt(46);
	 
           switch(i) {   
           case 0:
        	   num1 =a;
        	   
           case 1:
        	   num2=a;
        	   while(num1==num2||num2==0) {
        	   num2=rand.nextInt(46);
        	   }
        	   break;        		  
           case 2:
        	   num3=a;
        	   while(num1==num3||num2==num3||num3==0) {
        		   num3=rand.nextInt(46);
        	   }
           case 3:
        	   num4=a;
        	   while(num1==num4||num2==num4||num3==num4||num4==0) {
        		   num4=rand.nextInt(46);
        	   }
           case 4:
        	   num5=a;
        	   while(num1==5||num2==num5||num3==num5||num4==num5||num5==0) {
        		  num5=rand.nextInt(46); 
        	   }
           case 5:
        	   num6=a;
        	   while(num1==num6||num2==num6||num3==num6||num4==num6||num5==num6||num6==0) {
        		   num6=rand.nextInt(46);
        	   }
        	   
            
            
           }
	}
           System.out.println("<로또 생성 프로그램>");
           System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
           
 
 }
}
