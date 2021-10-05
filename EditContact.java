 package Address;
import java.util.Scanner;
import java.util.ArrayList;
public class EditContact 
{

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> personList = new ArrayList<Contact>();
	
       public void addContactDetails()
       {
		System.out.println("Enter the contact details:");
		System.out.println("Enter the first name:");  
		String firstName = sc.next();
		System.out.println("Enter the last name:");
		String lastName = sc.next();
		System.out.println("Enter the address:");
		String address = sc.next();
		System.out.println("Enter the city:");
		String city = sc.next();
		System.out.println("Enter the state:");
		String state = sc.next();
		System.out.println("Enter the email:");
		String email = sc.next();
		System.out.println("Enter the phonenumber:");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter the zip:");
    	long zip =sc.nextLong();
		
		Contact person = new Contact();
		person.setFirstname(firstName);
		person.setLastname(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setEmail(email);
		person.setPhonenumber(phoneNumber);
		person.setZip(zip);
		
		personList.add(person);
	}
	
public void editContact(String fName) {
		
		for (Contact person : personList) {

			if (person.getFirstname().equals(fName)) {

				System.out.println("Enter the detail which needs to be updated:");

				System.out.println("1 : First Name of the contact to be edited");
				System.out.println("2 : Last Name of the contact to be edited");
				System.out.println("3 : Address of the contact to be edited");
				System.out.println("4 : City of the contact to be edited");
				System.out.println("5 : State of the contact to be edited");
				System.out.println("6 : Zip of the contact to be edited");
				System.out.println("7 : Phone Number of the contact to be edited");
				System.out.println("8 : Email of the contact to be edited");

				System.out.println("Select the index for the contact detail ");

				
				int choice = sc.nextInt();
				switch (choice) {
				case 1: 
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					person.setFirstname(firstName);
					break;			
	
				case 2: 
					System.out.println("Enter last name: ");
					String lastName = sc.next();
					person.setLastname(lastName);
					break;
				
				case 3: 
					System.out.println("Enter Address: ");
					String address = sc.next();
					person.setAddress(address);
					break;
				
				case 4: 
					System.out.println("Enter City: ");
					String city = sc.next();
					person.setCity(city);
					break;
				
				case 5: 
					System.out.println("Enter State: ");
					String state = sc.next();
					person.setState(state);
					break;
				
				case 6: 
					System.out.println("Enter Zip: ");
					long zip = sc.nextLong();
					person.setZip(zip);
					break;
				
				case 7: 
					System.out.println("Enter Phone Number:");
					long phoneNumber = sc.nextLong();
					person.setPhonenumber(phoneNumber);
					break;
				
				case 8: 
					System.out.println("Enter Email Code: ");
					String email = sc.next();
					person.setEmail(email);
					break;
					
				default:
						break;
				}
			}

		}
	}
	/*
	 * @purpose: Remove contact details in list
	 * @return: No return value
	 */
	
      public void removeContactDetails() {
		
		System.out.println("Enter the contact details:");
		System.out.println("Enter the first name:");
		String firstName = sc.next();
				
		for(Contact person : personList) {
			if(person.getFirstname().equals(firstName)) {
				personList.remove(person);
			}
		}		
	}
   
     public static void main(String args[]) {
		
		EditContact addressBook = new EditContact();
		boolean flag = true;
		while(flag)
		{
		System.out.println("1.Add Contact" + "\n" + "2.Edit Contact" + "\n" + "3.Display AddressBook" + "\n" + "4.Delete Contact" + "\n" + "5.Exit");
		System.out.println("Enter Choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			addressBook.addContactDetails();
			break;
		
		case 2:
			System.out.println("Edit details");
			String firstName = sc.next();
			addressBook.editContact(firstName);
			break;
		
		case 3:
			System.out.println(personList);
			break;
			
		case 4:
			addressBook.removeContactDetails();        
			break;
		default:
			flag = false;
			break;
		}
     }
   }
}
