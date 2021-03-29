
import static org.junit.Assert.*;

import java.time.Duration;
import java.time.Instant;
/**
 * class to play stored song
 * @author Brock
 *
 */
public class playback extends Main {
	/**
	 * plays song
	 * creates variable to start
	 * creates variable to end
	 * uses duration import to tell how long song goes using start and end variable
	 * @param int song[][] - 2d array of one song
	 */
	public long playSong(int song[][]) {
		// need some way to plug the array for the song into here to play the song.
		assertTrue(song!=null);
        Instant start = Instant.now();
 
        //methods to play the music
        
        Instant end = Instant.now();
 
        Duration interval = Duration.between(start, end);
 
        return interval.getSeconds();
	}

}