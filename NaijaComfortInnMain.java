import java.util.Scanner;

public class NaijaComfortInnMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     NaijaComfortInn.HotelManagementSystem hotelSystem = new NaijaComfortInn(25, "NaijaComfortInn", 150.0).new HotelManagementSystem();
        hotelSystem.initializeRooms(10, "Single", 100);
        hotelSystem.initializeRooms(5, "Double", 200);

        while (true) {
	System.out.println("Main Menu");
        System.out.println("1. Book Room");
        System.out.println("2. View Available Rooms");
        System.out.println("3. Cancel Booking");
        System.out.println("4. Manage Guest Details");
        System.out.println("5. Generate Reports");
        System.out.println("6. Simulate Maintenance");
        System.out.println("7. Assign Role");
        System.out.println("8. Exit");
        System.out.print("Select an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {

case 1:
	 System.out.print("Enter guest name: ");
         String name = scanner.nextLine();
         System.out.print("Enter phone number: ");
         String phoneNumber = scanner.nextLine();
         System.out.print("Enter email: ");
         String email = scanner.nextLine();
         System.out.print("Enter booking reference: ");
         String bookingReference = scanner.nextLine();
         String[] guestDetails = {name, phoneNumber, email, bookingReference};

         System.out.print("Enter room type: ");
         String roomType = scanner.nextLine();
         System.out.print("Enter number of nights: ");
         int nights = scanner.nextInt();
         System.out.print("Is it a festive period? (true/false): ");
         boolean festivePeriod = scanner.nextBoolean();
         scanner.nextLine();

        System.out.println(hotelSystem.bookRoom(guestDetails, roomType, nights, festivePeriod));
	break;
case 2:
        System.out.println("Available Rooms:");
        for (NaijaComfortInn room : hotelSystem.viewAvailableRooms()) {
        System.out.println("Room Number: " + room.getRoomNumber() + ", Room Type: " + room.getRoomType() + ", Price Per Night: " + room.getPricePerNight());
  }
        break;
case 3:
        System.out.print("Enter booking reference: ");
        String ref = scanner.nextLine();
        System.out.println(hotelSystem.cancelBooking(ref));
        break;

                case 4:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(hotelSystem.manageGuestDetails(roomNumber));
                    break;

                case 5:
                    System.out.print("Enter time period (weekly/monthly): ");
                    String timePeriod = scanner.nextLine();
                    hotelSystem.generateReport(timePeriod);
                    break;

                case 6:
                    System.out.print("Enter room number: ");
                    int maintenanceRoomNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(hotelSystem.simulateMaintenance(maintenanceRoomNumber));
                    break;

case 7:
	System.out.print("Enter user type: ");
        String userType = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(hotelSystem.assignRole(userType, password));
   }

}

}
} 
