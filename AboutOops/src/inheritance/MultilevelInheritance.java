package inheritance;

public class MultilevelInheritance {
	public static void main(String[] args) {
        Department d = new Department();
        d.announce();        // from University
        d.conductClasses();  // from College
        d.manageDepartment();// from Department
    }
}


class University {
    void announce() {
        System.out.println("University announces exam schedule");
    }
}

class College extends University {
    void conductClasses() {
        System.out.println("College conducts classes");
    }
}

class Department extends College {
    void manageDepartment() {
        System.out.println("Department manages faculty and students");
    }
}