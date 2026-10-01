class thiskeyword{
    int id;
    String name;
    String department;
    thiskeyword(int id,String name,String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public static void main(String[] args){
        thiskeyword k = new thiskeyword(103,"Vaishnavi", "CSE");
        System.out.println("Student ID: " + k.id);
        System.out.println("Student Name: " + k.name);
        System.out.println("Student Department: " + k.department);

    }
}