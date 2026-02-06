
import java.util.Scanner;

class AirlineReservationSystem {

    private boolean[] seats;
    private boolean[] seatf;
    private static final int firstclass_kedah = 20;
    private static final int economyclass_kedah = 40;

    public AirlineReservationSystem() {
        seatf = new boolean[firstclass_kedah];
        seats = new boolean[economyclass_kedah];
    }

    public void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Flight NO      : Kedah2007");
        System.out.println("1. First Class");
        System.out.println("2. Economy Class");

        System.out.print("Enter your choice to book a seat : ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                reservationSystem.First_Kedah();
                break;

            case 2:
                reservationSystem.Economy_Kedah();
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    public void First_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();

        while (true) {
            System.out.println("First Class - Kedah2007");
            System.out.println("1. Book a seat");
            System.out.println("2. Review available seats");
            System.out.println("3. Exit");

            System.out.print("Enter your choice to check available seats : ");
            int choice3 = scanner.nextInt();

            switch (choice3) {
                case 1:
                    reservationSystem.FirstClass_Kedah();
                    break;

                case 2:
                    reservationSystem.CheckFirstClass_Kedah();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    this.reserveSeat();


                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void Economy_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();

        while (true) {
            System.out.println("Economy Class - Kedah2007");
            System.out.println("1. Book a seat");
            System.out.println("2. Review available seats");
            System.out.println("3. Exit");

            System.out.print("Enter your choice to check available seats : ");
            int choice4 = scanner.nextInt();

            switch (choice4) {
                case 1:
                    reservationSystem.EconomyClass_Kedah();
                    break;

                case 2:
                    reservationSystem.CheckEconomyClass_Kedah();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    this.reserveSeat();

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void FirstClass_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("      ");

        for (int i = 0; i < firstclass_kedah / 2; i++) {
            if (seatf[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        System.out.print("      ");

        for (int i = firstclass_kedah / 2; i < firstclass_kedah; i++) {
            if (seatf[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Choose seat (1-" + firstclass_kedah + "): ");
            int seatNumber = scanner.nextInt();

            if (seatNumber >= 1 && seatNumber <= firstclass_kedah) {
                if (seatf[seatNumber - 1]) {
                    System.out.println("Seat already taken. Please choose another seat.");
                } else {
                    seatf[seatNumber - 1] = true;
                    System.out.println("Seat " + seatNumber + " successfully reserved in First Class - Kedah2007.");
                    break;
                }
            } else {
                System.out.println("Invalid seat number. Please try again.");
            }
        }
    }

    public void CheckFirstClass_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("      ");

        for (int i = 0; i < firstclass_kedah / 2; i++) {
            if (seatf[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        System.out.print("      ");

        for (int i = firstclass_kedah / 2; i < firstclass_kedah; i++) {
            if (seatf[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();
    }

    public void EconomyClass_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("      ");

        for (int i = 0; i < economyclass_kedah / 2; i++) {
            if (seats[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        System.out.print("      ");

        for (int i = economyclass_kedah / 2; i < economyclass_kedah; i++) {
            if (seats[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Choose seat (1-" + economyclass_kedah + "): ");
            int seatNumber = scanner.nextInt();

            if (seatNumber >= 1 && seatNumber <= economyclass_kedah) {
                if (seats[seatNumber - 1]) {
                    System.out.println("Seat already taken. Please choose another seat.");
                } else {
                    seats[seatNumber - 1] = true;
                    System.out.println("Seat " + seatNumber + " successfully reserved in Economy Class - Kedah2007.");
                    break;
                }
            } else {
                System.out.println("Invalid seat number. Please try again.");
            }
        }
    }

    public void CheckEconomyClass_Kedah() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("      ");

        for (int i = 0; i < economyclass_kedah / 2; i++) {
            if (seats[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }

        System.out.println();

        System.out.print("      ");

        for (int i = economyclass_kedah / 2; i < economyclass_kedah; i++) {
            if (seats[i]) {
                System.out.print(" [ X ] ");
            } else {
                System.out.print(" [   ] ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AirlineReservationSystem reservationSystem = new AirlineReservationSystem();
        reservationSystem.reserveSeat();
    }
}
