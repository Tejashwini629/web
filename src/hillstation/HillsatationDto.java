package hillstation;

import java.io.Serializable;

public class HillsatationDto implements Serializable
{
private String name;
private String location;
private double altitude;
private double temprature;
private double totalArea;

public HillsatationDto()
{
	System.out.println("hill station");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public double getAltitude() {
	return altitude;
}

public void setAltitude(double altitude) {
	this.altitude = altitude;
}

public double getTemprature() {
	return temprature;
}

public void setTemprature(double temprature) {
	this.temprature = temprature;
}

public double getTotalArea() {
	return totalArea;
}

public void setTotalArea(double totalArea) {
	this.totalArea = totalArea;
}

@Override
public String toString()
{
	return "hillstation [name="+name +",location="+location +",altitude="+altitude+",temprature="+temprature+",total area="+totalArea+"]";
	
}
}
