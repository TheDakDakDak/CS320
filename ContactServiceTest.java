package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.ContactService.ContactService;
import static org.junit.Assert.*;

class ContactServiceTest {

	@Test
	void addTest() 
	{
		String firstName="Hank"; String lastName="Hill"; String phone = "9255555555"; String address = "123 Rainy Street";
		ContactService hankHill = new ContactService();
		hankHill.add(firstName,lastName,phone,address);

		assertEquals(0, ContactService.contacts.get(0).getid());
		assertEquals(firstName, ContactService.contacts.get(0).getFirstName());
		assertEquals(lastName, ContactService.contacts.get(0).getLastName());
		assertEquals(phone, ContactService.contacts.get(0).getphone());
		assertEquals(address, ContactService.contacts.get(0).getAddress());
	}
	
	@Test
	void deleteTest()
	{
		boolean isTrue=false; String firstName="Hank"; String lastName="Hill"; String phone="9255555555"; String address="123 Rainy Street";
		ContactService hankHillDouble = new ContactService();
		 
		hankHillDouble.add(firstName,lastName,phone,address);
		hankHillDouble.add(firstName,lastName,phone,address);
		  
		hankHillDouble.delete("1");
		 
		for(int j=0; j<ContactService.contacts.size(); j++) 
		{
			if(ContactService.contacts.get(j).getid()==1)
				isTrue = true;
		}		
		assertFalse(isTrue);	
	}

}
