package �����Ѱ���;



class Student {
 public String �̸�;
 public String �й�;
 public String �Ҽ��а�;
 int �̼�������,�г�;
 public String get�̸�() {
	return �̸�; 
 }
 public void set�̸�(String a) {
	 �̸�=a;
 }
 public String get�й�() {
	 return �й�;
 }
 public void set�й�(String b) {
	 �й�=b;
 }
public String get�Ҽ��а�() {
	return �Ҽ��а�;
}
public void set�Ҽ��а�(String c) {
	�Ҽ��а� = c;
}
public int get�г�() {
	return �г�;
}
public void set�г�(int d) {
	�г�=d;
}
public int get�̼�������() {
	return �̼�������;
}
public void set�̼�������(int e) {
	�̼�������=e;
}
public void print() {
	
	System.out.println("�̸�: "+get�̸�());
	System.out.println("�й�: "+get�й�());
	System.out.println("�Ҽ��а�: "+get�Ҽ��а�());
	System.out.println("�г�: "+get�г�());
	System.out.println("�̼�������: "+get�̼�������());
}
}
class Graudate extends Student{
	public String ��������;
	double ���бݺ���;
	
	public String get��������() {
		return ��������;
	}
	public void set��������(String a) {
		��������=a;
	}
	public double get���бݺ���() {
		return ���бݺ���;
	}
	public void set���бݺ���(double a) {
		���бݺ���=a;
	}
	public void print() {
		super.print();
		System.out.println("��������: "+get��������());
		System.out.println("���бݺ���: "+get���бݺ���());
	}
}
class Undergraudate extends Student{
	public String �Ҽӵ��Ƹ���;
	public String get�Ҽӵ��Ƹ���() {
		return �Ҽӵ��Ƹ���;
	}
	public void set�Ҽӵ��Ƹ���(String a) {
		�Ҽӵ��Ƹ���=a;
	}
	public void print() {
		super.print();
		System.out.println("�Ҽӵ��Ƹ���: "+get�Ҽӵ��Ƹ���());
	}
}