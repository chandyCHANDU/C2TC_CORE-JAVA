package com.tns.Admin;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mall
{
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id;
private String malladmin;
private String mallname;
private String location;
private String shopsid;
private String categories;

public Mall(Integer id, String malladmin, String mallname, String location, String shopsid, String categories)
{
this.id = id;
this.malladmin = malladmin;
this.mallname = mallname;
this.location = location;
this.shopsid=shopsid;
this.categories=categories;
}
public Mall()
{
super();
}
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getmalladmin() {
return malladmin;
}
public void setmalladmin(String malladmin) {
this.malladmin = malladmin;
}
public String getmallname() {
return mallname;
}
public void setmallname(String mallname) {
this.mallname = mallname;
}
public String getlocation() {
return location;
}
public void setlocation(String location) {
this.location = location;
}
public String getshopsid() {
	return shopsid;
}
public void setshopsid(String shopsid) {
	this.shopsid=shopsid;
}
public String getcategories() {
	return categories;
}
public void setcategories(String categories) {
	this.categories=categories;
}
@Override
public String toString() {
return "Mall [id=" + id + ", malladmin=" + malladmin + ", mallname=" + mallname + ", location=" + location + ", shopsid=" + shopsid + ", categories=" + categories + "]";
}
}
