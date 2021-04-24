public class main {

	
	public static void main(String[] args)
	{
		
		airbus objAirbus = new airbus ();
		
		
		System.out.println("Model = " + objAirbus.getmodel());
		System.out.println("Empty Weight = " + objAirbus.getweight()+" pounds");
		System.out.println("Seat = " + objAirbus.getseat());
		System.out.println("Speed = " + objAirbus.getspeed()+" KN");
		System.out.println("Fuel Price = " +"RM "+ objAirbus.getfuel());
		System.out.println("Fly Range  = " + objAirbus.getrange()+" nautical miles");
		System.out.println("Fly Time  = " + objAirbus.gettime()+" hours");
		System.out.println("Weight Takeoff = " +objAirbus.storage()+" pounds");
	
		System.out.println();
		
		boeing objBoeing = new boeing();
		
		System.out.println("Model = " + objBoeing.getmodel());
		System.out.println("Empty Weight = " + objBoeing.getweight()+" pounds");
		System.out.println("Seat = " + objBoeing.getseat());
		System.out.println("Speed " + objBoeing.getspeed()+" KN");
		System.out.println("fuel price = " +"RM "+ objBoeing.getfuel());
		System.out.println("Fly Range  = " + objBoeing.getrange()+" nautical miles");
		System.out.println("Fly Time  = " + objAirbus.gettime()+" hours");
		System.out.println("Weight Takeoff = " + objBoeing.storage()+" pounds");
		
	    }

	
	}

	


