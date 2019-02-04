public class GoodsForKids {

    private String id;
    private double price;
    private String name;
    private int childAge;
    private boolean stockAvailability;
    private int amountOnStock;
    private double discont;


public GoodsForKids() {
    this.id = "";
    this.price = 0.0;
    this.name = "";
    this.childAge = 0;
    this.stockAvailability = false;
    this.amountOnStock = 0;
    this.discont = 0;
    }

    public GoodsForKids(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1){
        this.id = id1;
        this.price = price1;
        this.name = name1;
        this.childAge = age;
        this.stockAvailability = bol;
        this.amountOnStock = amount;
        this.discont = discont1;
    }

    protected String getId() {
        return id;
    }
}