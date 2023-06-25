package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.ContactService.Contact;

class ContactTest {

	@Test
	void InputValidationTest() 
	{
		String id = "222";String firstName = "Hank";String lastName = "Hill";String phone = "9255555555";String address = "123 Rainy Street";
			
	    Contact hankHill = new Contact(id, firstName, lastName, phone, address);
	        
		assertEquals(222, hankHill.getid());
		assertEquals(firstName, hankHill.getFirstName());
		assertEquals(lastName, hankHill.getLastName());
		assertEquals(phone,hankHill.getphone());
		assertEquals(address, hankHill.getAddress());
	}
	
	@Test
	void phoneNumberTooLong()
	{
		String id = "225";String firstName = "Hank";String lastName = "Hill";String phone = "92555555550";String address = "123 Rainy Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			new Contact(id,firstName,lastName,phone,address);
		});
	}

}
