import java.util.ArrayList;
import java.util.List;


public class Storage {

    private List<GoodsForKids> storage = new ArrayList<>();
    private static final String PATTERN = "[0-9]*";

    public Storage () {

    }

    public Storage (List<GoodsForKids> storage) {
        this.storage = storage;
    }


    public GoodsForKids buy(String id) {
        if (id == null) {
//            throw new IllegalArgumentException("id must not be empty");
            System.err.println("id must not be empty");
            return null;
        }

        if (!id.matches(PATTERN)) {
//            throw new IllegalArgumentException("id must contain only numbers");
            System.err.println("id must contain only numbers");
            return null;
        }

        for (GoodsForKids good : storage) {
            if (id.equals(good.getId())) {
                return good;
            }
        }

        return null;
    }
}
