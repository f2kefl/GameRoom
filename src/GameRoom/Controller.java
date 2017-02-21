package GameRoom;

import GameRoom.Toys.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Контролер с основными логическими методами
 */

class Controller {

    //основные константы: общая сумма на игрушки и кол-во детей, меняем если нужно
    private final int MONEY = 180;
    private final int INVITEES_NUMBER = 6;

    //текущая использованная сумма. Меняется по мере приглашения детей и создания для них игрушек
    private int used_sum = 0;
    List<Toy> toys = new ArrayList<>();

    void generateRoom(){
        makeToys();
    }

    //создаем игрушки для каждого ребенка
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

    // получаем случайную игрушку
    private Toy getRandomToy(Size size){
        Toy[] toys = {new Doll(size), new Car(size), new Ball(size), new Block(size)};
        int r = (int) (Math.random()*toys.length);
        return toys[r];
    }

    //случайный размер для создания детей
    private Size getRandomSize(){
        int r = (int) (Math.random()*3);
        Size[] sizes = Size.values();
        return sizes[r];
    }

    // создаем детей
    private Child[] inviteChildren(){
        Child[] children = new Child[INVITEES_NUMBER];
        for (int i = 0; i < children.length; i++) {
            children[i] = new Child(getRandomSize());
        }
        return children;
    }

    // итогвые суммы
    String getResult(List<Toy> toys) {
        return "\nUsed moneys: " + used_sum +
                " of total: " + MONEY +
                "\nUsed toys: " + toys.size();
    }
}
