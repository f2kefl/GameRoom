package GameRoom.Sort;

import GameRoom.Toys.Toy;

import java.util.Comparator;
import java.util.List;

/**
 * ��������� ���������� ������ �� ��������.
 */

public class NameSorter {

    // ���������� ��������� � ��������� ������������
    public void sortByName(List<Toy> toys){
        toys.sort(Comparator.comparing(o -> o.name));
        System.out.println("\n" + output(toys));
    }

    // ����� � �������
    private String output(List<Toy> toys){
        StringBuilder sb = new StringBuilder();
        sb.append("List of toys: " + "\n \n");
        toys.forEach(toy -> sb.append(toy.name).append(" with cost ").append(toy.cost).append("$").append(", for ").append(toy.size).append(" children.").append("\n"));
        return String.valueOf(sb);
    }
}
