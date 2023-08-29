package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        //如果IG继承了IH接口,而teacher类实现了IG接口
        //那么,实际上就相当于Teacher 类也实现了IH接口
        IH ih = new Teacher();
    }
}
interface IH {
    void hi();
}
interface IG extends IH {}
class Teacher implements IG {
    @Override
    public void hi() {

    }
}