package 이지한과제;

class Plane {
	private String brand;
	private String model;
	private int passenser; 
	static int planes=0;
	private int id;
	public String getBrand() {
		return brand;}
    public void setBrand(String b) {
    	brand =b;
    }
    public String getModel() {
    	return model;
    }
	public void setModel(String m) {
		model = m;
	}
    public int getPassenser(){
    	return passenser;
    }
    public void setPassenser(int p) {
    	passenser = p;
    }
    public Plane (String b,String m,int p) {
    	brand = b;
    	model = m;
    	passenser = p;
    	id = ++planes;
    }
    public Plane () {
    	
    }
    public static int getPlanes() {
    	return planes;
    }
}
