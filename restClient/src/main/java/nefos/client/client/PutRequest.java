package nefos.client.client;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PutRequest {

	
	// PUT REQUEST
	public String sendPutRequest(Mitroo m) {
		String path = "http://localhost:8081/nefosrest2/webresources/mitroa/mitroo/put";

		Client client12 = Client.create();
		WebResource target12 = client12.resource(path+"/"+m.getAt());
		System.out.println("path: "+path);
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
		ClientResponse res2 = target12.accept("application/xml").type("application/xml").put(ClientResponse.class, xmlString);
		System.out.println("res: " + res2.toString());
		System.out.println("m to put: " + m.toString());
		return res2.toString();
	}

}
