package EMPSServer;

public class API {

	//get the IP address using ipify.org API 
	
	public static String getIP() {
		String ip_adr =null;
		try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.ipify.org").openStream(), "UTF-8").useDelimiter("\\A")) {
		    ip_adr = s.next();
		} catch (java.io.IOException e) {
		    e.printStackTrace();
		}
		return ip_adr;
	}
}
