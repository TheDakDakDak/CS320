package com.ContactService;

import java.util.ArrayList;
import java.util.List;


public class ContactService {
	
	int idCount = 0;
	public static List<Contact> contacts = new ArrayList<Contact>();
	
	public void add(String firstName, String lastName, String phone, String address) 
	{
		String forString=Integer.toString(idCount);
		Contact createContact=new Contact(forString, firstName, lastName, phone, address);
		contacts.add(createContact.getid(),createContact);
		++idCount;
	}
	public void delete(String theID) 
	{
		int forInt = Integer.valueOf(theID);
		for(int i=0; i<ContactService.contacts.size();i++) 
		{
			if(ContactService.contacts.get(i).getid()==forInt)
				contacts.remove(i);
		}
	}
	public void updateFirstName(String id, String firstName) 
	{
		for(Contact i:contacts) 
		{
			if(i.getid()==Integer.valueOf(id))
				i.setFirstName(firstName);				
		}	
	}
	public void updateLastName(String id, String lastName) 
	{
		for(Contact i:contacts) 
		{
			if(i.getid()==Integer.valueOf(id)) 
				i.setLastName(lastName);				
		}	
	}
	public void updatePhone(String id, String phone) {
		for(Contact i:contacts) 
		{
			if(i.getid()==Integer.valueOf(id))
				i.setphone(phone);					
		}	
	}
	public void updateAddress(String id, String address) 
	{
		for(Contact i:contacts) 
		{
			if(i.getid()==Integer.valueOf(id))
				i.setAddress(address);							
		}	
	}

}