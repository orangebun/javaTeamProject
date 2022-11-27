import java.util.*;
public class customerInfo {
    private String username = null;
    string firstName = null;
    string lastName = null;
    private String password = null;
    private int SSN = null;
    private String address = null;
    private String state = null;
    private String email = null;
    private String securityQuestion = null;
    private String securityAnswer = null;

    Reg(String firstN, String lastN, String user, String password, String address,int zip, String state, String email, String ssn, String question, String answer){
		    firstName = firstN;
		    lastName = lastN;
		    username = user;
		    password = password;
		    this.address = address;
		    this.zip = zip;
		    this.state = state;
		    this.email = email;
		    this.ssn = ssn;
		    this.securityQuestion = question;
		    this.securityAnswer = answer;
    }

	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getUsername() {
		return username;
	}
	void setUsername(String username) {
		this.username = username;
	}

	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}


	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}


	int getZip() {
		return zip;
	}
	void setZip(int zip) {
		this.zip = zip;
	}


	String getState() {
		return state;
	}
	void setState(String state) {
		this.state = state;
	}


	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}


	String getSsn() {
		return ssn;
	}
	void setSsn(String ssn) {
		this.ssn = ssn;
	}


	String getQuestion() {
		return question;
	}
	void setQuestion(String question) {
		this.question = question;
	}


	String getAnswer() {
		return answer;
	}
	void setAnswer(String answer) {
		this.answer = answer;
	}