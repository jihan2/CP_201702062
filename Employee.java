package 이지한과제;

class Employee {
	public int 연봉;
    public String 이름,전화번호;
	public void set이름(String a) {
		이름 =a;
	}
	public void set전화번호(String b) {
			전화번호 =b;
	}
	public void set연봉(int c) {
		연봉=c;
	}
    public String get이름() {
    	return 이름;
    }
    public String get전화번호() {
    	return 전화번호;
    }
    public int get연봉() {
    	return 연봉;
    }
    void print() {
    	System.out.println(이름);
    	System.out.println(전화번호);
    	System.out.println(연봉);
    }
}
