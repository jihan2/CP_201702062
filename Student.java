package 이지한과제;



class Student {
 public String 이름;
 public String 학번;
 public String 소속학과;
 int 이수학점수,학년;
 public String get이름() {
	return 이름; 
 }
 public void set이름(String a) {
	 이름=a;
 }
 public String get학번() {
	 return 학번;
 }
 public void set학번(String b) {
	 학번=b;
 }
public String get소속학과() {
	return 소속학과;
}
public void set소속학과(String c) {
	소속학과 = c;
}
public int get학년() {
	return 학년;
}
public void set학년(int d) {
	학년=d;
}
public int get이수학점수() {
	return 이수학점수;
}
public void set이수학점수(int e) {
	이수학점수=e;
}
public void print() {
	
	System.out.println("이름: "+get이름());
	System.out.println("학번: "+get학번());
	System.out.println("소속학과: "+get소속학과());
	System.out.println("학년: "+get학년());
	System.out.println("이수학점수: "+get이수학점수());
}
}
class Graudate extends Student{
	public String 조교유형;
	double 장학금비율;
	
	public String get조교유형() {
		return 조교유형;
	}
	public void set조교유형(String a) {
		조교유형=a;
	}
	public double get장학금비율() {
		return 장학금비율;
	}
	public void set장학금비율(double a) {
		장학금비율=a;
	}
	public void print() {
		super.print();
		System.out.println("조교유형: "+get조교유형());
		System.out.println("장학금비율: "+get장학금비율());
	}
}
class Undergraudate extends Student{
	public String 소속동아리명;
	public String get소속동아리명() {
		return 소속동아리명;
	}
	public void set소속동아리명(String a) {
		소속동아리명=a;
	}
	public void print() {
		super.print();
		System.out.println("소속동아리명: "+get소속동아리명());
	}
}