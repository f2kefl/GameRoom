package GameRoom.Toys;

import GameRoom.Price;

public abstract class Toy {

    public String name = "";
    public Size size;
    public int cost;

    Price price = new Price();

    Toy(Size size) {
        this.size = size;
        name = size + " " + name;
    }
}
