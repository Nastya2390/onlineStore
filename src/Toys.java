public class Toys extends GoodsForKids {

    private String material;

    public Toys(){
        super();
        this.material = "";
    }

    public Toys(String id1, double price1, String name1, int age, boolean bol, int amount, double discont1,String mat){
        super(id1, price1, name1, age, bol, amount, discont1);
        this.material = mat;

    }

}


