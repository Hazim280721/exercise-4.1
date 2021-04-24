	import java.util.Scanner;

	public class boeing extends aeroplane {
	    Scanner s = new Scanner(System.in);
	    
	    private double fuel;
	    double storage;

		  
	    
	    boeing(){
	    	
	    	System.out.print("Enter fuel: ");
	    	this.fuel=s.nextDouble();
	    	System.out.print("Enter storage: ");
	    	this.storage=s.nextDouble();
	    	
	    	
	    }
	   double storage() {
		 
	    	return storage=super.getweight()+storage;
	    }
	    
	    public double getfuel() {
			return this.fuel*1.50;
		}
	    
	    public double getrange() {
			return this.fuel*30;
		}
	    public double gettime() {
			return this.fuel*0.05;
		}
	    public double getstorage() {
			return storage;
		}
	    
	    
	    
}
