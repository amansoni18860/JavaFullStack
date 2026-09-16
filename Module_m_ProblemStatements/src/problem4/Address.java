package problem4;

public class Address {
	private String street;
	private String city;
	private String state;
	private String pinCode;

	public Address(String street, String city, String state, String pinCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return street + ", " + city + ", " + state + " - " + pinCode;
	}

}
