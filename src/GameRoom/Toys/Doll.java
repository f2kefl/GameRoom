package GameRoom.Toys;

public class Doll extends Toy {

    public Doll(Size size) {
        super(size);
        super.name += "doll";
        cost = price.getCost(name);
    }
}
