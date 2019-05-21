package main;
import org.json.simple.JSONObject;
import java.util.HashMap;
import java.util.Map;

class Service{
	
	private final Map<String, Account> accounts;

	public Service(){
		accounts = new HashMap<String, Account>();
	}

	public void add(Account account){
		accounts.put(account.getAccountNumber(), account);
	}
	public void add(String firstName, String lastName, String accountNumber){
		accounts.put(accountNumber, new Account(firstName, lastName, accountNumber));
	}
	public Account retrieve (String accountNumber){
		return accounts.get(accountNumber);
	}
	public  Map<String, Account> getAccounts() {
		return accounts;
	}

	public JSONObject getJson() {
		return new JSONObject(accounts);
	}
}