class Service{
	
	private final Map<String, Account> accounts;

	public Service(){
		accounts = new HashMap<>();
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
}