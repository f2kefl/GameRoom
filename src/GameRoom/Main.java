package GameRoom;

import GameRoom.Sort.CostSorter;
import GameRoom.Sort.NameSorter;
import GameRoom.Toys.Toy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 *
 */

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.generateRoom();
        List<Toy> toys = controller.toys;
        System.out.println(controller.getResult(toys) + "\n");

        CostSorter costSorter = new CostSorter();
        NameSorter nameSorter = new NameSorter();

        System.out.println("Input 1 for sort by cost! \n"
        + "Input 2 for sort by name!");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int in;
        try {
            in = Integer.parseInt(r.readLine());
            if (in == 1) costSorter.sortByCost(toys);
            else if (in == 2) nameSorter.sortByName(toys);
            else System.out.println("Incorrect input");
        } catch (IOException e) {
            System.out.println("Incorrect input!");
        }
    }
}
