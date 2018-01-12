package com.sac2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OutWriteArrayList {

	public static void main(String[] args) {
		
		File filename= new File("D://my.txt");
		
		ArrayList<String> alist= new ArrayList<String>();
		String friend=" ";
		
		//get the user to enter the name of friends
		
		while (!friend.isEmpty()) {
			
			friend= JOptionPane.showInputDialog("name a friend");
			if (!friend.isEmpty()) alist.add(friend);
			
			
		}
		
		
		//write the name of the friend to a file
		
		try {
			
			
			FileWriter fw= new FileWriter(filename);
			
			Writer output= new BufferedWriter(fw);
			int az= alist.size();
					for(int i=0;i<az;i++) {
						output.write(alist.get(i).toString() +"\n");
						
					}
					output.close();
		
	}catch(Exception e) {
		System.out.println(e);
		
		JOptionPane.showMessageDialog(null,"cannot create the file");
	}

}}
