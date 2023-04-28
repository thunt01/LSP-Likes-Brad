package howard.edu.lsp.finals.problem;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class SongsDatabase {
	/* Key is the genre, HashSet contains associated songs */
    		private Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
	
	 		/* Add a song title to a genre */
    		public void addSong(String genre, String songTitle) {
					//Code it!!
    			HashSet<String> songs = map.getOrDefault(genre, new HashSet<String>());
    			songs.add(songTitle);
    			map.put(genre, songs);
    		}
    
    		/* Return the Set that contains all songs for a genre */
    		public Set<String> getSongs(String genre) {
        			// Code it!!
    			return map.getOrDefault(genre, new HashSet<String>());
    		}
	
    		/* Return genre, i.e., jazz, given a song title */
    		public String getGenreOfSong(String songTitle) {
        			// Code it!!
    			for(Map.Entry<String, HashSet<String>> genre : map.entrySet()) {
    				
    				if (genre.getValue().contains(songTitle)) {
    					return genre.getKey();
    				}
    			}
    			return "Not in any genre";
    		}
}

