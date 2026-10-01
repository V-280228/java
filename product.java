class product{
    int id;
    String name;
    int price;
    product(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args){
        product p = new product(406,"Handwash",900);
        System.out.println("Product ID: " + p.id);
        System.out.println("Product Name: " + p.name);
        System.out.println("Product Price: " + p.price);

    }
}