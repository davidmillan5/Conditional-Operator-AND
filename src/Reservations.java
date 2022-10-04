public class Reservations {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservations(int guestCount, int restaurantCapacity, boolean isRestaurantOpen) {
        this.guestCount = guestCount;
        this.restaurantCapacity = restaurantCapacity;
        this.isRestaurantOpen = isRestaurantOpen;
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
        if(restaurantCapacity >= guestCount){
            if(isRestaurantOpen){
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            }else{
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
        }


    }

    public void informUser() {
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {
        Reservations partyOfThree = new Reservations(3, 12, true);
        Reservations partyOfFour = new Reservations(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}
