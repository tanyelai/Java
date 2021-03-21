
public class Authority extends Worker {  // SubClass

    private int responsible_quantity;



    public Authority(String name, int salary, String department, int responsible_quantity){
       /* this.name = name;
        this.salary = salary;
        this.department = department;
        */
       super(name,salary,department);
       this.responsible_quantity = responsible_quantity;

    }

    public void salary_increase(int increase_quantity){
        System.out.println("Increase is done, quantity is: " + increase_quantity);
    }

    public void show_infos(){
        /*System.out.println("Name: " + getName() );
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment()); */
        super.show_infos();
        System.out.println("Boss, responsible for: " + this.responsible_quantity);
    }

}
