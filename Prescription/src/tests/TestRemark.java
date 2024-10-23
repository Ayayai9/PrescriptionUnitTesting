package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRemark {
	//p = prescription, p2 = prescription 2 and p3 = prescription 3
	
	
	@Test
	void testaddRemark_testCase1() {
		//Test case 1: Check the function with valid inputs
		//Test case 1_Test Data 1
		Prescription p = new Prescription();
		//assertEquals(true, p.addRemark("Client", "This is a remark"));
		
		//Test case 1_Test Data 2
		Prescription p1 = new Prescription();
		//assertEquals(true, p1.addRemark("Optometrist", "Another remark"));
		
		//Test case 1_Test Data 3
		Prescription p2 = new Prescription();
		//assertEquals(true, p2.addRemark("Optometrist", "Eye pains"));

		assertAll ("Invalid", 
			    ()->assertEquals(true, p.addRemark("Client", "This is a remark")),
			    ()->assertEquals(true, p1.addRemark("Optometrist", "Another remark")),
			    ()->assertEquals(true, p2.addRemark("Optometrist", "Eye pains"))
			);
	}
	@Test
	void testaddRemark_testCase2() {
		//Test case 2: Check the remark for invalid length for maximum 
		//Test case 2_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addRemark("Client", "Thiiiiiiiiiiiiiiiiiis"));
	    
	    //Test case 2_Test Data 2
	    Prescription p1 = new Prescription();
	    //assertEquals(false, p1.addRemark("Client", "Thiiiiiiiiiiiiiiiiisssssss"));
	    
	    //Test case 2_Test Data 3
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addRemark("Client", "Thiiiiiiiiiiiiiiiiis is a remark"));

	    assertAll("Invalid Remark Maximum Length Test",
	        () -> assertEquals(false, p.addRemark("Client", "Thiiiiiiiiiiiiiiiiiis")),
	        () -> assertEquals(false, p1.addRemark("Client", "Thiiiiiiiiiiiiiiiiisssssss")),
	        () -> assertEquals(false, p2.addRemark("Client", "Thiiiiiiiiiiiiiiiiis is a remark"))
	    );
	}

	
	@Test
	void testaddRemark_testCase3() {
		//Test case 3: Check the remark for invalid length for minimum
		//Test case 3_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addRemark("Client", "This"));
	    
	    //Test case 3_Test Data 2
	    Prescription p1 = new Prescription();
	    //assertEquals(false, p1.addRemark("Client", "Thi"));
	    
	    //Test case 3_Test Data 3
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addRemark("Client", "T"));

	    assertAll("Invalid Remark Length Test for Minimum Length",
	        () -> assertEquals(false, p.addRemark("Client", "This")),
	        () -> assertEquals(false, p1.addRemark("Client", "Thi")),
	        () -> assertEquals(false, p2.addRemark("Client", "T"))
	    );
	}

	
	@Test
	void testaddRemark_testCase4() {
		//Test case 4: Check the function with Invalid amount of remarks 
		//Test case 4_Test Data 1
	    Prescription p = new Prescription();
	    p.addRemark("Client", "This is a remark");
        p.addRemark("Client", "This is a remark");
	    //assertEquals(false, p.addRemark("Client", "This is a remark"));
	    
	    //Test case 4_Test Data 2
	    Prescription p2 = new Prescription();
	    p2.addRemark("Client", "This is a remark");
        p2.addRemark("Client", "This is a remark");
        p2.addRemark("Client", "This is a remark");
        //assertEquals(false, p2.addRemark("Client", "This is a remark"));
        
	    //Test case 4_Test Data 3
	    Prescription p3 = new Prescription();
	    p3.addRemark("Client", "This is a remark");
        p3.addRemark("Client", "This is a remark");
        p3.addRemark("Client", "This is a remark");
        p3.addRemark("Client", "This is a remark");
        p3.addRemark("Client", "This is a remark");
        p3.addRemark("Client", "This is a remark");
        //assertEquals(false, p3.addRemark("Client", "This is a remark"));

	    assertAll("Invalid Amount of Remarks Test",
	        () -> {
	            assertEquals(false, p.addRemark("Client", "This is a remark"));
	        },
	        () -> {
	            assertEquals(false, p2.addRemark("Client", "This is a remark"));
	        },
	        () -> {
	            assertEquals(false, p3.addRemark("Client", "This is a remark"));
	        }
	    );
	}

	
	@Test
	void testaddRemark_testCase5() {
		//Test case 5: Check the function with Invalid category 
		//Test case 5_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addRemark("client", "This is a remark"));
	    
	    //Test case 5_Test Data 2
	    Prescription p1 = new Prescription();
	    //assertEquals(false, p1.addRemark("2lient", "This is a remark"));
	    
	    //Test case 5_Test Data 3
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addRemark("", "This is a remark"));

	    assertAll("Invalid Category Test",
	        () -> assertEquals(false, p.addRemark("client", "This is a remark")),
	        () -> assertEquals(false, p1.addRemark("2lient", "This is a remark")),
	        () -> assertEquals(false, p2.addRemark("", "This is a remark"))
	    );
	}

	
	@Test
	void testaddRemark_testCase6() {
		//Test case 6: Check the function with Invalid first character of first word in remark
		//Test case 6_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addRemark("Client", "1his is a remark"));
	    
	    //Test case 6_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addRemark("Client", "this is a remark"));
	    
	    //Test case 6_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(false, p3.addRemark("Client", "is a remark"));

	    assertAll("Invalid First Character of First Word in Remark Test",
	        () -> assertEquals(false, p.addRemark("Client", "1his is a remark")),
	        () -> assertEquals(false, p2.addRemark("Client", "this is a remark")),
	        () -> assertEquals(false, p3.addRemark("Client", "is a remark"))
	    );
	}


}
