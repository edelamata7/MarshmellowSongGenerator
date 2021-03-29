package mellow;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CloudFiles extends Main {
	ArrayList<Object> files = new ArrayList<Object>();
	boolean connected = false;
	
	/**
	 * connects the marshmellow song creator to the cloud
	 * @param link
	 * @return connected - a boolean that says whether you are connected to the cloud or not
	 * @throws MalformedURLException 
	 */
	public boolean connect(URL link) throws MalformedURLException {
		assertTrue(link != null);
		//run methods to connect to the cloud storage location. If connection is a success, set connected to True
		return connected;
	}
	
	/**
	 * gets cloud files
	 * @return files
	 */
	public Object getFiles() {
		assertTrue(files!=null);
		return files;
	}
	
	/**
     * sets the entire file system to another file system
     * @param newFiles - ArrayList of Objects
     */
	public void setFiles(ArrayList<Object> newFiles) {
		assertTrue(newFiles!=null);
		files = newFiles;
	}
	
	/**
     * Adds an additional file to the files ArrayList
     * @param newFile - file Object 
     */
	public void addFile(Object newFile) {
		assertTrue(newFile!=null);
		files.add(newFile);
	}
}