package howard.edu.lsp.finals.problem;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {
	SongsDatabase db;
	
	@BeforeEach
	public void setUp() {
		
		//sets up new SongDatabase before each test with
		db = new SongsDatabase();
		db.addSong("Rap","Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
	}
	
	@Test
	@DisplayName("Test case for addSong method")
	public void testAddSong() {
		Assertions.assertFalse(db.getSongs("Jazz").contains("Blue in Green"));
		db.addSong("Jazz", "Blue in Green");
		Assertions.assertTrue(db.getSongs("Jazz").contains("Blue in Green"));
		Assertions.assertTrue(db.getSongs("Rap").contains("Savage"));
		Assertions.assertFalse(db.getSongs("Rap").contains("D'evils"));
	
	}

	@Test
	@DisplayName("Test case for getSongs method")
	public void testGetSongs() {
		Set<String> rapSongs = db.getSongs("Rap");
		Set<String> jazzSongs = db.getSongs("Jazz");
		Set<String> test= new HashSet<String>();
		test.add("Savage");
		test.add("Gin and Juice");
		Assertions.assertEquals(rapSongs, test);
		Assertions.assertNotEquals(jazzSongs, test);
	}

	@Test
	@DisplayName("Test case for getGenreOfSong method")
	public void testGetGenreOfSong() {
		String a = db.getGenreOfSong("Savage");
		String b = db.getGenreOfSong("Gin and Juice");
		String c = db.getGenreOfSong("Always There");
		Assertions.assertEquals(a, "Rap");
		Assertions.assertEquals(b, "Rap");
		Assertions.assertEquals(c, "Jazz");
		Assertions.assertNotEquals(a, "Jazz");

	}

}
