public class HarryPotter extends Books {

    private String bookSeria;
    private String additionalGoods;

    public HarryPotter(){
        super();
        this.bookSeria = "";
        this.additionalGoods = "";
    }

    public HarryPotter(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String author1, int n,
                 String country, String genre1, String lang, int rep, String ser, String add1){
        super(id1, price1, name1, age, bol, amount, discont1, author1, n, country, genre1, lang, rep);
        this.bookSeria = ser;
        this.additionalGoods = add1;
    }
}
