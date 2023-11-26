package HTTP_API_DEMO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		 /*
		  1. HTTP Client :
		     Will act as client (browser)
		     Will sends Request to Server/API and brings the Response
		  */
		
		HttpClient client = HttpClient.newBuilder().build();
		
		
		/*
		 2. HTTP Request : 
		    
		 */
		
		HttpRequest req = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("https://dog.ceo/api/breeds/list/all"))
				.build();
		
		/*
		 3. HTTP Response : 
		    
		 */
		
		HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString() );
		System.out.println("Status : "+response.statusCode());
		System.out.println("Body : "+response.body());
		
	}
}
