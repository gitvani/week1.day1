package week1.day1;

public class TwoWheeler {
	int noOfWheels=3;
	short noOfMirrors=3;
	long chassisNumber=3457819372l;
	boolean isPunctured=false;
	String bikeName="Yamaha sports";
	double runningKM=2567.20;

	public static void main(String[] args) {
		
		TwoWheeler t= new TwoWheeler();
		int noOfWheels=4;
		System.out.println("No. of wheels in the Twowheeler:"+t.noOfWheels);//Accessing global variables
		System.out.println("number of wheels in the Twowheeler:"+noOfWheels);//Accessing local variables
		System.out.println("Chasis number:"+t.chassisNumber);
		System.out.println("Check is Punctured:"+t.isPunctured);
		System.out.println("Name of the Bike"+t.bikeName);
		System.out.println("Kilometer Used"+t.runningKM);
		
	}
}
