import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.*;

public class TestDriver {
	/**
	 * makes sure files match
	 */
	@Test
	public void testPCfiles() {
		PCfiles ODrive = new PCfiles();
		assertTrue(ODrive.file() == ODrive.name);
	}

	/**
	 * initialize the main class
	 * check that navigation fills the options 2d array
	 * check that createProject took the users input
	 * check that uploadProject correctly inserts the project into the cloud storage
	 */
	@Test
	public void testMain() {
		Main m = new Main();
		m.navigation();
		assertTrue(m.navOptions[0][0]!=null);
		assertTrue(m.createProject().length()>0);
		project p = new project();
		assertTrue(m.uploadProject(p));
	}

	/**
	 * see if final song is the length it is supposed to be
	 */
	@Test
	public void testPlayback() {
		playback m = new playback();
		assertTrue(m.playSong(m.finalSong) == m.finalSong.length);
	}

	/*
	 * see if the loading message is the correct message
	 */
	@Test
	public void testLoading() {
		loading m = new loading();
		String tempString = "please wait your song is being generated";
		assertEquals(m.messages, tempString);
	}

	/**
	 * Initialize the project class
	 * test that deleteSong correctly empties the array
	 * Test that createProject correctly adds a new project to the list.
	 */
	@Test
	public void project() {
		project m = new project();
		m.deleteSong();
		// Deletes what is in the array currently
		int Song[][] = new int[0][0];
		assertTrue(Song == m.finalSong);// song and finalSong should both be empty
		int projCount = m.projectMap.size();// Amount of projects before a new one was made
		m.createProject();
		assertTrue(projCount<m.projectMap.size());//projCount should be less because projectMap has a new project
	}

	/**
	 * test if the class CloudFiles is created properly
	 * test if connected to cloud storage correctly
	 * test if addFile correctly increases the amount of files in the Cloud Storage
	 * @throws MalformedURLException 
	 */
	@Test
	public void testCloudFiles() throws MalformedURLException {
		CloudFiles cloud = new CloudFiles();
		URL test = new URL("www.example.com");
		cloud.connect(test);
		assertTrue(cloud.connected);
		project m = new project();
		ArrayList<Object> tempFiles = cloud.files;
		cloud.addFile(m);
		assertTrue(cloud.files.size()>tempFiles.size());
	}

	/*
	 * Test method for testing the CreateSong class Initialize CreateSong as a
	 * variable Set new variables to existing variables that were randomly
	 * initialized confirm that they are equal with assertions
	 */
	@Test
	public void testCreateSong() {
		Createsong m = new Createsong();
		m.createArrays();
		assertTrue(m.magicValue >= 1 & m.magicValue <= 200);
		assertTrue(m.noteArray.length == m.magicValue);
		assertTrue(m.timeArray.length == m.magicValue);
	}
}