package �����Ѱ���;

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
	 System.out.println("�̸�:"+name+" "+"�ּ�:"+address+" "+"��ȭ��ȣ:"+phonenumber);
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
		   System.out.println("����ȣ:"+customernumber+" "+"���ϸ���:"+mileage);
	   }
}