package com.grifftechs.javabrains;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1){
			System.out.println("You need to supply an argument");
		} else {
			
			
			/*
			ServiceClient client = new ServiceClient(); // build your service client here

			Options options = new Options();

			HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
			proxyProperties.setDomain("");
			proxyProperties.setProxyName("");
			proxyProperties.setProxyPort(8000);
			proxyProperties.setUserName("");
			proxyProperties.setPassWord("");

			options.setProperty(HTTPConstants.PROXY, proxyProperties);
			client.setOptions(options);
			*/
						
			String ipaddress = args[0];
			GeoIPService ipservice = new GeoIPService();
			
			/*
			System.setProperty("http.proxyHost", "192.155.1168.101");
			System.setProperty("http.proxyPort", "80");
			System.setProperty("https.proxyHost", "192.167.134.103");
			System.setProperty("https.proxyPort", "81");
			System.setProperty("http.nonProxyHosts","192.168.170.105|192.168.170.104");
			*/
			
			
			//ipservice.getGeoIPServiceSoap();
			GeoIPServiceSoap geoIPServiceSoap = ipservice.getGeoIPServiceSoap();
			GeoIP geoip = geoIPServiceSoap.getGeoIP(ipaddress);
			System.out.println(geoip.getCountryName());
			
			
		}
			
	}

}
