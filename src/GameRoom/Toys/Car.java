package GameRoom.Toys;

public class Car extends Toy {

    public Car(Size size) {
        super(size);
        super.name += "car";
        cost = price.getCost(name);
    }
}
