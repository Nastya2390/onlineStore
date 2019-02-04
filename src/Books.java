public class Books extends GoodsForKids {

    private String author;
    private int numberOfPages;
    private String countryOfPublishing;
    private String genre;
    private String bookLanguage;
    private int replication;

    public Books(){
        super();
        this.author = "";
        this.numberOfPages = 0;
        this.countryOfPublishing = "";
        this.genre = "";
        this.bookLanguage = "";
        this.replication = 0;
    }

    public Books(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String author1, int n,
                 String country, String genre1, String lang, int rep){
        super(id1, price1, name1, age, bol, amount, discont1);
        this.author = author1;
        this.numberOfPages = n;
        this.countryOfPublishing = country;
        this.genre = genre1;
        this.bookLanguage = lang;
        this.replication = rep;
    }

}

