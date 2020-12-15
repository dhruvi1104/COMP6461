import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class httpcLibrary {

	public String path;
	public String host;
	public String query;
	public int port;
	public String httpreq="";
	HashMap<String,String>hm=new HashMap<String, String>();
	
	public static void main(String[] args) throws IOException, JSONException {
		httpcLibrary hc=new httpcLibrary();
		hc.get(0, "http://httpbin.org/get?course=networking&assignment=1");
	}
	
	/*public void help() {
		
	}
	
	public void help(String cmd) {
		if(cmd.compareTo("get") == 0) {
			
		}else {
			
		}
	}*/
	
	public void get(int v, String url) throws IOException, JSONException {
		if (v == 0) {
			URL url1 = new URL(url);
			path = url1.getPath();
			//System.out.println(path);
			host = url1.getHost();
			//System.out.println(host);
			port = 80;
			query = url1.getQuery();
			//System.out.println(query);
			String auth = url1.getAuthority();
			//System.out.println(auth);
			String file = url1.getFile();
			//System.out.println("file: " + file);
			//String content = url1.getContent().toString();
			//System.out.println("Content: " + content);
//			System.out.println("length: " + url1.toString().length());
//			System.out.println("Protocol: " + url1.getProtocol().toString());
//			System.out.println("Ref: " + url1.getRef());
//			System.out.println("user: " + url1.getUserInfo());
			//String[] args = query.split("&");

			HttpURLConnection con = (HttpURLConnection) url1.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent","HTTP/1.0");
			int responseCode = con.getResponseCode();
			//System.out.println("url"+url1);
			//System.out.println("ressss: "+responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputline;
			StringBuffer response = new StringBuffer();
			while((inputline=in.readLine()) != null){
				response.append(inputline);
			}
			in.close();
			String newresponse = response.toString();
			//System.out.println("Response......"+newresponse);

			//System.out.println("Path: " + path + " host: " + host + " Query: " + query);

			JSONObject myresponse = new JSONObject(response.toString());
			//System.out.println("result after Reading JSON Response");
			System.out.println(myresponse.toString(4));

			//System.out.println("origin- "+myresponse.getString("origin"));
		}else if (v == 1){

		}
		httpreq = "GET " + path + "?" + query;
	}
		//Socket s = new Socket(host, port);
		//PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		//BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//System.out.println("URL data:"+ url1.getQuery());

		//else {
			
		//}
	}

	
	//public void get(String key, String value, URL url) {
		
	//}
	
	
	

