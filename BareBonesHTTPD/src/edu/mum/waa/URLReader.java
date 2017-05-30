package edu.mum.waa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class URLReader {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8080/test.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while((inputLine=buf.readLine())!=null){
			System.out.println(inputLine);
		}
		buf.close();

	}

}
