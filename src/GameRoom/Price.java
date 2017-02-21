package GameRoom;

public class Price {

    //задаем цены на каждый вид игрушки
    public int getCost(String name){
        switch (name){
            case "small doll": return 10;
            case "medium doll": return 12;
            case "large doll": return 14;
            case "small car": return 8;
            case "medium car": return 11;
            case "large car": return 15;
            case "small ball": return 7;
            case "medium ball": return 9;
            case "large ball": return 12;
            case "small block": return 5;
            case "medium block": return 6;
            case "large block": return 7;
        }
        return 0;
    }

}
