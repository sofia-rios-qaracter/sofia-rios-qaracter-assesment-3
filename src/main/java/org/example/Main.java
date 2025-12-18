package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GlobalAccountRegistry gar = new GlobalAccountRegistry();
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        do {
            repetir = menu(sc, gar);
        }while(repetir);
    }

    public static boolean menu(Scanner sc, GlobalAccountRegistry gar){
        boolean repetir = true;
        int option = 0;

        System.out.println("1. Add new account.");
        System.out.println("2. Transfer money between accounts.");
        System.out.println("3. Show accounts with more than some balance");
        System.out.println("4. Close");

        option = readInt(sc);

        switch (option){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                repetir = false;
                break;
            default:
                System.out.println("Not readed option");
        }

        return repetir;
    }

    public static int readInt(Scanner sc){
        int readed = sc.nextInt();
        sc.nextLine();
        return readed;
    }
}