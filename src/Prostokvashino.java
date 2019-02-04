public class Prostokvashino extends Books  {

    private Boolean cartoonExist;
    private String painterName;

    public Prostokvashino(){
        super();
        this.cartoonExist = false;
        this.painterName = "";
    }

    public Prostokvashino(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String author1, int n,
                       String country, String genre1, String lang, int rep, Boolean ex, String painter){
        super(id1, price1, name1, age, bol, amount, discont1, author1, n, country, genre1, lang, rep);
        this.cartoonExist = ex;
        this.painterName = painter;
    }

}
