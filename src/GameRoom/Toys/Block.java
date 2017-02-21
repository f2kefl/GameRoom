package GameRoom.Toys;

public class Block extends Toy {

    public Block(Size size) {
        super(size);
        super.name += "block";
        cost = price.getCost(name);
    }
}
