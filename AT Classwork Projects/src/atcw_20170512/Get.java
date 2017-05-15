package atcw_20170512;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
	    System.out.println(result);

	}

}
