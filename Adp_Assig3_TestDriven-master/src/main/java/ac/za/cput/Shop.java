package ac.za.cput;

public class Shop {
    private int stock = 5;

    public Shop (){};

    public void Product()
    {
        stock--;
    }

    public int getStock()
    {
        return this.stock;
    }
}
