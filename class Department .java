class Department {
    String name;
    String hod;

    public Department(String name, String hod) {
        this.name = name;
        this.hod = hod;
    }

    public void printDepartmentDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("HOD Name: " + hod);
    }
}

class StaffMember extends Department {
    String staffName;
    String qualification;

    public StaffMember(String deptName, String hodName, String staffName, String qualification) {
        super(deptName, hodName);
        this.staffName = staffName;
        this.qualification = qualification;
    }

    public void printStaffDetails() {
        super.printDepartmentDetails();
        System.out.println("Staff Name: " + staffName);
        System.out.println("Qualification: " + qualification);
    }
}

public class Main {
    public static void main(String[] args) {
        StaffMember staff = new StaffMember("IT", "John Doe", "Jane Smith", "Bachelor's in Computer Science");
        staff.printStaffDetails();
    }
}
