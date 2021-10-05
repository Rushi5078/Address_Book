package Address;

public class Contact { 
	    //variable declare
	    public String firstname;
	    public  String lastname;
	    public  String address;
	    public  String city;
	    public  String state;
	    public  long zip;
	    public  long phonenumber;
	    public  String email;
	    
	    
	    //Generate getter setter method
	    
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public long getZip() {
			return zip;
		}
		public void setZip(long zip) {
			this.zip = zip;
		}
		public long getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
	//Generate String method	
	    
	    @Override
		public String toString() {
			return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email
					+ "]";
		}

}
