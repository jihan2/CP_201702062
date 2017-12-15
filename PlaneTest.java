package 이지한과제;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Plane p1= new Plane("대한항공","a486",500);
    Plane p2= new Plane("아시아나","v545",600);
    int n =Plane.getPlanes();
    System.out.println("생성된 비행기의 수= "+n);
    
	}

}
