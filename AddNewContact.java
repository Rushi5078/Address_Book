package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewContact {

	static String firstname;
	static String lastname;
	static String address;
	static String city;
	static String state;
	static String email;
	static long zip;
	static long phonenumber;

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> personlist = new ArrayList<Contact>();
//this method is used to get input from user
	public static void getinput() {
		System.out.println("Enter the Firstname");
		firstname = sc.nextLine();
		System.out.println("Enter the Lastname");
		lastname = sc.nextLine();
		System.out.println("Enter the Address");
		address = sc.nextLine();
		System.out.println("Enter the City");
		city = sc.nextLine();
		System.out.println("Enter the State");
		state = sc.nextLine();
		System.out.println("Enter the Email");
		email = sc.nextLine();
		System.out.println("Enter the Zip");
		zip = sc.nextLong();
		System.out.println("Enter the phonenumber");
		phonenumber = sc.nextLong();

	}
//this method is used to add the details get from user
	public static void addcontact() {
		Contact person = new Contact();
		person.setFirstname(firstname);
		person.setLastname(lastname);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setEmail(email);
		person.setZip(zip);
		person.setPhonenumber(phonenumber);

		personlist.add(person);

	}
// this method is used to display the output
	public static void show() {
		for (Contact str : personlist)
			System.out.println(str);
	}

	public static void main(String[] args) {

		getinput();
		addcontact();
		show();
	}

}
