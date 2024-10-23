package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRemark {
	@Test
	void testValid() {
		Prescription p = new Prescription();
		Prescription p1 = new Prescription();
		Prescription p2 = new Prescription();

		assertAll ("Invalid", 
			    ()->assertEquals(true, p.addRemark("Client", "This is a remark")),
			    ()->assertEquals(true, p1.addRemark("Optometrist", "Another remark")),
			    ()->assertEquals(true, p2.addRemark("Optometrist", "Eye pains"))
			);
	}
	@Test
	void InvalidRemarkLengthForMax() {
	    Prescription p = new Prescription();
	    Prescription p1 = new Prescription();
	    Prescription p2 = new Prescription();

	    assertAll("Invalid Remark Maximum Length Test",
	        () -> assertEquals(false, p.addRemark("Client", "Thiiiiiiiiiiiiiiiiiis")),
	        () -> assertEquals(false, p1.addRemark("Client", "Thiiiiiiiiiiiiiiiiisssssss")),
	        () -> assertEquals(false, p2.addRemark("Client", "Thiiiiiiiiiiiiiiiiis is a remark"))
	    );
	}

	
	@Test
	void InvalidRemarkLengthForMin() {
	    Prescription p = new Prescription();
	    Prescription p1 = new Prescription();
	    Prescription p2 = new Prescription();

	    assertAll("Invalid Remark Length Test for Minimum Length",
	        () -> assertEquals(false, p.addRemark("Client", "This")),
	        () -> assertEquals(false, p1.addRemark("Client", "Thi")),
	        () -> assertEquals(false, p2.addRemark("Client", "T"))
	    );
	}

	
	@Test
	void InvalidAmountOfRemarks() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid Amount of Remarks Test",
	        () -> {
	            p.addRemark("Client", "This is a remark");
	            p.addRemark("Client", "This is a remark");
	            assertEquals(false, p.addRemark("Client", "This is a remark"));
	        },
	        () -> {
	            p2.addRemark("Client", "This is a remark");
	            p2.addRemark("Client", "This is a remark");
	            p2.addRemark("Client", "This is a remark");
	            assertEquals(false, p2.addRemark("Client", "This is a remark"));
	        },
	        () -> {
	            p3.addRemark("Client", "This is a remark");
	            p3.addRemark("Client", "This is a remark");
	            p3.addRemark("Client", "This is a remark");
	            p3.addRemark("Client", "This is a remark");
	            p3.addRemark("Client", "This is a remark");
	            p3.addRemark("Client", "This is a remark");
	            assertEquals(false, p3.addRemark("Client", "This is a remark"));
	        }
	    );
	}

	
	@Test
	void InvalidCategory() {
	    Prescription p = new Prescription();
	    Prescription p1 = new Prescription();
	    Prescription p2 = new Prescription();

	    assertAll("Invalid Category Test",
	        () -> assertEquals(false, p.addRemark("client", "This is a remark")),
	        () -> assertEquals(false, p1.addRemark("2lient", "This is a remark")),
	        () -> assertEquals(false, p2.addRemark("", "This is a remark"))
	    );
	}

	
	@Test
	void InvalidFirstCharacterOfFirstWordInRemark() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid First Character of First Word in Remark Test",
	        () -> assertEquals(false, p.addRemark("Client", "1his is a remark")),
	        () -> assertEquals(false, p2.addRemark("Client", "this is a remark")),
	        () -> assertEquals(false, p3.addRemark("Client", "is a remark"))
	    );
	}


}
