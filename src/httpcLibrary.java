import java.util.ArrayList;
import java.net.*;
import java.io.*;
import java.util.List;

public class httpcLibrary {
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(in);
		
		String msg = br.readLine();
		System.out.println("Client : "+msg);

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("msg received");
		pr.flush();
	}
}
