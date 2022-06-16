package phonebookproject;

public class Person {
	private long personNum;
	private String FirstName;
	private String lastName;
	private Address Address;

	public Person() {
	}

	public Person(long personNum, String firstName, String lastName, phonebookproject.Address address) {

		this.personNum = personNum;
		FirstName = firstName;
		this.lastName = lastName;
		Address = address;
	}

	public long getPersonNum() {
		return personNum;
	}

	public void setPersonNum(long personNum) {
		this.personNum = personNum;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

}
