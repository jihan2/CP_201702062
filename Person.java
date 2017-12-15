package 이지한과제;

 class Person {
public String name;
public String address;
public String phonenumber;

public void setName(String n ) {
	name = n;
}
public void setAddress(String a) {
	address = a;
}
public void setPhonenumber(String p) {
	phonenumber = p ;
}
 public void println() {
	 System.out.println("이름:"+name+" "+"주소:"+address+" "+"전화번호:"+phonenumber);
 }
}

 class Customer extends Person{
	   int customernumber;
	   int mileage;
	 public void setCustomernumber(int c) {
		 customernumber =c;
	 }
	 public void setMileage(int m) {
		 mileage = m;
	 }
	   public void println() {
		   super.println();
		   System.out.println("고객번호:"+customernumber+" "+"마일리지:"+mileage);
	   }
}