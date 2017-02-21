package GameRoom.Sort;

import GameRoom.Toys.Toy;

import java.util.List;

/**
 * ��������� ������ ������� �� ��������� (�� �������� � ��������)
 */

public class CostSorter {

    // ������ ���������� ��� ����������� ������ � ���������� ����������
    public void sortByCost(List<Toy> toys){
        toys.sort((o1, o2) -> {
            if (o1.cost != o2.cost){
                return o1.cost > o2.cost ? -1: 1;
            }
            return 0;
        });
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
