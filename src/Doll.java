public class Doll extends Toys {

    private String colorOfEyes;
    private String hairColor;
    private int hairLength;

    public Doll(){
        super();
        this.colorOfEyes = "";
        this.hairColor = "";
        this.hairLength = 0;
    }

    public Doll(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String mat,
                String col, String hair, int len){
        super(id1, price1, name1, age, bol, amount, discont1, mat);
        this.colorOfEyes = col;
        this.hairColor = hair;
        this.hairLength = len;
    }

}
