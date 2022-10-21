package practicejava31;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ClassA.addition(30, 30); 
            ClassA obj = new ClassA();
            obj.subtraction(100,40);
            obj.multiplication(25, 120);
            obj.division1(30,20);
            obj.division2(30,15);
	}

	
	public  static void addition(int a, int b ) {
		
		System.out.println(a+b);
	}
	
	public  void subtraction(int a, int b ) {
	
      System.out.println(a-b);
	}
	
	public void multiplication(int a,int b) {
	      System.out.println(a*b);
   }
	
	public void division1(float a, float b) {
		
		System.out.println(a/b);
		
  }
	
	public void division2(int a,int b ) {
	
	System.out.println(a/b);

	}
	
	public void division3(int a,int b ) {
	
	System.out.println(a/b);

	}
		public void multiplication1(int a,int b) {
         System.out.println(a*b);
}
}