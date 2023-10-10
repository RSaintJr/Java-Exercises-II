package WildCard.UpperBounded;

import java.util.List;

public class Exemplo1 {
    public static void mostraNum(List<? extends Number> list){
        for (Number num : list){
            System.out.println(num);
        }
    }
}
