package practicejava31;

public class Classc {
	static int previousbal=0;
	static int currentbal= 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Classc.deposit("ONKAR GHOTANKAR","068110110009617" ,50000);
        Classc obj = new Classc();
        obj.withdraw("ONKAR GHOTANKAR", "68110110009617", 70000);     
        Classc.CurrentBal("ONKAR GHOTANKAR", "68110110009617");	
	}
       public static void deposit(String customerName,String AccountNo, int depositedamount) {
		previousbal= previousbal+depositedamount;
		      currentbal=previousbal;
		System.out.println("Customer name  :" + customerName);
		System.out.println("Account No : "+AccountNo);
		System.out.println("Deposited Amount: "+ depositedamount);
		System.out.println("Current Bal:" + currentbal);
	}
	
	public void withdraw(String customerName, String AccountNo,int withdrawamount) {
		
		currentbal=currentbal-withdrawamount;
		
		if (withdrawamount<=currentbal)
		{
			
				System.out.println("Current Bal:" + currentbal);
		}
		
		else {
			System.out.println("Insufficient fund in account");
		}
		
		
		
		System.out.println("Customer name  :" + customerName);
		System.out.println("Account No : "+AccountNo);
		System.out.println("withdraw Amount: "+ withdrawamount);
		System.out.println("Current Bal:" + currentbal);
	}
	
	public static void CurrentBal(String customerName, String AccountNo) {
		System.out.println("The current bal is : " + currentbal);
	}
}       

