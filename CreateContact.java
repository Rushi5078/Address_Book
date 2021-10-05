package Address;

public class CreateContact {
   
	public static void main(String args[]) {
		 Contact person = new Contact();
		
		person.setFirstname("Rushikesh");
		person.setLastname("Bhosle");
		person.setCity("Latur");
		person.setEmail("rushi@gmail.com");
		person.setAddress("Hadpsor Pune");
		person.setState("Maharashtra");
		person.setZip(410056);
		person.setPhonenumber(1234567890); 
		
		System.out.println(person);
	 }
}


