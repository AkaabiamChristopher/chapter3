public class Account1{
  

private String accountame;
private double balance;
private String lastname;

     

public Account1(String name,double bal,String lastname){

accountame = name;
balance = bal;
lastname = lastname; 

}

public double getBalance(){
		return balance;
	}
public void setName(String lastname){
		this.lastname = lastname;
	}
public String getName(){
		return lastname;
	}
public Account1(){
}
public String getlastname(){
	return lastname;
}
public void setBalance(double balance){
	this.balance = balance;
}

public String setlastname(String lastname){
	return lastname;	
}
}




