package inheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manageTeam();

        Developer d = new Developer();
        d.work();
        d.writeCode();
    }
}


class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code");
    }
}


