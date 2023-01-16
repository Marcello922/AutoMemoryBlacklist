package model;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Blacklister {
	
	private static String os ;
	private String filePath;
	private JFileChooser chooser;
	private FileNameExtensionFilter filter;
	private ArrayList <String> list = new ArrayList<String>();
	private File file;
	
	public Blacklister() {
		this.os = System.getProperty("os.name");
		this.filePath = "";
		this.chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());	
		int returnVal = chooser.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) 
			this.file = chooser.getSelectedFile();
	}
	
	public void blacklist() {
		if(os.startsWith("Windows"))
		
	}
	
}
