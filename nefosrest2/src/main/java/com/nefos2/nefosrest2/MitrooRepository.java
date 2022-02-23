package com.nefos2.nefosrest2;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import java.sql.*;
public class MitrooRepository {

	List<Mitroo> mitroo;
	Connection con = null;
	public MitrooRepository() {
		String url = "jdbc:mysql://localhost:3306/hackathon?useSSL=false";
		String username = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("connection ok!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		/*
		 * List<Mitroo> mitroo;
		mitroo = new ArrayList<Mitroo>();
		
		Mitroo m1 = new Mitroo();
		m1.setAddress(" add ");
		m1.setAfm(" gfsegsgseg ");
		m1.setAmka(" sggsrg ");
		m1.setAt(" 12345 ");
		m1.setFylo(" male ");
		m1.setLname(" galanis ");
		m1.setName("manos");
		
		Mitroo m2 = new Mitroo();
		m2.setAddress(" adafefafd ");
		m2.setAfm(" gfsegsafegseg ");
		m2.setAmka(" sgafgsrg ");
		m2.setAt(" 1234aefe5 ");
		m2.setFylo(" malefafe ");
		m2.setLname(" gaeflanis ");
		m2.setName(" manefos ");
		mitroo.add(m1);
		mitroo.add(m2);
		*/ 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Mitroo> getMitroa()
	{
		List<Mitroo> mitroa = new ArrayList<Mitroo>();
		String sql="select * from mitroo";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Mitroo m = new Mitroo();
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				mitroa.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mitroa;
	}
	//check with at
	public Mitroo getMitrooWithAt(String  at)
	{
	
		Mitroo m = new Mitroo();
		String sql="select * from mitroo where at="+"\""+at+"\"";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	//check with name

	public Mitroo getMitrooWithName(String  name)
	{
	
		Mitroo m = new Mitroo();
		String sql="select * from mitroo where name="+"\""+name+"\"";
		System.out.println("sql: "+sql);
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				System.out.println("m: "+m.getAt());
				System.out.println("m: "+m.getName());
				System.out.println("m: "+m.getLname());
				System.out.println("m: "+m.getFylo());
				System.out.println("m: "+m.getBdate());
				System.out.println("m: "+m.getAfm());
				System.out.println("m: "+m.getAmka());
				System.out.println("m: "+m.getAddress());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	
	}
	//check with lname
	public Mitroo getMitrooWithLname(String  lname)
	{
	
		Mitroo m = new Mitroo();
		String sql="select * from mitroo where lname="+lname;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	//check with afm
	public Mitroo getMitrooWithAfm(String  afm)
	{
		Mitroo m = new Mitroo();
		String sql="select * from mitroo where afm="+"\""+afm+"\"";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	//check with amka
	public Mitroo getMitrooWithAmka(String  amka)
	{
	
		Mitroo m = new Mitroo();
		String sql="select * from mitroo where amka="+amka;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	//check with fylo
	public List<Mitroo> getMitrooWithFylo(String fylo)
	{
		List<Mitroo> mitroo = new ArrayList<Mitroo>();
		Mitroo m;
		String sql="select * from mitroo where fylo="+fylo;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				 m = new Mitroo();
				m.setAt(rs.getString(1));
				m.setName(rs.getString(2));
				m.setLname(rs.getString(3));
				m.setFylo(rs.getString(4));
				m.setBdate(rs.getString(5));
				m.setAfm(rs.getString(6));
				m.setAmka(rs.getString(7));
				m.setAddress(rs.getString(8));
				mitroo.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mitroo;
	}

	public void create(Mitroo m) {
		String sql="insert into mitroo values(?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1,m.getAt());
			st.setString(2,m.getName());
			st.setString(3,m.getLname());
			st.setString(4,m.getFylo());
			st.setString(5,m.getBdate());
			st.setString(6,m.getAfm());
			st.setString(7,m.getAmka());
			st.setString(8,m.getAddress());
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void update(Mitroo m) {
		String sql="update mitroo set amka = ?,address = ? where at=?";
		System.out.println("aql"+sql);
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(3,m.getAt());
			st.setString(1,m.getAmka());
			st.setString(2,m.getAddress());
			System.out.println("eftasa edo");
			System.out.println("at"+m.getAt());
			System.out.println("amka"+m.getAmka());
			System.out.println("address"+m.getAddress());
			st.executeUpdate();
			System.out.println("ekana update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error: "+e);
		}
		
	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		String sql="delete from mitroo where name=?";
		
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1,name);
			
			st.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String login(String userName , String pass) {
		
		List<Mitroo> mitroo = new ArrayList<Mitroo>();
		String apot=null;;
		Mitroo m;
		//String sql="select * from mitroo where name="+userName ;
		PreparedStatement stm ;
		try {

		stm = con.prepareStatement("select * from mitroo where name= ? and lname = ?");
		stm.setString(1, userName);
		stm.setString(2, pass);
		ResultSet rs = stm.executeQuery();
			//Statement st = con.createStatement();
			//ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				apot="Login successfull";
				//MitrooResource mitrooResource = new MitrooResource();
				//mitrooResource.getMitrooWithName(userName);
			}
			else
			{
				apot="Invalid credentials";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return apot;
	}
	
}
