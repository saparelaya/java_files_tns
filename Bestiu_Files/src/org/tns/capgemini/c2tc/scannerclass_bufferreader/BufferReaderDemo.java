package org.tns.capgemini.c2tc.scannerclass_bufferreader;

import java.io.BufferedReader;
import java.io.FileReader; 
//import java.io.IOException;
public class BufferReaderDemo {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\MY PC\\OneDrive\\Documents\\coverletter.laya.docx"));
		String data="";
		while((data=br.readLine())!=null) 
			{
			System.out.println(data);
			}
		br.close();

	}

}