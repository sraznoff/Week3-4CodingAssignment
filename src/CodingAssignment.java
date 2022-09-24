import java.awt.Point;
import java.util.Arrays;

public class CodingAssignment {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(lastMinusFirst(ages));
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 75};
		System.out.println(lastMinusFirst(ages2));
		
		System.out.println(averageArray(ages));
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.println(averageArray(names));
		System.out.println(concatArray(names));
		int[] nameLengths = arrayLengths(names);
		System.out.println(sumArray(nameLengths));
		System.out.println(wordMultiplier("Hello", 3));
		System.out.println(makeFullName("Henry", "Winkler"));
		System.out.println(isOneHund(nameLengths));
		double[] doubles = {3.14, 1.4, 4, 5.07};
		System.out.println(averageArray(doubles));
		double[] doubles2 = {79.45, 48.2, 9, 137.7, 16};
		System.out.println(compareArrays(doubles, doubles2));
		System.out.println(willBuyDrink(true, 10.51));
		Point ptA = new Point(0, 3);
		Point ptB = new Point(4, 0);
		System.out.println(distanceBetween(ptA, ptB));
		
	}
	public static int lastMinusFirst(int[] a) {
		return a[a.length-1]-a[0];
	}
	public static int averageArray(int[] a) {
		int n = 0;
		for (int b: a) {
			n+= b;
		}
		n /= a.length;
		return n;
	}
	public static int averageArray(String[] a) {
		int n = 0;
		for (String s : a) {
			n += s.length();
		}
		n/= a.length;
		return n;
				
	}
	public static String concatArray(String[] s) {
		String w = "";
		for (String t: s) {
			w+=t;
		}
		return w;
	}
	public static int[] arrayLengths(String[] s) {
		int[] result = new int[s.length];
		for (int n= 0; n < s.length; n++){
			result[n] = s[n].length();			
		}
		return result;
	}
	public static int sumArray(int[] a) {
		int n = 0;
		for(int i : a) {
			n+=i;
		}
		return n;
	}
	public static String wordMultiplier(String word, int n) {
		String result = "";
		while (n > 0) {
			result += word;			
			n--;
		}
		return result;
	}
	public static String makeFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	public static boolean isOneHund(int[] a) {
		int b = 0;
		for (int i = 0; i<a.length; i++) {
			b+= a[i];
			if (b >= 100) {
				return true;
			}
		}
		return false;
	}
	public static double averageArray(double[] a) {
		double b = 0;
		for (double c:a) {
			b+=c;
		}
		return b/a.length;
	}
	public static boolean compareArrays(double[] a, double []b) {
		return averageArray(a) > averageArray(b);
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else
			return false;
	}
	
	//This is my function, which returns the distance between two integer points in 
	//2d coordinate space. This is the base of a lot of important functionality in GIS
	//but i need the ability to do math with more sophisticated geometry (more coordinate)
	//precision but also not be worried about floating point errors.  Because coordinate 
	//systems can store coords far away from the origin point and with high precision
	//there is the chance you could have a valid number with high precision and high value
	//meaning it should be possible to even run into floating point issues with doubles
	//there are a lot of open source and proprietary libraries that should deal with this 
	//issue e.g. Arcgis, qgis, so i will have to learn about using those libraries
	public static double distanceBetween(Point a, Point b) {
		return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y),2));
	}
	
	

}
