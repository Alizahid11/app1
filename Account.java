class Account{
	private String firstName, lastName, accountNumber;

	public Account(String firstName, lastName, accountNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

}