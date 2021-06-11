import java.util.*;
public class Converter {
	static boolean flag = true;
	public static void main(String[] args) {
		char D = 'D';
		char V = 'V';
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("What type of conversion do you want?");
			System.out.println("Distance");
			System.out.println("Volume");
			System.out.println("Choose \"D\" for distance and \"V\" for volume.");
			char c = in.nextLine().charAt(0);
			System.out.println("\""+c+"\"");
			
			switch(c) {
			case 'D':
			case 'd':{
				System.out.println("Which conversion would you like?");
				System.out.println("Kilometers to Miles: 1");
				System.out.println("Meters to Feet: 2");
				System.out.println("Millimiter to Inches: 3");
				System.out.println("Choose a number 1-3.");
				int b = in.nextInt();
				switch(b) {
				case 1:{
					System.out.println("1. Kilometers to Miles");
					System.out.println("How many Kilometer do you want to convert?");
					double d = in.nextDouble();
					System.out.println(d+" kilometers equal "+ (d*.6214)+" miles");
					break;
				}
				case 2:{
					System.out.println("2. Meters to Feet");
					System.out.println("How many Meters do you want to convert?");
					double d = in.nextDouble();
					System.out.println(d+" meters equal " +((d*39.37)/12)+ " feet.");
					break;
				}
				case 3:{
					System.out.println("3. Millimiter to Inches");
					System.out.println("How many millimeters do you want to convert?");
					double d = in.nextDouble();
					System.out.println(d+" millimeters equal "+(d*.001)+" inches");
					break;
				}
				}
				break;
			}
			case 'V':
			case 'v':{
				System.out.println("Which conversion would you like?");
				System.out.println("Liters to Quarts: 1");
				System.out.println("Liters to Gallons: 2");
				System.out.println("Gallon to British Gallon: 3");
				System.out.println("Choose a number 1-3.");
				int b = in.nextInt();
				switch(b) {
				case 1:{
					System.out.println("1. Liters to Quarts");
					System.out.println("How many liters do you want to convert?");
					double d = in.nextDouble();
					System.out.println(d+" liters equal "+(d*1.057)+" quarts.");
					break;
				}
				case 2:{
					System.out.println("2. Liters to Gallons");
					System.out.println("How many liters do you want to convert?");
					double d= in.nextDouble();
					System.out.println(d+ " liters equal "+(d/3.785)+" gallons.");
					break;
				}
				case 3:{
					System.out.println("3. Gallon to British Gallon");
					System.out.println("How many gallons do you ant to convert?");
					double d= in.nextDouble();
					System.out.println(d+ " gallons equal "+(d/1.201)+" British gallons.");
					break;
				}
				}
				break;
			}
			}
			in.nextLine();
			
			System.out.println("Do you want to do another conversion? 1 for yes, 0 for no.");
			int a = in.nextInt();
			
			if (a==0) {
				flag =false;
			}
		} while(flag);
	}

	
}
