package beginner.chapter3.section3;

public class Reservation01 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation01(int count, int capacity, boolean open) {
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
        // Write conditional statement below
        if(count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
    }

    public void confirmReservation() {
    /*
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
        if(restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        // Write conditional here
        if(!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        Reservation01 partyOfThree = new Reservation01(3, 12, true);
        Reservation01 partyOfFour = new Reservation01(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}
