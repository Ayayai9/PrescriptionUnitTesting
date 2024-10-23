package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPrescriptions {
	
	@Test
	void testValid() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Valid Prescription Test",
	        () -> assertEquals(true, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.0f, 180.0f, 4.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(true, p2.addPrescription(2, "Peter", "Scott", "134whitehorseroadboxhill3125australia", -20.0f, 0.0f, -4.0f, "10/04/01", "Dr. John")),
	        () -> assertEquals(true, p3.addPrescription(3, "Lachlan", "Senior", "120Highfieldroadcamberwell3124australia", 0.0f, 0.0f, 0.0f, "22/06/03", "Dr. Scott"))
	    );
	}

	@Test
	void testInvalidFirstName() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid First Name Test",
	        () -> assertEquals(false, p.addPrescription(1, "Joh", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "Johnnnnnnnnnnnnn", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testInvalidSphere() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid Sphere Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", -20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 20.01f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 99.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testInvalidOptometristName() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid Optometrist Name Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smi")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smithhhhhhhhhhhhhhhhhh"))
	    );
	}

	@Test
	void testInvalidAddress() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid Address Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highbury", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburw", 1.0f, 90.0f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}

	@Test
	void testInvalidAxis() {
	    Prescription p = new Prescription();
	    Prescription p2 = new Prescription();
	    Prescription p3 = new Prescription();

	    assertAll("Invalid Axis Test",
	        () -> assertEquals(false, p.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -180.01f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, -0.01f, 1.0f, "10/02/01", "Dr. Smith")),
	        () -> assertEquals(false, p3.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 9999f, 1.0f, "10/02/01", "Dr. Smith"))
	    );
	}


}
