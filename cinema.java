package �����Ѱ���;

import java.util.Scanner;
public class cinema {
   public static void main(String[] args) {
	   
      int []a = new int[10];
      Scanner scan = new Scanner(System.in);
      do {
      System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
      int b = scan.nextInt();
      if(b == 1) {
    	 System.out.println("������ ���� ���´� ������ �����ϴ�.");
         System.out.println("---------------------------------");
         System.out.println("1 2 3 4 5 6 7 8 9 10");
         System.out.println("---------------------------------");
         for(int i = 0;i<a.length;i++) { 
             System.out.print(a[i]+" ");
             }
             System.out.println("");
             System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
             int c = scan.nextInt();
             if(a[c - 1] == 0) {
                System.out.println("����Ǿ����ϴ�.");
                a[c - 1] = 1;
                }
             else
                System.out.println("����� �¼��Դϴ�."); 
          }
          else  {
             System.out.println("�ٽ� �Է����ּ��� ");
          }
          
          } while(true);
      
       }
    }