package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class MapBasics {
	
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
			hs.add(1); // Add. Return boolean
			hs.remove(1); //remove. Return boolean
			hs.contains(1); //check. Returns boolean
			hs.size(); //To get size. Returns integer
			
			
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 5); //return integer
		//hm.remove(1); //return integer
		hm.replace(1, 5); //return integer (old value)
		
		System.out.println(hm.replace(1, 7));
		System.out.println(hm.get(1));
	}
}
