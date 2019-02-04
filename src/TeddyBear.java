public class TeddyBear extends Toys {

    private String coatColour;
    private boolean singingModule;
    private boolean withHeart;

    public TeddyBear(){
        super();
        this.coatColour = "";
        this.singingModule = false;
        this.withHeart = false;
    }

    public TeddyBear(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String mat,
                     String col, Boolean mod, Boolean heart){
        super(id1, price1, name1, age, bol, amount, discont1, mat);
        this.coatColour = col;
        this.singingModule = mod;
        this.withHeart = heart;
    }

}
