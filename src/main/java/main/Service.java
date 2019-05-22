package main;
//import org.json.simple.JSONObject;
import java.util.HashMap;
import java.util.Map;

class Service{
	
	private final Map<Integer, Account> accounts;

	public Service(){
		accounts = new HashMap<Integer, Account>();
	}

	public void add(Account account){
		accounts.put(account.getAccountNumber(), account);
	}
	public void add(String firstName, String lastName, int accountNumber){
		accounts.put(accountNumber, new Account(firstName, lastName, accountNumber));
	}
	public Account retrieve (String accountNumber){
		return accounts.get(accountNumber);
	}
	public  Map<Integer, Account> getAccounts() {
		return accounts;
	}
	public int countFirstNames(String firstName) {
		return (int) accounts.entrySet().stream()
				.filter(x-> (x.getValue().getFirstName()).equals(firstName)).count();
	}
	

//	public JSONObject getJson() {
//		return new JSONObject(accounts);
//	}
}