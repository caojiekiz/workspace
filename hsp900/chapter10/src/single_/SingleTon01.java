package single_;

public class SingleTon01  {
    public static void main(String[] args) {
//        GirlFriend xiaohong = new GirlFriend("xiaohong");
//        GirlFriend xiaobai = new GirlFriend("xiaobai");
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}

class GirlFriend {
    private String name;
    private static GirlFriend gf = new GirlFriend("xiaohonghong");

    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}