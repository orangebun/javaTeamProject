package Commons;
import java.sql.*;
public class Flight {
	protected int flightID;
	private int flightNum; 
    private String flightDay; 
    private String to;
    private String from; 
    private String leavingTime; 
    private String arriveTime; 
    private int totCapacity; 
    private int seatsLeft;
    private float Price; 
        //constructors
    public Flight() {}
    public Flight(int flightID, int flightNum, String flightDay, String to, String from, String leavingTime, String arriveTime, int totCapacity,
    		int seatsLeft, float Price) 
    {
    	 this.flightID = flightID;
    	 this.flightNum = flightNum; 
         this.flightDay = flightDay; 
         this.to = to;
         this.from = from; 
         this.leavingTime = leavingTime; 
         this.arriveTime = arriveTime; 
         this.totCapacity = totCapacity; 
         this.seatsLeft = seatsLeft;
         this.Price = Price; 
    }
    
    //get and set
    
    

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightDay() {
		return flightDay;
	}

	public void setFlightDay(String flightDay) {
		this.flightDay = flightDay;
	}

	public String getLeavingTime() {
		return leavingTime;
	}

	public void setLeavingTime(String leavingTime) {
		this.leavingTime = leavingTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}


	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}



	public int getTotCapacity() {
		return totCapacity;
	}

	public void settotCapacity(int totCapacity) {
		this.totCapacity = totCapacity;
	}

   
	public int getSeatsLeft() {
		return seatsLeft;
	}

	public void setseatsLeft(int seatsLeft) { //first
		this.seatsLeft = seatsLeft;
	}

	public float getPrice() { //busca
		return Price;
	}

	public void setPrice(float Price) { //buscap
		this.Price = Price;
	}

	
}
