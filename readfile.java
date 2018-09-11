import java.io.*;

public class readfile{
    public static void main(String args[]){
		File f=new File("C:/Users/Abhinav Thakur/Desktop/Assignment9/abc.txt");
		try
		{
			FileInputStream fin = new FileInputStream(f);
			int i;
			i=fin.read();
			while(i!=' '){
				System.out.print((char)i);
				i=fin.read();
			}
			fin.close();
	}
	 catch(IOException e)
	 {
		 System.out.println(e);
	 }
		}
}