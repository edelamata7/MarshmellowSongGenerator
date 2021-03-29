import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * lets you edit songs that have been generated
 * 
 * @author Brock
 *
 */
public class project extends Main {

	/**
	 * can edit notes and time arrays
	 */
	public void editSong() {
		assertTrue(finalSong != null);
		int edit[][] = finalSong;
		// include all the methods for editing here

		finalSong = edit;// saves the edited song
	}

	/**
	 * saves song to project
	 */
	public void saveSong() {
		assertTrue(finalSong != null);
		// store the array into variable edit Song
		int savedSong[][] = finalSong;
	}

	/**
	 * deletes a song from the project
	 */
	public void deleteSong() {
		int base[][] = new int[0][0];
		assertFalse(base.length>0);
		// Deletes what is in the array currently
		finalSong = base;
	}

	/**
	 * imports song from hardrive to project
	 * @throws URISyntaxException 
	 */
	public void importSong(URI song) throws URISyntaxException {
		assertTrue(song!=null);
		Path imported = Path.of(song);//storage location of song
		//methods to read text file into an array 
		int importedSong[][] = new int[0][0];// the new int[0][0] is a placeholder for until the import from text file can be developed
		// makes the current song as a song from the exported songs in one of the storage devices
		finalSong = importedSong;
	}

	/**
	 * exports song to storage
	 */
	public void exportsong() {
		// turns the song into an exported song to be saved to one of the storage
		// devices
		assertTrue(finalSong!=null);
		int exportedSong[][] = finalSong;
	}
}