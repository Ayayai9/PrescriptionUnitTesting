package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrescriptions {
	//p = prescription, p2 = prescription 2 and p3 = prescription 3
	
	@Test
	void testaddPrescription_testCase1() {
		//Test case 1: Check the function with valid inputs
		//Test case 1_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(true, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.0f, 180.0f, 4.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 1_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(true, p2.addPrescription(2, "Peter", "Scott", "134whitehorseroadboxhill3125australia", -20.0f, 0.0f, -4.0f, "10/04/01", "Dr. John"));
	    
	    //Test case 1_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(true, p3.addPrescription(3, "Lachlan", "Senior", "120Highfieldroadcamberwell3124australia", 0.0f, 0.0f, 0.0f, "22/06/03", "Dr. Scott"));

	    assertAll("Valid Prescription Test",
	        () -> assertEquals(true, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.0f, 180.0f, 4.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(true, p2.addPrescription(2, "Peter", "Scott", "134whitehorseroadboxhill3125australia", -20.0f, 0.0f, -4.0f, "10/04/01", "Dr. John")),
	        () -> assertEquals(true, p3.addPrescription(3, "Lachlan", "Senior", "120Highfieldroadcamberwell3124australia", 0.0f, 0.0f, 0.0f, "22/06/03", "Dr. Scott"))
	    );
	}

	@Test
	void testaddPrescription_testCase2() {
		//Test case 2: Check the function with invalid firstName
		//Test case 2_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addPrescription(1, "Joh", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 2_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addPrescription(1, "Johnnnnnnnnnnnnn", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 2_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(false, p3.addPrescription(1, "", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));

	    assertAll("Invalid First Name Test",
	        () -> assertEquals(false, p.addPrescription(1, "Joh", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "Johnnnnnnnnnnnnn", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testaddPrescription_testCase3() {
		//Test case 3: Check the function with invalid Sphere
		//Test case 3_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", -20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 3_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    
	    //Test case 3_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 99.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))

	    assertAll("Invalid Sphere Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", -20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 99.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testaddPrescription_testCase4() {
		//Test case 4: Check the function with invalid optometrist name
		//Test case 4_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smi"));
	    
	    //Test case 4_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", ""));
	    
	    //Test case 4_Test Data 3
	    Prescription p3 = new Prescription();
	    ///assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smithhhhhhhhhhhhhhhhhh"));

	    assertAll("Invalid Optometrist Name Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smi")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smithhhhhhhhhhhhhhhhhh"))
	    );
	}

	@Test
	void testaddPrescription_testCase5() {
		//Test case 5: Check the function with invalid address
		
		//Test case 5_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addPrescription(1, "John", "Doey", "134highbury", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 5_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addPrescription(1, "John", "Doey", "134", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 5_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburw", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"));

	    assertAll("Invalid Address Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highbury", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburw", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testaddPrescription_testCase6() {
		//Test case 6: Check the function with invalid Axis
		
		//Test case 6_Test Data 1
	    Prescription p = new Prescription();
	    //assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -180.01f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 6_Test Data 2
	    Prescription p2 = new Prescription();
	    //assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -0.01f, 1.0f, "10/02/01", "Dr. Smith"));
	    
	    //Test case 6_Test Data 3
	    Prescription p3 = new Prescription();
	    //assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 9999f, 1.0f, "10/02/01", "Dr. Smith"));

	    assertAll("Invalid Axis Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -180.01f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -0.01f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 9999f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}


}
