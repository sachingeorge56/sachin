package com.sac2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OutReadArrayList {
	
	
public static void main(String[] args) {
		
		String filename= "D://my1.txt";
		String line;
		ArrayList<String> alist= new ArrayList<String>();
		
		//write the name of the friend to a file
		
		try {
			BufferedReader input=new BufferedReader(new FileReader(filename));
			if(!input.ready()) {
				
				throw new IOException();
			}
			
			while((line= input.readLine()) != null) {
				
				alist.add(line);
			}
			input.close();
			
			
		}catch(Exception e) {
			
			System.out.println(e);
			}
			
			       int az= alist.size();
					for(int i=0;i<az;i++) {
				   System.out.println(alist.get(i).toString());
						
					}
}
		
	

}


