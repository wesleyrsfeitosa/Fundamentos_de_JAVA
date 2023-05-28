package aula_08_Excetions_Nelio;

public class Account {
	
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	//construtor sem parametro--------------------------------------------------------------
public Account() {
	
}
//construtor com parametro-----------------------------------------------------------
public Account(int number, String holder, Double balance, Double withdrawLimit) {

	
	
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.withdrawLimit = withdrawLimit;
}
//metodos get e set-----------------------------------------------------------------
public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getHolder() {
	return holder;
}

public void setHolder(String holder) {
	this.holder = holder;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

public Double getWithdrawLimit() {
	return withdrawLimit;
}

public void setWithdrawLimit(Double withdrawLimit) {
	this.withdrawLimit = withdrawLimit;
}

public void deposit(double amount) {
balance += amount;
}

public void withdraw(double amount) {
	validateWithdraw(amount);
	balance -= amount;
}

public void validateWithdraw(double amount) {
	if(amount > getWithdrawLimit()) {
		throw new RuntimeException("Erro de saque: A quantia excede o limite de saque!");
	}else if(amount > getBalance()) {
		throw new RuntimeException("Erro de saque: Saldo insuficente");
	}
}


}
