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


INSERT INTO FlightInfo(FlightID, FlightNumber, FlightDate, Departure, Destination, Takeoff, Arrival, 
TotalSeats, FirstClassSeats, BusinessClassSeats, EconomySeats, FirstAvailable, BusinessAvailable, EconomyAvailable, FirstPrice, BusinessPrice, EconomyPrice)

VALUES(4631, 658, 'Dec. 4, 2022', 'San Diego, California', 'Boston, Massachusetts', '11:40:00 AM', '8:32:00 PM', 123, 12, 31, 80, 8, 25, 28, $483.00, $408.00, $333.00), (1368, 200, 'Dec. 9, 2022', 'Fort Lauderdale, Florida', 'Denver, Colorado', '9:57:00 AM', '6:30:00 PM', 63, 6, 16, 41, 2, 4, 34, $335.00, $260.00, $185.00), (1680, 828, 'Dec. 9, 2022', 'Boston, Massachusetts', 'Philadelphia, Pennsylvania', '10:39:00 AM', '2:17:00 PM', 128, 13, 32, 83, 10, 3, 77, $478.00, $403.00, $328.00), 
(1559, 677, 'Dec. 12, 2022',  'Baltimore, Maryland',  'Chicago, Illinois', '1:01:00 PM', '5:20:00 PM', 168, 17, 42, 109, 6, 28, 17, $264.00, $189.00, $114.00), (3666, 673, 'Dec. 2, 2022',  'Detroit, Michigan',  'Tampa, Florida', '8:27:00 PM','11:20:00 PM', 101, 10, 25, 66, 1, 25, 2, $327.00, $252.00, $177.00), (2328, 441, 'Dec. 14, 2022',  'Boston, Massachusetts',  'Houston, Texas', '9:09:00 AM', '4:05:00 PM', 171, 17, 43, 111, 5, 30, 48, $566.00, $491.00, $416.00), 
(6342, 885, 'Dec. 23, 2022', 'Fort Lauderdale, Florida', 'San Francisco, California', '5:48:00 PM', '9:15:00 PM' ,189, 19, 47, 123, 5, 30, 71, $315.00, $240.00, $165.00), (6208, 267, 'Dec. 22, 2022', 'Fort Lauderdale, Florida', 'Chicago, Illinois', '2:04:00 PM', '3:32:00 PM' , 143, 14, 36, 93, 11, 5, 27, $394.00, $319.00, $244.00), (5952, 661, 'Dec. 1, 2022', 'Orlando, Florida', 'Atlanta, Georgia', '1:57:00 PM', '10:54:00 PM', 70, 7, 18, 45, 6, 8, 11, $266.00, $191.00, $116.00), (7342, 305, 'Dec. 5, 2022', 'Charlotte, North Carolina', 'Miami, Florida', '10:17:00 AM', '1:04:00 PM' , 185, 19, 46, 120, 3, 21, 91, $634.00, $559.00, $484.00)


INSERT INTO Customers(CusQuestion)
Values('How tough are you?'), ('What is the name of your pet?'), ('What is the name of your car?'), ('What is your favorite color?'), ('Are you afraid?')

INSERT INTO Admin(AdmQuestion)
Values('How tough are you?'), ('What is the name of your pet?'), ('What is the name of your car?'), ('What is your favorite color?'), ('Are you afraid?')