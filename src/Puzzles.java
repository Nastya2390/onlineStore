public class Puzzles extends  Toys {

    private int amountOfDetails;
    private int timeOfMounting;
    private int complexity;

    public Puzzles(){
        super();
        this.amountOfDetails = 0;
        this.timeOfMounting = 0;
        this.complexity = 0;
    }

    public Puzzles(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String mat,
                   int am, int tm, int compl){
        super(id1, price1, name1, age, bol, amount, discont1, mat);
        this.amountOfDetails = am;
        this.timeOfMounting = tm;
        this.complexity = compl;
    }

}
