package com.ContactService;

public class Contact 
{
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;	
	
	private boolean isIdValid(String id) 
	{
		if(id.length()<11 && id!=null) 
			return true;			
		else
			return false;
	}
	private boolean isFirstNameValid(String firstName) 
	{
		if(firstName.length()<11 && firstName!=null)
			return true;	
		else
			return false;
	}
	private boolean isLastNameValid(String lastName) 
	{
		if(lastName.length()<11 && lastName!=null)
			return true;
		else
			return false;
	}
	private boolean isPhoneValid(String phone) 
	{
		if(phone.length()==10 && phone!=null)
			return true;	
		else
			return false;
	}
	private boolean isAddressValid(String address) 
	{
		if(address.length()<31 && address!=null) 
			return true;	
		else
			return false;
	}
	
	public Contact(String id, String firstName, String lastName, String phone, String address) 
	{
		if(!this.isIdValid(id))
			throw new IllegalArgumentException("ID must be 10 characters or less");
		if(!this.isFirstNameValid(firstName))
			throw new IllegalArgumentException("First name must be 10 characters or less");
		if(!this.isLastNameValid(lastName))
			throw new IllegalArgumentException("Last name must be 10 characters or less");
		if(!this.isPhoneValid(phone))
			throw new IllegalArgumentException("Phone number must be exactly 10 characters");
		if(!this.isAddressValid(address))
			throw new IllegalArgumentException("Address must be 30 characters or less");
		
		this.id=id; this.firstName=firstName; this.lastName=lastName; this.phone=phone;this.address=address;
	}

	public int getid() 
	{
		return Integer.valueOf(id);
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public String getphone() 
	{
		return phone;
	}
	public String getAddress() 
	{
		return address;
	}

	public void setFirstName(String firstName) 
	{
		if(!this.isFirstNameValid(firstName))
			throw new IllegalArgumentException("First name must be 10 characters or less");
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		if(!this.isLastNameValid(lastName))
			throw new IllegalArgumentException("Last name must be 10 characters or less");
		this.lastName = lastName;
	}

	public void setphone(String phone) 
	{
		if(!this.isPhoneValid(phone))
			throw new IllegalArgumentException("Phone number must be exactly 10 characters");
		this.phone = phone;
	}


	public void setAddress(String address) 
	{
		if(!this.isAddressValid(address))
			throw new IllegalArgumentException("Address must be 30 characters or less");
		this.address = address;
	}

}