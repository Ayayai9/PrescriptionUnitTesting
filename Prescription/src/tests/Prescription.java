package tests;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.text.ParseException; // Import the ParseException class


public class Prescription {
    private int prescID;
    private String firstName;
    private String lastName;
    private String address;
    private float sphere;
    private float axis;
    private float cyclinder;
    private Date examinationDate;
    private String date;
    private String optometrist;
    private String[] remarkTypes = { "Client", "Optometrist" };
    private ArrayList<String> savedTypes = new ArrayList<String>();
    private ArrayList<String> postRemarks = new ArrayList<String>();
    
    public static void main(String[] args) {
        ArrayList<Prescription> Prescriptions = new ArrayList<Prescription>();

        // test case 1
        Prescription p = new Prescription();
        if (p.addPrescription(4, "Nick", "Dexter", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01",
                "Dr. Smith")
                && p.addRemark("Client", "Hi nick :)")
                && p.addRemark("Optometrist", "Hi also :)")
        		) {
            Prescriptions.add(p);
        }

        // test case 2
        Prescription p2 = new Prescription();
        if (p2.addPrescription(1, "John", "Doey", "134highburyroadburwood3125australia", 1.0f, 90.0f, 1.0f, "10/02/01",
                "Dr. Smith")
                && p2.addRemark("Client", "This is a remark")
                && p2.addRemark("Optometrist", "Another remark")) {
            Prescriptions.add(p2);
        }
        

        // write to file
        try {
            FileWriter myWriter = new FileWriter("Prescriptions.txt");
            // add prescriptions to file
            for (int i = 0; i < Prescriptions.size(); i++) {
                myWriter.write(Prescriptions.get(i).prescID + ", " +
                        Prescriptions.get(i).firstName + ", "
                        + Prescriptions.get(i).lastName + ", "
                        + Prescriptions.get(i).address + ", "
                        + Prescriptions.get(i).sphere + ", "
                        + Prescriptions.get(i).axis + ", "
                        + Prescriptions.get(i).cyclinder + ", "
                        + Prescriptions.get(i).date + ", "
                        + Prescriptions.get(i).optometrist);
                // add remarks to file
                for (int j = 0; j < Prescriptions.get(i).postRemarks.size(); j++) {
                    myWriter.write("\n");
                    myWriter.write(Prescriptions.get(i).savedTypes.get(j) + ", ");
                    myWriter.write(Prescriptions.get(i).postRemarks.get(j));
                }
                // seperate prescriptions by two new lines
                myWriter.write("\n");
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public boolean addPrescription(int ID, String first, String last, String address, float sphere, float axis,
            float cyclinder, String examDate, String optometrist) {

        this.prescID = ID;
        this.firstName = first;
        this.lastName = last;
        this.address = address;
        this.sphere = sphere;
        this.axis = axis;
        this.cyclinder = cyclinder;
        this.date = examDate;
        this.optometrist = optometrist;

        if (firstName.length() <= 15
                && firstName.length() >= 4
                && lastName.length() <= 15
                && lastName.length() >= 4
                && address.length() >= 20
                && sphere >= -20f
                && sphere <= 20f
                && axis <= 180f
                && axis >= 0f
                && cyclinder <= 4f
                && cyclinder >= -4f
                && optometrist.length() <= 25
                && optometrist.length() >= 8
                && examDate.length() == 8
                && examDate.charAt(2) == '/'
                && examDate.charAt(5) == '/') {
            return true;
        }
        return false;
    }
  
    public boolean addRemark(String type, String remark) {
        if (postRemarks.size() < 2
                && Character.isUpperCase(remark.charAt(0))
                && (type == remarkTypes[0] || type == remarkTypes[1])
                && remark.length() <= 20
                && remark.length() >= 6) {
            postRemarks.add(remark);
            savedTypes.add(type);
            return true;
        }
        return false;
    }
}