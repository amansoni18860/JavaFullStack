package problem5;

public class Author {

	private String authorName;
	private String email;
	private char gender;
	
	public Author(String authorName,String email,char gender) {
		this.authorName=authorName;
		this.email=email;
		this.gender=gender;
	}
	
	public void displayAuthorInfo() {
		System.out.println("Author: "+authorName);
		System.out.println("Email: "+email);
		System.out.println("Gender: "+gender);
	}
}
