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

public class MainDepartment {
    public static void main(String[] args) {
StaffMember staff1 = new StaffMember("SPORTS", "SheshKumarYadav", "NawabKumarYadav", "Bihar Cricket Associations");
        staff.printStaffDetails();
    }
}
