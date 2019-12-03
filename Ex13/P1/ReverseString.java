import java.io.*;

public class ReverseString{
    public static void main(String[] arg){
	File file = new File("input.txt");
	int[] ch;
	int i=0;

	try{
	    FileInputStream fin = new FileInputStream(file);
	    FileWriter out = new FileWriter("reverse.txt");
	    BufferedWriter b = new BufferedWriter(out);
	    PrintWriter p = new PrintWriter(b);
	    ch = new int[10000];
	    while((ch[i] = fin.read()) != -1){
		i++;
	    }
	    i = i-1;//配列調整
	    while(i > -1){
		p.print((char)ch[i]);
		i--;
	    }
	    p.print("\n");
	    p.close();
	    fin.close();
	}catch(FileNotFoundException e){
	    System.out.println("File" + file.getAbsolutePath() +
			       "could not be found on filesystem....");
	}catch(IOException ioe){
	    System.out.println("Exception while reading the file" + ioe);
	}
	
	System.out.println("\n Program is finished.");
    }
}
