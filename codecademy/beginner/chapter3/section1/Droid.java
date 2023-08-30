package beginner.chapter3.section1;

public class Droid {
    int batteryLevel;
    String name;
    public Droid(String droidName) {
        this.name = droidName;
        batteryLevel = 100;

    }
    public String toString() {
        return "Hello, I’m the droid: " + name + "Here";
    }
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }
    public void energyReport() {
        System.out.println(name + " batteryLevel is " + batteryLevel);

    }
    public void energyTransfer(Droid droid) {
        //System.out.println(batteryLevel) {
        int tempBatteryLevel = this.batteryLevel;
        this.batteryLevel = droid.batteryLevel;
        droid.batteryLevel = tempBatteryLevel;
    }
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("dancing");
        Droid tom = new Droid("Tom");
        tom.performTask("levitating");
        codey.energyReport();
        tom.energyReport();
        codey.energyTransfer(tom);
        codey.energyReport();
        tom.energyReport();
    }
}