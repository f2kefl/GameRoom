package GameRoom;

import GameRoom.Toys.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������� � ��������� ����������� ��������
 */

class Controller {

    //�������� ���������: ����� ����� �� ������� � ���-�� �����, ������ ���� �����
    private final int MONEY = 180;
    private final int INVITEES_NUMBER = 6;

    //������� �������������� �����. �������� �� ���� ����������� ����� � �������� ��� ��� �������
    private int used_sum = 0;
    List<Toy> toys = new ArrayList<>();

    void generateRoom(){
        makeToys();
    }

    //������� ������� ��� ������� �������
    private void makeToys(){
        Child[] children = inviteChildren();
        for (Child aChild : children) {
            int sum = 0;
            int moneyForChild = MONEY / INVITEES_NUMBER;
            while (moneyForChild > sum) {
                Toy toy = getRandomToy(aChild.ageGroup);
                sum += toy.cost;
                if (moneyForChild >=sum) {
                    toys.add(toy);
                    used_sum += toy.cost;
                }
            }
            sum = 0;
        }
    }

    // �������� ��������� �������
    private Toy getRandomToy(Size size){
        Toy[] toys = {new Doll(size), new Car(size), new Ball(size), new Block(size)};
        int r = (int) (Math.random()*toys.length);
        return toys[r];
    }

    //��������� ������ ��� �������� �����
    private Size getRandomSize(){
        int r = (int) (Math.random()*3);
        Size[] sizes = Size.values();
        return sizes[r];
    }

    // ������� �����
    private Child[] inviteChildren(){
        Child[] children = new Child[INVITEES_NUMBER];
        for (int i = 0; i < children.length; i++) {
            children[i] = new Child(getRandomSize());
        }
        return children;
    }

    // ������� �����
    String getResult(List<Toy> toys) {
        return "\nUsed moneys: " + used_sum +
                " of total: " + MONEY +
                "\nUsed toys: " + toys.size();
    }
}
