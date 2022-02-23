package nefos.client.client;

import java.util.Scanner;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class RestConnection {

	public static void main(String[] args) {

		RestConnection c = new RestConnection();
		//Get request
		
		// c.getMitroa();
		// c.getMitrooByLname("73");
		// c.getMitrooByName("27");
		// c.getMitrooByAfm("123456");
		// c.getMitrooByFylo(" \"male\" ");
		// c.getMitrooByAmka("1222");
		// c.getMitrooByAt("771");

		// Post request
		//String m = null;
	   //PostRequest p = new PostRequest();
		//m = p.setMitroo();
		//System.out.println("m: " + m);
		//m=p.sendPutRequest();
		//System.out.println(m);
	}
	
	public RestConnection() {
		Mitroo m = new Mitroo();
		Scanner scan = new Scanner(System.in);
		//επιλογες χρήστη
		System.out.println("Μενου επιλογών:");
		System.out.println("1) εισαγωγή νέας εγγραφής στο Μητρώο ");
		System.out.println("2) Αναζήτηση υπάρχουσας εγγραφής με βάση το όνομα και το επώνυμο και ανανέωση της με εισαγωγή ΑΜΚΑ καιΔιεύθυνσης ");
		System.out.println("3) Αναζήτηση υπάρχουσας εγγραφής με το ΑΦΜ και δαγραφή της ");
		int ch;
		ch=scan.nextInt();
		System.out.println("Ο πελάτης επέλεξε την επιλογή: "+ch);
		switch(ch) {
		case 1: 
			System.out.println("Δώσε τα στοιχεία της εγγραφής: ");
			System.out.print("Αριθμός Ταυτότητας:");
			m.setAt(scan.next());
			System.out.print("Όνομα :");
			m.setName(scan.next());
			System.out.print("Επώνυμο :");
			m.setLname(scan.next());
			System.out.print("Φύλο:");
			m.setFylo(scan.next());
			System.out.print("Ημερομηνία Γέννησης :");
			m.setBdate(scan.next());
			System.out.print("ΑΦΜ :");
			m.setAfm(scan.next());
			System.out.print("ΑΜΚΑ :");
			m.setAmka(scan.next());
			System.out.print("Διεύθυνση :");
			m.setAddress(scan.next());
			System.out.println("Προσθήκη στο μητρώο : "+m.toString());
			// Post request
			String req = null;
		    PostRequest p = new PostRequest();
			req = p.setMitroo(m);
			System.out.println("req: " + req);
		case 2:
		
			System.out.println("Δώσε το ονομα και το επονυμο της εγγραφής που αναζητας: ");
			System.out.print("Όνομα :");
			String name =scan.next();
			System.out.print("Επώνυμο :");
			String lname= scan.next();
			System.out.println("Αναζήτηση στο μητρώο για : "+ name+  " " +lname);
			PutRequest p2 = new PutRequest();
			
			GetRequest p1 = new GetRequest();
			Mitroo m2=p1.sendgetRequest(name);
			System.out.println("m2 from get request: "+m2.toString());
			if(m2.getLname().equals(lname))
			{
				System.out.println("Η εγγραφή βρέθηκε");

			}			
			else
			{
				System.out.println("name and sur name does not match");
				break;
			}
			System.out.println("Δώσε το ΑΜΚΑ και την διευθυνση της εγγραφής που αναζητησες: ");
			System.out.print("ΑΜΚΑ :");
			String amka=scan.next();
			System.out.print("Διεύθυνση :");
			String ad=scan.next();
			m2.setAddress(ad);
			m2.setAmka(amka);	
			System.out.println("m2 after put: "+m2.toString());
			
			String putres=p2.sendPutRequest(m2);
			System.out.println("putres: "+putres);
			
		case 3:
			System.out.println("Δώσε το ΑΦΜ  της εγγραφής που αναζητας: ");
			System.out.print("ΑΦΜ :");
			String afm =scan.next();
			GetRequest p3 = new GetRequest();
			DeleteRequest p4 = new DeleteRequest();
			Mitroo m3=p3.sendgetRequestWithAfm(afm);
			System.out.println("Mitroo found on database: "+m3.toString());
			//Delete mitroo
			String delres=p4.sendDeleteRequest(m3);
			System.out.println("delres: "+delres);
		}
	}

}
