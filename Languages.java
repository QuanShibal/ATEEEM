/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languages;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Languages {

  
     
    public static String pin = "1234";
    public static Scanner scan = new Scanner(System.in);
    public static int attempt = 3;
    public static String cd = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
    public static String time = new SimpleDateFormat("HH.mm.ss").format(new Date());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Scanner scanner = new Scanner(System.in);
         int balance = 2000;
        String PIN = "\\d{4}";
    while(attempt!=0){
        System.out.println("\n==========================================================================");
        System.out.println("Please Enter Your PIN: ");
        String pass = scan.nextLine();
        if(attempt > 0 && pin.equals(pass)){
            System.out.println("Login Successfully. Welcome ");
            break;
        }else if(attempt!=0){
            attempt--;
            if (attempt == 0){
                System.out.println("Pin is incorrect.");
                System.out.println("All attempts have been used");
                System.exit(0);
        }else{
            
            try{
                int p = Integer.parseInt(pass);
            }catch(NumberFormatException e){
                System.out.println("Pin must contain numbers only");
                
            }
            if(pass.length()>4){
               System.out.println("Pin must contain 4 characters only");
               break;
            }else{
             System.out.println("Pin is incorrect. Remaining attempts: " + attempt);
        }
            }
        }
    }
        String languageChoice = "English";

        System.out.println("Choose a language:");
        System.out.println("1. English");
        System.out.println("2. Tagalog");
        System.out.println("3. Indonesia");
        System.out.println("4. Japanese");
        System.out.println("5. Malaysia");
        System.out.print("Enter your choice (1 to 5): ");

        
            int choices = scanner.nextInt();

            if (choices == 1) {
                languageChoice = "English";
                
            } else if (choices == 2) {
                languageChoice = "Tagalog";
            } else if (choices == 3) {
                languageChoice = "Indonesia";
            } else if (choices == 4) {
                languageChoice = "Japanese";
            } else if (choices == 5) {
                languageChoice = "Malaysia";
            } else {
                System.out.println("Invalid choice. Defaulting to English.");
            }

            if (languageChoice.equals("English")) {
                System.out.println("Thank you for Choosing");
                 
    while (true) {
        clearScreen();
        System.out.println("\n==========================================================================");
        System.out.println("Choose your transaction: ");
        System.out.println("1. Balance Inquiry");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");
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
                    // Change Pin Operation Here:
                    System.out.println("\n==========================================================================");
                    System.out.print("Enter your current PIN: ");
                    String currentpin = sc.next();

                    if (currentpin.equals(pin)) {
                        System.out.print("\nEnter your new PIN: ");
                        String newPin = sc.next();
                        sc.nextLine();

                        String limit = "1234";
                        if (!newPin.matches(PIN)) {
                            if (newPin.length() > limit.length()) {
                                System.out.println("The Pin should be 4 characters only");
                                } else {
                                    System.out.println("The Pin can't be letters");
                                        }
                                } else {
                                    System.out.print("Confirm new Pin: ");
                                    String confirmpin = sc.next();
                                    sc.nextLine();

                                    if (newPin.equals(confirmpin) && newPin.matches(PIN)) {
                                        // Change Pin operation successful
                                        pin = newPin;
                                        System.out.println("New Pin Confirmed");
                                        System.out.println("==========================================================================");
                                        System.out.println("New Pin: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("New Pin can't be old Pin");
                                        System.out.println("==========================================================================");
                                    } else {
                                        System.out.println("The Pin and Confirm Pin doesn't match");
                                        System.out.println("\n==========================================================================");
                }
                }
                        

                } else {
                    System.out.println(" Incorrect PIN code.");
                }
                     break;
                case 5:
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
            } else if (languageChoice.equals("Tagalog")) {
                System.out.println("Salamata sa pag-pili");
    while (true) {
        clearScreen();
        System.out.println("\n==========================================================================");
        System.out.println("Pumili ng inyong transaksyon: ");
        System.out.println("1. Pag tingin ng Balanse");
        System.out.println("2. Mag-withdraw");
        System.out.println("3. Deposito");
        System.out.println("4. Baguhin ang Pin");
        System.out.println("5. Mag-Exit");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("Inyong balance: " + balance);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Gaano karami ang inyong e-withdraw?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Matagumpay na pag withdraw");
                        System.out.println("Ang balanse Ninyo ay: " + balance);
                        clearScreen();
                    } else {
                        System.out.println("Hindi sapat ang inyongg balance sa pag withdraw");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Ilagay kung ganno karami ang ideposit:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Nai-save ang deposito");
                        System.out.println("Ang balanse Ninyo ay: " + balance);
                    } else {
                        System.out.println("Hindi kaya ma process ang deposito");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n==========================================================================");
                    System.out.print("Ilagay ang Inyong kasalukuyang PIN: ");
                    String currentpin = sc.next();

                    if (currentpin.equals(pin)) {
                        System.out.print("\nIlagay ang bagong PIN: ");
                        String newPin = sc.next();
                        sc.nextLine();

                        String limit = "1234";
                        if (!newPin.matches(PIN)) {
                            if (newPin.length() > limit.length()) {
                                System.out.println("Ang PIN ay Hanggang 4 digits lang");
                                } else {
                                    System.out.println("Ang PIN ay hindi dapat titik");
                                        }
                                } else {
                                    System.out.print("kumpirmahin ang bagong PIN: ");
                                    String confirmpin = sc.next();
                                    sc.nextLine();

                                    if (newPin.equals(confirmpin) && newPin.matches(PIN)) {
                                        // Change Pin operation successful
                                        pin = newPin;
                                        System.out.println("bagong pin nakumpirma");
                                        System.out.println("==========================================================================");
                                        System.out.println("Bagong PIN: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Ang Bagong Pin ay hindi maaaring lumang Pin");
                                        System.out.println("==========================================================================");
                                    } else {
                                        System.out.println("Hindi magkatugma ang Pin at Kumpirmahin ang Pin");
                                        System.out.println("\n==========================================================================");
                }
                }
                        

                } else {
                    System.out.println(" Mali ang PIN code.");
                }
                     break;
                case 5:
                    System.out.println("Salamat sa paggamit ng aming ATM. Paalam!");
                    System.exit(0);
                default:
                    System.out.println("Di-wastong pagpipilian");
                    break;
                    
            }

            System.out.println("Gusto mo bang magsagawa ng isa pang transaksyon? (1 para sa oo, anumang numero para sa hindi)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Salamat sa paggamit ng aming ATM. Paalam!");
                break;
            }

        }
            } else if (languageChoice.equals("Indonesia")) {
                System.out.println("terima kasih telah memilih!");
                while (true) {
        clearScreen();
        System.out.println("\n==========================================================================");
        System.out.println("Pilih transaksi Anda: ");
        System.out.println("1. Informasi saldo");
        System.out.println("2. Menarik");
        System.out.println("3. Menyetorkan");
        System.out.println("4. Ganti PIN");
        System.out.println("5. KELUAR");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("keseimbangan Anda: " + balance);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Berapa banyak yang ingin Anda tarik?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Berhasil ditarik");
                        System.out.println("Saldo Anda saat ini adalah: " + balance);
                        clearScreen();
                    } else {
                        System.out.println("Anda tidak memiliki cukup saldo untuk menarik jumlah ini");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Masukkan jumlah setoran:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Setoran disimpan");
                        System.out.println("Saldo Anda saat ini adalah: " + balance);
                    } else {
                        System.out.println("Tidak dapat memproses setoran");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n==========================================================================");
                    System.out.print("Masukkan PIN Anda saat ini: ");
                    String currentpin = sc.next();

                    if (currentpin.equals(pin)) {
                        System.out.print("\nMasukkan PIN baru Anda: ");
                        String newPin = sc.next();
                        sc.nextLine();

                        String limit = "1234";
                        if (!newPin.matches(PIN)) {
                            if (newPin.length() > limit.length()) {
                                System.out.println("Pin harus terdiri dari 4 karakter saja");
                                } else {
                                    System.out.println("Pin tidak boleh berupa huruf");
                                        }
                                } else {
                                    System.out.print("Konfirmasikan pin baru: ");
                                    String confirmpin = sc.next();
                                    sc.nextLine();

                                    if (newPin.equals(confirmpin) && newPin.matches(PIN)) {
                                        // Change Pin operation successful
                                        pin = newPin;
                                        System.out.println("Pin Baru Dikonfirmasi");
                                        System.out.println("==========================================================================");
                                        System.out.println("Pin Baru: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Pin baru tidak boleh Pin lama");
                                        System.out.println("==========================================================================");
                                    } else {
                                        System.out.println("Pin dan Pin Konfirmasi tidak cocok");
                                        System.out.println("\n==========================================================================");
                }
                }
                        

                } else {
                    System.out.println(" Kode PIN salah.");
                }
                     break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM kami. Selamat tinggal!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
                    
            }

            System.out.println("Apakah Anda ingin melakukan transaksi lain? (1 untuk ya, nomor berapa saja untuk tidak)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Terima kasih telah menggunakan ATM kami. Selamat tinggal!");
                break;
            }

        }
            } else if (languageChoice.equals("Japanese")) {
                System.out.println("Sentaku shite itadaki arigatōgozaimasu");
                 while (true) {
        clearScreen();
        System.out.println("\n==========================================================================");
        System.out.println("Torihiki o sentaku shite kudasai: ");
        System.out.println("1. Zandaka shōkai");
        System.out.println("2. Tekkai suru");
        System.out.println("3. Depojitto");
        System.out.println("4. Pin no henkō");
        System.out.println("5. Deguchi");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("Anata no baransu: " + balance);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Zandaka wa ikura hikidashimasu ka?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Seijō ni tekkai sa remashita");
                        System.out.println("Genzai no zandaka wa: " + balance);
                        clearScreen();
                    } else {
                        System.out.println("Kono kingaku o hikidasu no ni jūbun'na zandaka ga arimasen");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Nyū kingaku o nyūryoku shite kudasai:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Depojitto ga hozon sa remashita");
                        System.out.println("Genzai no zandaka wa: " + balance);
                    } else {
                        System.out.println("Nyūkin o shori dekimasen");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n==========================================================================");
                    System.out.print("Genzai no pin o nyūryoku shite kudasai: ");
                    String currentpin = sc.next();

                    if (currentpin.equals(pin)) {
                        System.out.print("\nAtarashī pin o nyūryoku shite kudasai: ");
                        String newPin = sc.next();
                        sc.nextLine();

                        String limit = "1234";
                        if (!newPin.matches(PIN)) {
                            if (newPin.length() > limit.length()) {
                                System.out.println("Pin wa 4 moji nomi ni shite kudasai");
                                } else {
                                    System.out.println("Pin ni moji wa shiyō dekimasen");
                                        }
                                } else {
                                    System.out.print("Atarashī pin o kakunin suru: ");
                                    String confirmpin = sc.next();
                                    sc.nextLine();

                                    if (newPin.equals(confirmpin) && newPin.matches(PIN)) {
                                        // Change Pin operation successful
                                        pin = newPin;
                                        System.out.println("Atarashī pin ga kakunin sa remashita");
                                        System.out.println("==========================================================================");
                                        System.out.println("Atarashī pin: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Atarashī pin o furui pin ni suru koto wa dekimasen");
                                        System.out.println("==========================================================================");
                                    } else {
                                        System.out.println("Pin to pin no kakunin ga itchi shimasen");
                                        System.out.println("\n==========================================================================");
                }
                }
                        

                } else {
                    System.out.println(" Pin kōdo ga machigatte imasu.");
                }
                     break;
                case 5:
                    System.out.println("Heiso yori tō ATM o go riyō itadaki makotoni arigatōgozaimasu. Sayōnara!");
                    System.exit(0);
                default:
                    System.out.println("Mukōna sentakudesu");
                    break;
                    
            }

            System.out.println("Betsu no toranzakushon o jikkō shimasu ka? (Hai no baai wa 1, īe no baai wa nin'i no sūji)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Heiso yori tō ATM o go riyō itadaki makotoni arigatōgozaimasu. Sayōnara!");
                break;
            }

        }
            } else if (languageChoice.equals("Malaysia")) {
                System.out.println("Terima kasih kerana memilih!");
    while (true) {
        clearScreen();
        System.out.println("\n==========================================================================");
        System.out.println("Pilih transaksi anda: ");
        System.out.println("1. Pertanyaan baki");
        System.out.println("2. tarik diri");
        System.out.println("3. simpanan");
        System.out.println("4. Tukar Pin");
        System.out.println("5. Keluar");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("Baki anda: " + balance);
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Berapa banyak yang anda sanggup keluarkan?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Berjaya ditarik balik");
                        System.out.println("Baki semasa anda ialah: " + balance);
                        clearScreen();
                    } else {
                        System.out.println("Anda tidak mempunyai baki yang mencukupi untuk mengeluarkan jumlah ini");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Masukkan jumlah deposit:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Deposit disimpan");
                        System.out.println("Baki semasa anda ialah: " + balance);
                    } else {
                        System.out.println("Tidak dapat memproses deposit");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n==========================================================================");
                    System.out.print("Masukkan PIN semasa anda: ");
                    String currentpin = sc.next();

                    if (currentpin.equals(pin)) {
                        System.out.print("\nMasukkan PIN baharu anda: ");
                        String newPin = sc.next();
                        sc.nextLine();

                        String limit = "1234";
                        if (!newPin.matches(PIN)) {
                            if (newPin.length() > limit.length()) {
                                System.out.println("Pin hendaklah 4 aksara sahaja");
                                } else {
                                    System.out.println("Pin tidak boleh berupa huruf");
                                        }
                                } else {
                                    System.out.print("Sahkan Pin baharu: ");
                                    String confirmpin = sc.next();
                                    sc.nextLine();

                                    if (newPin.equals(confirmpin) && newPin.matches(PIN)) {
                                        // Change Pin operation successful
                                        pin = newPin;
                                        System.out.println("Pin Baharu Disahka");
                                        System.out.println("==========================================================================");
                                        System.out.println("Pin Baharu: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Pin baharu tidak boleh menjadi Pin lama");
                                        System.out.println("==========================================================================");
                                    } else {
                                        System.out.println("Pin dan Sahkan Pin tidak sepadan");
                                        System.out.println("\n==========================================================================");
                }
                }
                        

                } else {
                    System.out.println(" Kod PIN salah.");
                }
                     break;
                case 5:
                    System.out.println("Terima kasih kerana menggunakan ATM kami. selamat tinggal!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak sah");
                    break;
                    
            }

            System.out.println("Adakah anda mahu melakukan transaksi lain? (1 untuk ya, sebarang nombor untuk tidak)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Terima kasih kerana menggunakan ATM kami. selamat tinggal!");
                break;
            }

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
   