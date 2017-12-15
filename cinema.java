package 이지한과제;

import java.util.Scanner;
public class cinema {
   public static void main(String[] args) {
	   
      int []a = new int[10];
      Scanner scan = new Scanner(System.in);
      do {
      System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
      int b = scan.nextInt();
      if(b == 1) {
    	 System.out.println("현재의 예약 상태는 다음과 같습니다.");
         System.out.println("---------------------------------");
         System.out.println("1 2 3 4 5 6 7 8 9 10");
         System.out.println("---------------------------------");
         for(int i = 0;i<a.length;i++) { 
             System.out.print(a[i]+" ");
             }
             System.out.println("");
             System.out.print("몇번째 좌석을 예약하시겠습니까? ");
             int c = scan.nextInt();
             if(a[c - 1] == 0) {
                System.out.println("예약되었습니다.");
                a[c - 1] = 1;
                }
             else
                System.out.println("예약된 좌석입니다."); 
          }
          else  {
             System.out.println("다시 입력해주세요 ");
          }
          
          } while(true);
      
       }
    }