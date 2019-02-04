import java.text.DateFormat;

public class Cereals extends Products  {

    private String croup;
    private String readinessDegree;
    private String recipe;

    public Cereals(){
        super();
        this.croup = "";
        this.readinessDegree = "";
        this.recipe = "";
    }

    public Cereals(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1, DateFormat df,
                      int temp, String manual1, String croup1, String ready, String recipe1){
        super(id1, price1, name1, age, bol, amount, discont1, df, temp, manual1);
        this.croup = croup1;
        this.readinessDegree = ready;
        this.recipe = recipe1;
    }

}
