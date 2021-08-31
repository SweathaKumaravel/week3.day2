package week3.day2assignment;

import week1.day2assignments.Calculator;

public class Desktop extends Calculator implements Hardware ,Software {
	public void desktopModel() {
		// TODO Auto-generated method stub
System.out.println("This is desktop Model:");
	}
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is softwareResources");
		
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is hardwareResources");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 Interface and archieve multiple inheritance.");
		Desktop desktop1 = new Desktop();
		System.out.println("-----------Result through Class implements interface-------------");
		desktop1.desktopModel();
		desktop1.hardwareResources();
		desktop1.softwareResources();
		System.out.println("=====================Result through Class extends class======================");
		desktop1.add(25, 99);   
		desktop1.add(58, 96);
		desktop1.div(568.25, 58);
		desktop1.multiply(52, 859.25);
		

	}
	private void multiply(int i, double d) {
		// TODO Auto-generated method stub
		System.out.println("The multiplication is:");
		
	}

	

	

}
