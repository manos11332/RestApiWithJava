package com.nefos2.nefosrest2;

import javax.xml.bind.annotation.XmlRootElement;
import com.sun.jersey.spi.container.ContainerResponse;
@XmlRootElement

public class Mitroo {
 private String at;
 private String name;
 private String lname;
 private String fylo;
 private String bdate;
 private String afm;
 private String amka;
 private String address;

 
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFylo() {
	return fylo;
}
public void setFylo(String fylo) {
	this.fylo = fylo;
}
public String getAfm() {
	return afm;
}
public void setAfm(String afm) {
	this.afm = afm;
}
public String getAmka() {
	return amka;
}
public void setAmka(String amka) {
	this.amka = amka;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAt() {
	return at;
}
public void setAt(String at) {
	this.at = at;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Mitroo [at=" + at + ", name=" + name + ", lname=" + lname + ", fylo=" + fylo + ", bdate=" + bdate + ", afm="
			+ afm + ", amka=" + amka + ", address=" + address + "]";
}
public String getBdate() {
	return bdate;
}
public void setBdate(String bdate) {
	this.bdate = bdate;
}



 
}