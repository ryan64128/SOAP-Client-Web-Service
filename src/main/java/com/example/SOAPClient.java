package com.example;

import java.net.MalformedURLException;
import java.net.URL;

public class SOAPClient {
	public static void main(String[] args) throws MalformedURLException{
		URL url =new URL("http://localhost:8084/soap-math?wsdl");
		SOAPMathImplService service = new SOAPMathImplService(url);
		SOAPMathOps eservice = service.getSOAPMathImplPort();
		// print responses from soap server
		System.out.println(eservice.squareIt(2));
		System.out.println(eservice.cubeIt(2));
	}
}
