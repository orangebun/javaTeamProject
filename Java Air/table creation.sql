CREATE TABLE FlightInfo
(
    flightID int primary key, 
    flightNumber varchar(25) NOT NULL,
    flightDate varchar(25) NOT NULL,
    Destination varchar(50) NOT NULl,
    Departure varchar(50) NOT NULL,
    Takeoff time NOT NULL,
    Arrival time NOT NULL, 
    totalseats int NOT NULL,
    FirstClassSeats int NOT NULL,
    BusinessClassSeats int NOT NULL,
    economySeats int NOT NULL,
    firstAvailable int NOT NULL,
    businessAvailable int NOT NULL,
    economyAvailable int NOT NULL,
    firstPrice money NOT NULL,
    businessPrice money NOT NULL,
    economyPrice money NOT NULL,
)

CREATE TABLE Customers(
	CusSSN INT primary key, 
    CusUsername varchar(20) NOT NULL,
    CusPassword varchar(18) NOT NULL, 
    CusFirstName varchar(15) NOT NULL,
    CusLastName  varchar(15) NOT NULL, 
    CusAddress varchar(20) NOT NULL,
    CusZip INT NOT NULL,
    CusState varchar(20) NOT NULL,
    CusEmail varchar(30) NOT NULL,
    CusQuestion varchar(70) NOT NULL,
    CusAnswer varchar(30) NOT NULL
);

CREATE TABLE Admin(
	AdmSSN INT primary key, 
    AdmUsername varchar(25) NOT NULL,
    AdmPassword varchar(25) NOT NULL, 
    AdmFirstName varchar(25) NOT NULL,
    AdmLastName  varchar(25) NOT NULL, 
    AdmAddress varchar(25) NOT NULL,
    AdmZip INT NOT NULL,
    AdmState varchar(25) NOT NULL,
    AdmEmail varchar(25) NOT NULL,
    AdmQuestion varchar(100) NOT NULL,
    AdmAnswer varchar(25) NOT NULL
);


CREATE TABLE UpdateFlight(
	changeID int primary key, 
    newDate varchar(25) NOT NULL,
    newTime time NOT NULL,
    FlightID int NOT NULL, 
	CONSTRAINT UpdateFlight_Flight_fk FOREIGN KEY(FlightID) REFERENCES FlightInfo(FlightID)
);