import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234, count = 0, balance = 2000;

        while (count < 3) {
            count++;
            clearScreen();
            System.out.println("Enter your pin (must be 4 digits): ");
            int userPin = sc.nextInt();
            if (userPin == pin) {
                break;
            } else {
                System.out.println("Invalid pin");
                clearScreen();
            }
            if (count == 3) {
                System.out.println("Your account has been locked due to 3 unsuccessful attempts! Please proceed to the bank");
                System.exit(0);
            }
            clearScreen(); //eto yung gap, naka white space nalang para malinis tignan kada current transaction
        }

        while (true) {
            clearScreen();
            System.out.println("Choose your transaction: ");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("Your balance: " + balance);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("How much are you willing to withdraw?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Successfully withdrawn");
                        System.out.println("Your current balance is: " + balance);
                        clearScreen();
                    } else {
                        System.out.println("You do not have enough balance to withdraw this amount");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Enter deposit amount:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Deposit saved");
                        System.out.println("Your current balance is: " + balance);
                    } else {
                        System.out.println("Unable to process deposit");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Do you want to perform another transaction? (1 for yes, any number for no)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            }

        }

        /* EXPALNATION OWOWOWOWOWO::

        KAPAG GANTO => WHILE(TRUE), IBIG SABIHIN KUNG ANO LAMAN NIYAN IS UULITIN KASI TRUE NAKALAGAY SUSUNDIN NIYO YUN, COMMON SENSE SA KAPAG FALSE HAHAMPASIN KO KAYO NG KALDERO PAG DI NIYO PARIN NAGETS.

        ANG PROB KASI DATI KAYA NAG UULIT ULIT IS BECAUSE NASA LOOB PALA NGSWITCH CASE YUNG GINAGAWA KO, WHICH IS YUNG SWITCH NASA LOOB RIN NG WHILE, KAYA PAG NILABAS NIYO YUNG PROCESS NA KUKUNIN NA YUNG
        ANSWER NUNG USER PAGKATAPOS NG KADA TRANSACTION TAS NILAGAY NIYO WITHIN LANG NG WHILE LOOP, UULITIN NA YUNG LOOP NA NANDUN MENU NA WITH FULL FUNCTION, NAKA != 1 LANG KASI ANY OTHER NUMBER IS KINONSIDER KONA
        AS ANY OTHER NUMBER EXCEPT 1 IS SASARA.


         */
    }

    private static void clearScreen() {   //function for putting empty lines (whte  spaces).
        for (int i = 0; i < 15; ++i) System.out.println();
    }
}
