abstract class employe{
    String name;
    int id;
    abstract void calculateSalary();
}
class Manager extends employe{
    Manager(String name, int id){
        this.name = name;
        this.id = id;
    }
    void calculateSalary(){
        double salary = 50000;
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);              
    }
}
    class Developer extends employe{
        Developer(String name, int id){
            this.name = name;
            this.id = id;
        }
            void calculateSalary(){
                double salary = 100000;
                System.out.println("Employee Name: " + name);
                System.out.println("Employee ID: " + id);
                System.out.println("Salary: " + salary);
            }

        }
    public class Maint{
        public static void main(String[] args){
            Manager m = new Manager("Varsha", 204);
            m.calculateSalary();
            Developer d = new Developer("Vaishnavi", 205);
            d.calculateSalary();
        }
    }

