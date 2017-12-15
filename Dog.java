package 이지한과제;
class Dog {
	
	String name;
	static String breed;
	int age;
	
	public Dog (String a, int b) {
		name= a;
		age = b;
		
	}
    public Dog(String a,int b,String c) {
    	name = a;
    	age = b;
    	breed = c;
    }
   void print(){
	   System.out.println(name+" "+breed+" "+age);
	   
	   
	   
	   
   }
}
