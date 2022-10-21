package practicejava31;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassB.getpercentage2("Rutuja ",125);
		
		ClassB obj = new ClassB();
		
		obj.getpercentage("Sakshi" , 65f );
		obj.getpercentage("Pranav", 110f);
		
	}
     
    public void getpercentage(String Studentname ,  float obtainedmarks) {
    	int maxmarks = 150;
    	float percentage= (obtainedmarks/maxmarks);
    	float finalpercentage = percentage*100;
    	System.out.println("Student name: " + Studentname);
    	System.out.println("Got " + finalpercentage);
    	
    }
    	 public static void getpercentage2(String Studentname2 ,  float obtainedmarks2) {
        	int maxmarks = 150;
        	float percentage= (obtainedmarks2/maxmarks);
        	float finalpercentage = percentage*100;
        	System.out.println("Student name: " + Studentname2);
        	System.out.println("Got " + finalpercentage);
    	
    	
    	
    	
    }
}
