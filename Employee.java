package �����Ѱ���;

class Employee {
	public int ����;
    public String �̸�,��ȭ��ȣ;
	public void set�̸�(String a) {
		�̸� =a;
	}
	public void set��ȭ��ȣ(String b) {
			��ȭ��ȣ =b;
	}
	public void set����(int c) {
		����=c;
	}
    public String get�̸�() {
    	return �̸�;
    }
    public String get��ȭ��ȣ() {
    	return ��ȭ��ȣ;
    }
    public int get����() {
    	return ����;
    }
    void print() {
    	System.out.println(�̸�);
    	System.out.println(��ȭ��ȣ);
    	System.out.println(����);
    }
}
