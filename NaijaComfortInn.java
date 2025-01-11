import java.util.ArrayList;
import java.util.List;

public class NaijaComfortInn {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean needsMaintenance;

    public NaijaComfortInn(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
        this.needsMaintenance = false;
    }

    public void markAsOccupied() {
        this.isAvailable = false;
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public void markAsUnderMaintenance() {
        this.needsMaintenance = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean needsMaintenance() {
        return needsMaintenance;
    }

    public class Guest {
        private String name;
        private String phoneNumber;
        private String email;
        private String bookingReference;

        public Guest(String name, String phoneNumber, String email, String bookingReference) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.bookingReference = bookingReference;
        }

        public String getDetails() {
            return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Booking Reference: " + bookingReference;
        }

        public String getBookingReference() {
            return bookingReference;
        }
    }

    public class Booking {
        private Guest guest;
        private NaijaComfortInn room;
        private String checkInDate;
        private String checkOutDate;
        private double totalPayment;

        public Booking(Guest guest, NaijaComfortInn room, String checkInDate, String checkOutDate) {
            this.guest = guest;
            this.room = room;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public void calculatePayment(int days, double festivePeriodMultiplier) {
            this.totalPayment = days * room.getPricePerNight() * festivePeriodMultiplier;
        }

        public String cancelBooking() {
            room.markAsAvailable();
            return "Booking for " + guest.getDetails() + " has been cancelled.";
        }

        public Guest getGuest() {
            return guest;
        }

        public NaijaComfortInn getRoom() {
            return room;
        }
    }

    public class HotelManagementSystem {
        private List<NaijaComfortInn> rooms;
        private List<Booking> bookings;
        private List<String> admins;
        private double festivePeriodMultiplier;

        public HotelManagementSystem() {
            rooms = new ArrayList<>();
            bookings = new ArrayList<>();
            admins = new ArrayList<>();
            festivePeriodMultiplier = 1.0;
        }

        public void initializeRooms(int numberOfRooms, String roomType, double pricePerNight) {
            for (int i = 1; i <= numberOfRooms; i++) {
                rooms.add(new NaijaComfortInn(i, roomType, pricePerNight));
            }
        }

        public String bookRoom(String[] guestDetails, String roomType, int nights, boolean festivePeriod) {
            for (NaijaComfortInn room : rooms) {
                if (room.getRoomType().equals(roomType) && room.isAvailable() && !room.needsMaintenance()) {
                    room.markAsOccupied();
                    Guest guest = new Guest(guestDetails[0], guestDetails[1], guestDetails[2], guestDetails[3]);
                    Booking booking = new Booking(guest, room, "", "");
                    booking.calculatePayment(nights, festivePeriod ? festivePeriodMultiplier : 1.0);
                    bookings.add(booking);
                    return "Room " + room.getRoomNumber() + " booked for " + guest.getDetails() + ".";
                }
            }
            return "No available rooms for the selected type.";
        }

        public String cancelBooking(String bookingReference) {
            for (Booking booking : bookings) {
                if (booking.getGuest().getBookingReference().equals(bookingReference)) {
                    bookings.remove(booking);
                    return booking.cancelBooking();
                }
            }
            return "Booking reference not found.";
        }

        public List<NaijaComfortInn> viewAvailableRooms() {
            List<NaijaComfortInn> availableRooms = new ArrayList<>();
            for (NaijaComfortInn room : rooms) {
                if (room.isAvailable() && !room.needsMaintenance()) {
                    availableRooms.add(room);
                }
            }
            return availableRooms;
        }

        public String manageGuestDetails(int roomNumber) {
            for (Booking booking : bookings) {
                if (booking.getRoom().getRoomNumber() == roomNumber) {
                    return booking.getGuest().getDetails();
                }
            }
            return "No guest found for the specified room number.";
        }

        public String assignRole(String userType, String password) {
            admins.add(userType + ":" + password);
            return "Role " + userType + " assigned.";
        }

        public void generateReport(String timePeriod) {
        }

        public void sendNotification(String bookingReference) {
            for (Booking booking : bookings) {
                if (booking.getGuest().getBookingReference().equals(bookingReference)) {
                }
            }
        }

        public String simulateMaintenance(int roomNumber) {
            for (NaijaComfortInn room : rooms) {
                if (room.getRoomNumber() == roomNumber) {
                    room.markAsUnderMaintenance();
                    return "Room " + roomNumber + " is marked for maintenance.";
                }
            }
            return "Room number not found.";
        }

        public void updatePricing(double festivePeriod) {
            festivePeriodMultiplier = festivePeriod;
        }
}

}