package Bai1_6;

import java.time.temporal.TemporalAmount;

public class Account {
private String id;
private String name;
private static int balance;

public Account() {
balance=0;
}

public Account(String id, String name, int balance) {

	this.id = id;
	this.name = name;
	this.balance = balance;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
public int credit( int amount) {
	return balance;
}
public int debit(int amount) {
	if(amount<= balance) {
		return amount-balance;
	}else {
		return balance;
	}
}
public int transferTo(int amount,Account   another ) {
	if(amount<= balance) {
		return amount;
	}else {
		return balance;
	}
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}
public static void main(String[] args) {
	 Account a1 = new Account("A101", "Tan Ah Teck", 88);
     System.out.println(a1);  // toString();
     Account a2 = new Account("A102", "Kumar", balance); // default balance
     System.out.println(a2);

     // Test Getters
     System.out.println("ID: " + a1.getId());
     System.out.println("Name: " + a1.getName());
     System.out.println("Balance: " + a1.getBalance());

     // Test credit() and debit()
     a1.credit(100);
     System.out.println(a1);
     a1.debit(50);
     System.out.println(a1);
     a1.debit(500);  // debit() error
     System.out.println(a1);

     // Test transfer()
     a1.transferTo(100, a2);  // toString()
     System.out.println(a1);
     System.out.println(a2);
}


}
