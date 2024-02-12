package languages;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Languages {

  
     
    public static String pin = "1234";
    public static Scanner scan = new Scanner(System.in);
    public static int attempt = 3;
    public static String cd = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
    public static String time = new SimpleDateFormat("HH.mm.ss").format(new Date());
    public static void main(String[] args)throws InterruptedException {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);
         Scanner scanner = new Scanner(System.in);
         int balance = 2000;
        String PIN = "\\d{4}";
    while(attempt!=0){
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Please Enter Your PIN: "+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        String pass = scan.nextLine();
        if(attempt > 0 && pin.equals(pass)){
            System.out.println("|" +"\t"+"Login Successfully. Welcome "+"\t"+"\t"+"|");
            break;
        }else if(attempt!=0){
            attempt--;
            if (attempt == 0){
                System.out.println("\n=================================================");
                System.out.println("|" +"\t"+"Pin is incorrect."+"\t"+"\t"+"\t"+"|");
                System.out.println("|" +"\t"+"All attempts have been used"+"\t"+"\t"+"|");
                System.out.println("\n=================================================");
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
             System.out.println("|" +"\t"+"Pin is incorrect. Remaining attempts: " + attempt +"\t"+ "|");
        }
            }
        }
    }
        String languageChoice = "English";
        System.out.println("=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Choose a language:"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"1. English"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. Tagalog"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. Indonesia"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. Japanese"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. Malaysia"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.print("|" +"\t"+"Enter your choice (1 to 5): "+"\t"+"\t");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("=================================================");
        
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
                System.out.println("|" +"\t"+"Thank you for Choosing"+"\t"+"\t"+"\t"+"|");
                System.out.println("=================================================");
                 
    while (true) {
        clearScreen();
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Choose your transaction: "+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"1. Balance Inquiry"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. Withdraw"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. Deposit"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. Change Pin"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. Exit"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DATE & TIME: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE OF TRANSACTION: BALANCE INQUIRY"+"\t"+"|");
            System.out.println("|" +"\t"+"BALANCE AMOUNT: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("How much are you willing to withdraw?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Successfully withdrawn");
                    
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DATE & TIME: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE OF TRANSACTION: WITHDRAW"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"WITHDRAWN AMOUNT: ₱"+ valueWithdraw +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"BALANCE AMOUNT: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
           
                    }
                    
                    else {
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
                        System.out.println("Your current balance is: ₱" + balance+"\n");
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DATE & TIME: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE OF TRANSACTION: DEPOSIT"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DEPOSITED AMOUNT: ₱"+ depositAmount +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"BALANCE AMOUNT: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    } else {
                        System.out.println("Unable to process deposit");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n=================================================");
                    System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                    System.out.print("|" +"\t"+"Enter your current PIN: ");
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
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("=================================================");
                                        System.out.println("New Pin: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("New Pin can't be old Pin");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("=================================================");
                                    } else {
                                        System.out.println("The Pin and Confirm Pin doesn't match");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                }
                }
                        

                } else {
                    System.out.println(" Incorrect PIN code.");
                }
                     break;
                case 5:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                     for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                    
                default:
                    System.out.println("Invalid choice");
                    break;
                    
            }

            System.out.println("Do you want to perform another transaction? (1 for yes, any number for no)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);

                break;
            }

        }
            } else if (languageChoice.equals("Tagalog")) {
                System.out.println("Salamata sa pag-pili");
    while (true) {
        clearScreen();
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Pumili ng Transaksyon: "+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"1. Pag tingin ng Balanse"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. Mag-withdraw"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. Deposito"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. Baguhin ang Pin"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. Mag-Exit"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
               case 1:
                    clearScreen();
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"PETSA at ORAS: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"PARAAN NG TRANSAKSYON: BALANCE INQUIRY"+"\t"+"|");
            System.out.println("|" +"\t"+"HALAGA: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Gaano karami ang inyong e-withdraw?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Matagumpay na naka-pag withdraw");
                    
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+""+"PETSA at ORAS: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"PARAAN NG TRANSAKSYON: WITHDRAW"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"WITHDRAWN AMOUNT: aksyon:₱"+ valueWithdraw +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"HALAGA: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
           
                    }
                    
                    else {
                        System.out.println("Hindi Sapat ang inyong Balanse sa pag withdraw");
                        clearScreen();
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Ilagay Depositot:");
                    int depositAmount = sc.nextInt();
                    if (depositAmount >= 1) {
                        balance += depositAmount;
                        System.out.println("Nai-save ang deposito");
                        System.out.println("Ang inyong Balanse ay: ₱" + balance+"\n");
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"ACCOUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"PETSA at ORAS: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"PARAAN NG TRANSAKSYON: DEPOSIT"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DEPOSITED AMOUNT: ₱"+ depositAmount +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"HALAGA: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    } else {
                        System.out.println("Hidni ma-process ang Deposito");
                    }
                    
                    break;

                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n=================================================");
                    System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
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
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                        System.out.println("Bagong PIN: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Ang Bagong Pin ay hindi maaaring lumang Pin");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                    } else {
                                        System.out.println("Hindi magkatugma ang Pin at Kumpirmahin ang Pin");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                }
                }
                        

                } else {
                    System.out.println(" Mali ang PIN code.");
                }
                     break;
                case 5:
                    System.out.println("Salamat sa paggamit ng aming ATM. Paalam!");
                    for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                default:
                    System.out.println("Di-wastong pagpipilian");
                    break;
                    
            }

            System.out.println("Gusto mo bang magsagawa ng isa pang transaksyon? (1 para sa oo, anumang numero para sa hindi)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Salamat sa paggamit ng aming ATM. Paalam!");
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                break;
            }

        }
            } else if (languageChoice.equals("Indonesia")) {
                System.out.println("terima kasih telah memilih!");
                while (true) {
        clearScreen();
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Pilih transaksi Anda: "+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"1. informasi saldo"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. menarik"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. menyetorkan"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. ganti PIN"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. meninggalkan"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKUN NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TANGGAL DAN WAKTU: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODUS TRANSAKSI: INFORMASI SALDO"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH SALDO: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Berapa banyak yang ingin Anda tarik?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Berhasil ditarik");
                    
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKUN NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TANGGAL DAN WAKTU: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODUS TRANSAKSI: MENARIK"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH YANG DItarik: ₱"+ valueWithdraw +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH SALDO: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
           
                    }
                    
                    else {
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
                        System.out.println("Your current balance is: ₱" + balance+"\n");
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKUNT NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TANGGAL DAN WAKTU: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODUS TRANSAKSI: MENYETORKAN"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH YANG DISETORKAN: ₱"+ depositAmount +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH SALDO: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    } else {
                        System.out.println("Tidak dapat memproses setoran");
                    }
                    
                    break;


                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n=================================================");
                    System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
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
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                        System.out.println("Pin Baru: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Pin baru tidak boleh Pin lama");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                    } else {
                                        System.out.println("Pin dan Pin Konfirmasi tidak cocok");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                }
                }
                        

                } else {
                    System.out.println(" Kode PIN salah.");
                }
                     break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM kami. Selamat tinggal!");
                    for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                   
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
                    
            }

            System.out.println("Apakah Anda ingin melakukan transaksi lain? (1 untuk ya, nomor berapa saja untuk tidak)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Terima kasih telah menggunakan ATM kami. Selamat tinggal!");
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                break;
            }

        }
            } else if (languageChoice.equals("Japanese")) {
                System.out.println("Sentaku shite itadaki arigatōgozaimasu");
                 while (true) {
        clearScreen();
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Torihiki o sentaku shite kudasai: "+"\t"+"|");
        System.out.println("|" +"\t"+"1. Zandaka shōkai"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. Tekkai suru"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. Depojitto"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. Pin o henkō suru"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. Deguchi"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
               case 1:
                    clearScreen();
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUNTO NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Hidzuke jikoku: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"Torihiki mōdo: Zandaka shōkai"+"\t"+"|");
            System.out.println("|" +"\t"+"Zandaka: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Ikura hikidashimasu ka?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Seijō ni tekkai sa remashita");
                    
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUNTO NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Hidzuke jikoku: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"Torihiki mōdo: Shukkin"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Hikidashi kingaku: ₱"+ valueWithdraw +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Zandaka: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
           
                    }
                    
                    else {
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
                        System.out.println("Genzai no zandaka wa: ₱" + balance+"\n");
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUNTO NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Hidzuke jikoku: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"Torihiki mōdo: Nyūkin"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Nyūkin kingaku: ₱"+ depositAmount +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"Zandaka: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    } else {
                        System.out.println("Nyūkin o shori dekimasen");
                    }
                    
                    break;


                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n=================================================");
                    System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
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
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                        System.out.println("Atarashī pin: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Atarashī pin o furui pin ni suru koto wa dekimasen");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                    } else {
                                        System.out.println("Pin to pin no kakunin ga itchi shimasen");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                }
                }
                        

                } else {
                    System.out.println(" Pin kōdo ga machigatte imasu.");
                }
                     break;
                case 5:
                    System.out.println("Heiso yori tō ATM o go riyō itadaki makotoni arigatōgozaimasu. Sayōnara!");
                    for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                    
                default:
                    System.out.println("Mukōna sentakudesu");
                    break;
                    
            }

            System.out.println("Betsu no toranzakushon o jikkō shimasu ka? (Hai no baai wa 1, īe no baai wa nin'i no sūji)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Heiso yori tō ATM o go riyō itadaki makotoni arigatōgozaimasu. Sayōnara!");
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                break;
            }

        }
            } else if (languageChoice.equals("Malaysia")) {
                System.out.println("Terima kasih kerana memilih!");
    while (true) {
        clearScreen();
        System.out.println("\n=================================================");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"Pilih transaksi anda: "+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"1. pertanyaan baki"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"2. menarik diri"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"3. simpanan"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"4. tukar pin"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"5. keluar"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
        System.out.println("\n=================================================");
        int choice = sc.nextInt();
            clearScreen();

            switch (choice) {
                case 1:
                    clearScreen();
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUN NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TARIKH DAN MASA: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE URUS NIAGA: PERTANYAAN BAKI"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH BAKI: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Berapa banyak yang anda sanggup keluarkan?");
                    int valueWithdraw = sc.nextInt();
                    if (balance >= valueWithdraw) {
                        balance -= valueWithdraw;
                        System.out.println("Berjaya ditarik balik");
                    
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUN NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TARIKH DAB MASA: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE URUS NIAGA: MENARIK DIRI"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH DIKELUARKAN: ₱"+ valueWithdraw +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH BAKI: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
           
                    }
                    
                    else {
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
                        System.out.println("Baki semasa anda ialah: ₱" + balance+"\n");
            System.out.println("=================================================");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"AKAUN NO: XXXXXXXXXXX"+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"TARIKH DAB MASA: "+ dtf.format(now)+"\t"+"|");
            System.out.println("|" +"\t"+"MODE URUSNIAGA: DEPOSIT"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH YANG DIDEPOSKAN: ₱"+ depositAmount +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"JUMLAH BAKI: ₱"+ balance +"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"DA AMBANKO CORP INC."+"\t"+"\t"+"\t"+"|");
            System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
            System.out.println("=================================================");
                    } else {
                        System.out.println("Tidak dapat memproses deposit");
                    }
                    
                    break;


                case 4:
                    // Change Pin Operation Here:
                    System.out.println("\n=================================================");
                    System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
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
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                        System.out.println("Pin Baharu: " + pin);
                                    } else if (newPin.equals(pin)) {
                                        System.out.println("Pin baharu tidak boleh menjadi Pin lama");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                                    } else {
                                        System.out.println("Pin dan Sahkan Pin tidak sepadan");
                                        System.out.println("|" +"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
                                        System.out.println("\n=================================================");
                }
                }
                        

                } else {
                    System.out.println(" Kod PIN salah.");
                }
                     break;
                case 5:
                    System.out.println("Terima kasih kerana menggunakan ATM kami. selamat tinggal!");
                    for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
                    
                default:
                    System.out.println("Pilihan tidak sah");
                    break;
                    
            }

            System.out.println("Adakah anda mahu melakukan transaksi lain? (1 untuk ya, sebarang nombor untuk tidak)");
            int anotherTransactionChoice = sc.nextInt();
            if (anotherTransactionChoice != 1) {
                System.out.println("Terima kasih kerana menggunakan ATM kami. selamat tinggal!");
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);// 1 sec pagitan ng bawat 5 4 3 2 1
                }
                System.exit(0);
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
   