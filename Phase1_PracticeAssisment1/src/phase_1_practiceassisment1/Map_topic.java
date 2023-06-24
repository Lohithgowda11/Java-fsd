package phase_1_practiceassisment1;


import java.util.*;

public class Map_topic {

	public static void main(String[] args) {
		// Creating an empty HashMap
				Map<String, Integer> map = new HashMap<>();

				// Inserting entries in the Map
				// using put() method
				map.put("shreya", 10);
				map.put("ayush", 30);
				map.put("koushal", 20);
				map.put("sonu", 40);

				// Iterating over Map
				for (Map.Entry<String, Integer> e : map.entrySet())

					// Printing key-value pairs
					System.out.println(e.getKey() + " "
									+ e.getValue());

	}

}

