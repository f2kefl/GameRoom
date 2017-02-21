package GameRoom.Toys;

public class Ball extends Toy {

    public Ball(Size size) {
        super(size);
        super.name += "ball";
        cost = price.getCost(name);
    }
}
