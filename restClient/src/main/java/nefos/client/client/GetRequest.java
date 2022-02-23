package nefos.client.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class GetRequest {
	 //GET REQUEST WITH NAME
		public Mitroo sendgetRequest(String name) {
			String path = "http://localhost:8081/nefosrest2/webresources/hackathon/mitroo/name/" + name;

			// String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/";
			// path.join(path, "\"");
			// path.join(path, name);
			// path.join(path, "\"");
			System.out.println("path: " + path);
			Client client1 = Client.create();
			WebResource target1 = client1.resource(path);
			ClientResponse res = target1.queryParam("name", name).accept("application/json").get(ClientResponse.class);
			System.out.println("res: " + res);
			Mitroo m = res.getEntity(Mitroo.class);

			System.out.println("res: " + m.toString());
			return m;
		}
	//GET REQUEST WITH AFM
		public Mitroo sendgetRequestWithAfm(String afm) {
			String path = "http://localhost:8081/nefosrest2/webresources/hackathon/mitroo/afm/" + afm;

			// String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/";
			// path.join(path, "\"");
			// path.join(path, name);
			// path.join(path, "\"");
			System.out.println("path: " + path);
			Client client1 = Client.create();
			WebResource target1 = client1.resource(path);
			ClientResponse res = target1.queryParam("afm", afm).accept("application/json").get(ClientResponse.class);
			System.out.println("res: " + res);
			Mitroo m = res.getEntity(Mitroo.class);

			System.out.println("res: " + m.toString());
			return m;
		}
		
		//GET REQUEST WITH Lname
		public Mitroo sendgetRequestWithLname(String lname) {
			String path = "http://localhost:8081/nefosrest2/webresources/hackathon/mitroo/eponimo/" + lname;

			// String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/";
			// path.join(path, "\"");
			// path.join(path, name);
			// path.join(path, "\"");
			System.out.println("path: " + path);
			Client client1 = Client.create();
			WebResource target1 = client1.resource(path);
			ClientResponse res = target1.queryParam("lname", lname).accept("application/json").get(ClientResponse.class);
			System.out.println("res: " + res);
			Mitroo m = res.getEntity(Mitroo.class);

			System.out.println("res: " + m.toString());
			return m;
		}
		
		/*
		 * To do in this calss:
		 * 1) Να φτιάξω και τις υπολοιπες get με βασει τις πάνω που δουλευουν σωστα
		 * ομως και οι κατω δουλευαν σωστα 
		 * 3) Να φτιαξω τα αντικειμενα της κλασης στην αρχη της RectConnect γιατι αρχικα οι get μεθοδοι ηταν σε εκεινη 
		 */
		
		
		
		/*
		 * 
		 * GET REQUESTS
		 */
		/*
		// print all mitroa
		public void getMitroa() {
			String path = "http://localhost:8080/nefosrest2/webresources/mitroa";

			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(path);
			System.out.println(target.request(MediaType.APPLICATION_XML).get(String.class));
		}

		// print specisf mitroo with lname
		public void getMitrooByLname(@PathParam("lname") String lname) {
			String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/eponimo/" + lname;
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(path);
			System.out.println(target.request(MediaType.APPLICATION_XML).get(String.class));
		}


		// print specisf mitroo with afm
		public void getMitrooByAfm(@PathParam("afm") String afm) {
			String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/afm/" + afm;
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(path);
			System.out.println(target.request(MediaType.APPLICATION_XML).get(String.class));
		}

		// print specisf mitroo with fylo
		public void getMitrooByFylo(@PathParam("fylo") String fylo) {
			String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/fylo/" + fylo;
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(path);
			System.out.println(target.request(MediaType.APPLICATION_XML).get(String.class));
		}


		// print specisf mitroo with at
		public void getMitrooByAt(@PathParam("at") String at) {
			String path = "http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/amka/" + at;
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(path);
			System.out.println(target.request(MediaType.APPLICATION_XML).get(String.class));
		}
	*/
}
