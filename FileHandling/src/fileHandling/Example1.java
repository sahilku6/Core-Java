package fileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Example1 {
	public static void main(String[] args) throws IOException {
		//create folder
		File folder = new File("C:/Users/sahil/OneDrive/Desktop/CapJava");
		folder.mkdir();
		
		//create file
		
		File f1=new File(folder,"Student.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		File f2=new File(folder,"emp.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		if(folder.exists()) {
			File[] list=folder.listFiles();
			
			for(int i=0;i<list.length;i++) {
				System.out.println(list[i].getName());
			}
		}		
		
//		write data in file 
		
		FileWriter writer=new FileWriter(f1);
		writer.write("Hello Student");
		writer.close();
		
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(f1));
		bw.write("Student Count = " +10);
		bw.newLine();
		bw.write("Good Morning \n"+"Have a nice day");
		bw.close();
		
		
		// read data from file
		FileReader reader=new FileReader(f1);
		System.out.println(reader.read());
		
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String line;
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
	}
}
