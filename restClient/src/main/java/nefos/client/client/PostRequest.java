package nefos.client.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PostRequest {

	// POST REQUEST
	public String setMitroo(Mitroo m) {
		String path = "http://localhost:8081/nefosrest2/webresources/hackathon/mitroo";
		Client client1 = Client.create();
		WebResource target1 = client1.resource(path);
		//String param = new JSONObject(m).toString();
				String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\"?><mitroo>"
				+ "    <address>"+ m.getAddress()+"</address>"
				+ "    <afm>"+m.getAfm()+"</afm>"
				+ "    <amka>"+ m.getAmka()+"</amka>"
				+ "    <at>"+ m.getAt()+"</at>"
				+ "    <bdate>"+ m.getBdate()+"</bdate>"
				+ "    <fylo>"+ m.getFylo()+"</fylo>"
				+ "    <lname>"+ m.getLname()+"</lname>"
				+ "    <name>"+ m.getName()+"</name>"
				+ "</mitroo>";
		System.out.println("post param: " + xmlString);
		//System.out.println("post param: " + param);
		ClientResponse res = target1.accept("application/xml").type("application/xml").post(ClientResponse.class,
				xmlString);
		return res.toString();

	}


}
