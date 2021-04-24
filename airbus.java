
import java.util.Scanner;

	public class airbus extends aeroplane {
	    Scanner s = new Scanner(System.in);
	    
	    private double fuel;
	    double storage;
 		
	    
	    
	    airbus(){
	    	System.out.print("Enter fuel: ");
	    	this.fuel=s.nextDouble();
	    	System.out.print("Enter storage: ");
	    	this.storage=s.nextDouble();
	    	System.out.print("Choose Engine: \n1.Turbojet \n2.Turbofan");
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
			return this.fuel*0.005;
		}
	   
}