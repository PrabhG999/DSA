package oops;
//interface example
interface Customer{
    String Weight= "5 KG";                        //Public + static + final
    void purchase();                               //public + abstract
}
class Seller implements Customer {
    @Override
    public void purchase(){
        System.out.println("Customer wants to buy " + Weight+ " Flour");
    }
}

public class counter {
    public static void main(String[] args) {
        Seller shop = new Seller();
        shop.purchase();
    }
}
