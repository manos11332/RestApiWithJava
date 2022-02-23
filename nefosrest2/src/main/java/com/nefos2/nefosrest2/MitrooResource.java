package com.nefos2.nefosrest2;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hackathon")
public class MitrooResource {
	
	MitrooRepository repo = new MitrooRepository();
@GET
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public List<Mitroo> getMitroa()
{
	System.out.println("getMitroa called...");

	
	return repo.getMitroa();
}

//anazitisi me to onoma 
@GET
@Path("mitroo/name/{name}")
//@Produces(MediaType.APPLICATION_XML)
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo getMitrooWithName(@PathParam("name") String name)
{
	
	System.out.println("name:" +name);
	System.out.println("getMitrooWithName called...");
	System.out.println(repo.getMitrooWithName(name));
	
	return repo.getMitrooWithName(name);
}



//anazitisi me to eponymo
@GET
@Path("mitroo/eponimo/{lname}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo getMitrooWithLname(@PathParam("lname") String lname)
{
	
	System.out.println("lname:" +lname);
	System.out.println("getMitrooWithLname called...");
	System.out.println(repo.getMitrooWithLname(lname));
	
	return repo.getMitrooWithLname(lname);
}

//login
@GET
@Path("mitroo/login/name/{name}/lname/{lname}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public String loginFunc( @PathParam("name"	) String name , @PathParam("lname")String lname)
{
	System.out.println("name:" +name);
	System.out.println("pass:" +lname);
	System.out.println("login called...");
	System.out.println(repo.login(name,lname));
	
	return repo.login(name,lname);
}



//anazitisi me to afm
@GET
@Path("mitroo/afm/{afm}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo getMitrooWithAfm(@PathParam("afm") String afm)
{
	
	System.out.println("afm:" +afm);
	System.out.println("getMitrooWithAfm called...");
	System.out.println(repo.getMitrooWithAfm(afm));
	
	return repo.getMitrooWithAfm(afm);
}
//anazitisi me to amka
@GET
@Path("mitroo/amka/{amka}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo getMitrooWithAmka(@PathParam("amka") String amka)
{
	
	System.out.println("amka:" +amka);
	System.out.println("getMitrooWithAmka called...");
	System.out.println(repo.getMitrooWithAmka(amka));
	
	return repo.getMitrooWithAmka(amka);
}
//anazitisi me to fyllo
@GET
@Path("mitroo/fylo/{fylo}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public List<Mitroo> getMitrooWithFylo(@PathParam("fylo") String fylo)
{
	
	System.out.println("fylo:" +fylo);
	System.out.println("getMitrooWithFylo called...");
	System.out.println(repo.getMitrooWithFylo(fylo));
	
	return repo.getMitrooWithFylo(fylo);
}

//anazitisi me to at
@GET
@Path("mitroo/at/{at}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo getMitrooWithAt(@PathParam("at") String at)
{
	
	System.out.println("at:" +at);
	System.out.println("getMitrooWithAt called...");
	System.out.println(repo.getMitrooWithAt(at));
	
	return repo.getMitrooWithAt(at);
}



@POST 
@Path("mitroo")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo createMitroo(Mitroo m1) 
{
	System.out.println(m1);
	repo.create(m1);
	return m1;
}
/*
@PUT 
@Path("mitroo/put")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo updateMitroo(Mitroo m1) 
{
	System.out.println("mpika stin mitroo");

		System.out.println("eftasa edo stin update"+m1);
		repo.update(m1);
		return m1;
	

}
*/

@PUT 
@Path("mitroo/put/{at}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo updateMitroo(@PathParam("at") String at ,Mitroo m1) 
{
	System.out.println("mpika stin mitroo");

		System.out.println("eftasa edo stin update"+m1);
		repo.update(m1);
		return m1;
	

}


@DELETE 
@Path("mitroo/{name}")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public Mitroo deleteMitroo(@PathParam("name") String name) 
{
	
	 Mitroo m= repo.getMitrooWithName(name);
	 System.out.println(m);
		 repo.delete(name);
	 
	 return m;
}


}


