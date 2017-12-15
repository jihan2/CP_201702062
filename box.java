package 이지한과제;

 class box { 
	 public int 가로,세로,높이 ;
	 public void set가로(int a) {
	 가로 =a;
	 }
	 public void set세로(int b) {
		 세로 =b;
	 }
	 public void set높이(int c) {
		 높이 =c;
	 }
	 public int get가로() {
		 return 가로;
	 }
	 public int get세로() {
		 return 세로;
	 }
	 public int get높이() {
		 return 높이;
	 }
	 public int getVolume() {
		 return 가로*세로*높이;
	 }
	 public void print() {
		 System.out.print(getVolume());
	 
}
 } 
 
