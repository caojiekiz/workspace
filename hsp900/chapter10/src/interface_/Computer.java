package interface_;

public class Computer {
    public void work(UsbInerface usbInerface) {
        usbInerface.start();
        usbInerface.stop();
    }

}
