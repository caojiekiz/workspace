package enum_;

import java.util.EnumSet;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season2[] values = Season2.values();
        for(Season2 season: values ) {
            System.out.println(season);
        }
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1= " + autumn1);
        System.out.println(autumn == autumn1);
        System.out.println(Season2.AUTUMN.compareTo(Season2.AUTUMN));
    }
}
