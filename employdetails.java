class employdetails{
    int id;
    String name;
    long salary;
    employdetails(int id,String name,long salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args){
        employdetails e = new employdetails(368,"Surya",18000000);
        System.out.println("Employee Id: " + e.id);
        System.out.println("Employee Name: " + e.name);
        System.out.println("Employee Salary: " + e.salary);

    }
}