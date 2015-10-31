package com.webserviceclient;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class SuperFoodsClientCodeGenerator {

	 public static void main(String args[]) { 
		 WSDLToJava.main(new String[] {
				"-client",
				"-d", "src/main/java",
				"src/main/resources/SuperFoodsWebService.wsdl" });
				System.out.println("Done!");
	}
	 
	
	
}
