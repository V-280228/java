class bankerdetails{
    long a;
    String name;
    int b;
    bankerdetails(long a,String name,int b){
        this.a = a;
        this.name = name;
        this.b = b;
    }
    public static void main(String[] args){
        bankerdetails d = new bankerdetails(456677890,"Vaishnavi",80000);
        System.out.println("Account Number: " + d.a);
        System.out.println("Account Holder Name: " + d.name);
        System.out.println("Account Balance: " + d.b);
        
    }
    
}