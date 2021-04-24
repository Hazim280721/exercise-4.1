import java.util.Scanner;
public class aeroplane {
	Scanner s = new Scanner(System.in);
	
	private String model;
	private int weight;
	private int seat;
	private int speed;
	
	aeroplane(){
		
		System.out.print("Enter Model : ");
		this.model = s.nextLine(); 
		System.out.print("Enter Empty Weight : ");
		this.weight = s.nextInt();
		System.out.print("Enter Seat : ");
		this.seat = s.nextInt(); 
		System.out.print("Enter Speed : ");
		this.speed = s.nextInt(); 
		
	}

	public String getmodel() {
		return this.model;
	}
	
	public int getweight() {
		return this.weight;
	}
	
	public int getseat() {
		return this.seat;
	}
	
	public int getspeed() {
		return this.speed;
	}
	
	
	
	
	
	
}
