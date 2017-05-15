package atcw_20170515;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;

public class Get {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://freegeoip.net/json/");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("GET");
		BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
	    String line;
	    String result = "";
		while ((line = br.readLine()) != null) {
			result += line;
		}
	    br.close();
	    
//	    System.out.println(result);
	    
	    JSONObject jsonObject = new JSONObject(result);
        System.out.println(jsonObject.get("ip"));

	}

}
