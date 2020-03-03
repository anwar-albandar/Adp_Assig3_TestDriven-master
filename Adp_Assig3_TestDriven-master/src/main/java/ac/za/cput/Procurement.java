package ac.za.cput;

public class Procurement {

    private static Shop myShop;
    private static Client myClient;
    private static Items myItems;

    public static void main( String[] args )
    {
        myShop = new Shop();
        myClient = new Client("Mukuna", 5);
        myItems = new Items("Orange", 2);

        makeSale();
        makeSale();
        makeSale();
    }

    public static void makeSale()
    {
        if(myShop.getStock()>0)
        {
            if( myClient.getBalance()>=myItems.getPrice())
            {
                myClient.reduceBalance(myItems.getPrice());
                myShop.Product();
            }  else System.out.println("Not Cash ");
        } else System.out.println("Not Stock");
    }

}
