import java.util.HashMap;

public class test3 {
	public static void main (String[] args){
		
		// Intialize Variable X as HashMap
		HashMap<Integer,String> x = new HashMap<Integer,String>();
		
		// Add Values To x
		x.put(1,"Value 1");
		x.put(2,"Value 2");
		x.put(3,"Value 3");
		
		// Print All Values
		System.out.println(x);
		
		//Print Second Value
		System.out.println(x.get(2));
		
		//Remove Second Value
		x.remove(2);
		
		//Print Values After Remove
		System.out.println(x);
		
	}
	
}
