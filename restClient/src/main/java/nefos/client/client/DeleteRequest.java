package nefos.client.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DeleteRequest {
	
	public String sendDeleteRequest(Mitroo m)
	{
		String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/"+m.getName();

		Client client12 = Client.create();
		WebResource target12 = client12.resource(path);
		System.out.println("path: "+path);
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
		ClientResponse res2 = target12.accept("application/xml").type("application/xml").delete(ClientResponse.class, xmlString);
		System.out.println("res: " + res2.toString());
		System.out.println("m to delete: " + m.toString());
		return res2.toString();
	}

}
