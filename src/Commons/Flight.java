package Commons;

public class Flight {
	protected int flightID;
	private int flightNum; 
    private String flightDay; 
    private String to;
    private String from; 
    private String leavingTime; 
    private String arriveTime; 
    private int totCapacity; 
    private int firstClassCap;
    private int businessClassCap; 
    private int economyCap; 
    private int firstLeft; 
    private int businessLeft; 
    private int economyLeft;
    private int firstCost; 
    private int businessCost; 
    private int economyCost;
    //constructors
    public Flight() {}
    public Flight(int flightID, int flightNum, String flightDay, String to, String from, String leavingTime, String arriveTime, int totCapacity,
    		int firstClassCap, int businessClassCap, int economyCap, int firstLeft, int economyLeft, int firstCost, int businessCost, int economyCost) 
    {
    	 this.flightID = flightID;
    	 this.flightNum = flightNum; 
         this.flightDay = flightDay; 
         this.to = to;
         this.from = from; 
         this.leavingTime = leavingTime; 
         this.arriveTime = arriveTime; 
         this.totCapacity = totCapacity; 
         this.firstClassCap = firstClassCap;
         this.businessClassCap = businessClassCap; 
         this.economyCap = economyCap; 
         this.firstLeft = firstLeft; 
         this.businessLeft = businessLeft; 
         this.economyLeft = economyLeft;
         this.firstCost = firstCost; 
         this.businessCost = businessCost; 
         this.economyCost = economyCost;
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

   
	public int getFirstClassCap() {
		return firstClassCap;
	}

	public void setFirstClassCap(int firstClassCap) { //first
		this.firstClassCap = firstClassCap;
	}

	public int getBusinessClassCap() { //busca
		return businessClassCap;
	}

	public void setBusinessClassCap(int businessClassCap) { //buscap
		this.businessClassCap = businessClassCap;
	}

	
	public int getEconomyCap() { //ecocap
		return economyCap;
	}

	public void setEconomyCap(int economyCap) { //ecocap
		this.economyCap = economyCap;
	}
	
	public int getFirstLeft() { //first
		return firstLeft;
	}

	public void setFirstLeft(int firstLeft) { //first
		this.firstLeft = firstLeft;
	}

	public int getBusinessLeft() { //busca
		return businessLeft;
	}

	public void setBusinessLeft(int businessLeft) { //buscap
		this.businessLeft = businessLeft;
	}

	
	public int getEconomyLeft() { //ecocap
		return economyLeft;
	}

	public void setEconomyLeft(int economyLeft) { //ecocap
		this.economyLeft = economyLeft;
	}
	
	public int getFirstCost() { //first
		return firstCost;
	}

	public void setFirstCost(int firstCost) { //first
		this.firstCost = firstCost;
	}

	public int getBusinessCost() { //busca
		return businessCost;
	}

	public void setBusinessCost(int businessCost) { //buscap
		this.businessCost = businessCost;
	}

	
	public int getEconomyCost() { //ecocap
		return economyCost;
	}

	public void setEconomyCost(int economyCost) { //ecocap
		this.economyCost = economyCost;
	}
    
}
