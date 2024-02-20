package generics;

public class Main {

	public static void main(String[] args) {
		// generics = enable types (classes and interfaces) to be parameters when defining:
//					  classes, interfaces and methods
//					  a benefit is to eliminate the need to create multiple versions of methods or classes for various data types.
//					  Use 1 version for all reference data types
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {5.5,4.4,3.3,2.2,1.1};
		Character[] charArray = {'H','E','L','L','O'};
		String[] stringArray = {"B","Y","E"};
		
		displayArray(intArray);
		System.out.println(getFirst(intArray));
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
		
		System.out.println(myInt.getValue());
		
	}
	
	public static void displayArray(Integer[] array) {
		
		for (Integer x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
//			 Thing
	public static <T> void displayArray(T[] array) {
		
		for (T x : array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static <T> T getFirst(T[] array) {
		
		return array[0];
	}
	
	

}
