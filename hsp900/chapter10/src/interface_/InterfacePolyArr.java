package interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone_) {
                ((Phone_) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone_ implements Usb {
    public void call() {
        System.out.println("手机可以打电话...");
    }
    @Override
    public void work() {
        System.out.println("手机在工作...");
    }
}
class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机在工作...");
    }
}
