import java.text.DateFormat;

public class Products extends GoodsForKids {

    private DateFormat expirationDate;
    private int storageTemperature;
    private String manual;

    public Products(){
        super();
        this.expirationDate = null;
        this.storageTemperature = 0;
        this.manual = "";
    }

    public Products(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1, DateFormat df,
                    int temp, String manual1){
        super(id1, price1, name1, age, bol, amount, discont1);
        this.expirationDate = df;
        this.storageTemperature = temp;
        this.manual = manual1;
    }

}
