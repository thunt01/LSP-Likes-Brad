package org.howard.edu.lsp.assignment2;

import org.howard.lsp.utils.FileReader;
import java.io.FileNotFoundException;
import java.util.HashMap;

//Name: Brian Thaddeus Hunt 
//ID: @02935184

public class WordCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader();
		try {
			String text = reader.readToString("main/java/resources/words.txt").toLowerCase();
			String[] words = text.split(" ");
			HashMap<String, Integer> counter = new HashMap<>();
			
			for (String w: words) {
				if (w.length() > 3 && w.matches("[a-zA-Z]+")) {
					if (counter.containsKey(w)) {
						counter.put(w, counter.get(w) +1);
					} else {
						counter.put(w, 1);
					}
						
				} 
			}
			//System.out.println(counter.toString());
			for (String key: counter.keySet()) {
				System.out.println(key + ": " +counter.get(key));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}

	}

}
