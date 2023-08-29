package enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        //System.out.println(Season.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}

enum Season2 {

//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season WINTER = new Season("冬天", "寒冷");
    SPRING("春天", "温暖"),SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽"),WINTER("冬天", "寒冷");
    private String name;
    private String desc;//描述

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}