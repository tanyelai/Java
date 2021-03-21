
public class Worker { //SuperClass - BaseClass

    private String name;
        private int salary;
        private String department;

    public Worker(String name, int salary, String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
    }

    public void work(){
        System.out.println("Worker is working...");
    }

    public void show_infos(){
        System.out.println("Name: " + name );
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public void change_department(String new_department){
        System.out.println("Department is changing...");
        this.department = new_department;

        System.out.println("New department: " + department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
