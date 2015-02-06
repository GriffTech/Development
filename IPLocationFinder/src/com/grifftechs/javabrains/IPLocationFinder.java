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
			String ipaddress = args[0];
			GeoIPService ipservice = new GeoIPService();
			//ipservice.getGeoIPServiceSoap();
			GeoIPServiceSoap geoIPServiceSoap = ipservice.getGeoIPServiceSoap();
			GeoIP geoip = geoIPServiceSoap.getGeoIP(ipaddress);
			System.out.println(geoip.getCountryName());
			
			
		}
			
	}

}
