package mellow;

import static org.junit.Assert.*;

/**
 * Class Creates Song
 * Creates song to a .WAV file from array that is saved to cloud
 * @author Brock
 *
 */
public class Createsong extends Main {
	int magicValue;
	int noteArray[];
	int timeArray[];
	/**
	 * makes value that is number 1-200
	 * creates array for notes using random numbers to randomly generate the notes
	 * creates array for to store time for notes
	 */
	public void createArrays() {
		magicValue = (int) (Math.random() * (240-180)) + 180;
		assertTrue(magicValue > 179 & magicValue <=240);
		noteArray= new int[magicValue];// each index will have a random value assigned by (int) Math.random() * (30 - 1 + 1) - 1
		timeArray= new int[magicValue];// each index will have a random value assigned by (int) Math.random() * (10 - 1 + 1) - 1
		int tempArray[][]= {noteArray, timeArray};
		finalSong=tempArray;
		assertFalse(finalSong = null);
	}
}