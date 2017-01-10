package prob05;

public class Account {
	String accountNo;
	int balance;
	
	public Account(String accountNo){
		this.accountNo=accountNo;
	}
	public void save( int balace){
		
		this.balance+=balace;
	}
	
	public void deposit( int balace){
		
		this.balance-=balace;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
