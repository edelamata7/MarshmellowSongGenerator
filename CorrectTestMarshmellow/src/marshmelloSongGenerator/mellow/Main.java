import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class for program Creates project and helps with navigation
 * 
 * @author Brock
 *
 */
public class Main {
	/**
	 * Creates hashmap to store all projects
	 * 
	 * initializes string name
	 * 
	 * puts final song in new array to store song
	 * 
	 * navOptions temporarily zero until a definite amount of options can be determined. It will store [name][link]
	 */
	CloudFiles cloud = new CloudFiles();
	Map<String, project> projectMap = new HashMap<String, project>();// Store all projects made into a hashmap
	String name;
	int finalSong[][];
	String navOptions[][] = new String[0][0];

	/**
	 * Will store all navigation links with a display name
	 */
	public void navigation() {
		//run methods to fill navOptions before they are displayed.
		assertTrue(navOptions!=null);
	}

	/**
	 * creates new project
	 * @return name - String that the user input
	 */
	public String createProject() {
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine(); // type in the name of the new project
		assertTrue(name!=null);
		projectMap.put(name, new project());// make a new project of a specified name
		// save the projects into file system for future use
		return name;
	}

	/**
	 * uploads project to cloud
	 * returns what was uploaded
	 * @param upload
	 * @return upload - project that was provided in the
	 */
	public boolean uploadProject(project upload) {
		assertTrue(upload!= null);
		boolean uploadCheck= false;
		cloud.addFile(upload);
		//run checks in the cloud storage to make sure that it uploaded correctly. If done correctly, set uploadCheck to true
		return uploadCheck;
	}

}