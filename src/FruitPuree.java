import java.text.DateFormat;

public class FruitPuree extends Products  {
    private String fruitComposition;
    private int weight;
    private int numberInPackage;

    public FruitPuree(){
        super();
        this.fruitComposition = "";
        this.weight = 0;
        this.numberInPackage = 0;
    }

    public FruitPuree(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1, DateFormat df,
                    int temp, String manual1, String fruit, int weight1, int num){
        super(id1, price1, name1, age, bol, amount, discont1, df, temp, manual1);
        this.fruitComposition = fruit;
        this.weight = weight1;
        this.numberInPackage = num;
    }

}
