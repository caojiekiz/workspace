package beginner.chapter6.section2;

class Noodle {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public Noodle() {

    }

    public void cook() {

        System.out.println("Boiling.");

        this.texture = "cooked";

    }
    public final boolean isTasty() {

        return true;

    }
    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }

    public static void main(String[] args) {
        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);
        //10-3
        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);
        //10-4
        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

        //
        Noodle spaghetti, ramen, pho;
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        // Add your code below:
        Noodle[] allTheNoodles = {spaghetti,ramen,pho};
        for(Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }
    }

}
