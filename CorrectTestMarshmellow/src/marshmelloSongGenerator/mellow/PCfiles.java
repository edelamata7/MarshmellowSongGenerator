import static org.junit.Assert.*;

/**
 * deals with file organization
 * @author Brock
 *
 */
public class PCfiles extends Main {
	public String files;
	public String name;

	/**
	 * sets file name and returns it
	 * @return name
	 */
	public String setfilename() {
		assertTrue(files!=null);
		name = files;
		return name;
	}
	/**
	 * returns name of file
	 * @return name
	 */
	public String file() {
		// this will return the name of file the after the getters and setters;
		assertTrue(name!=null);
		return name;
	}
}