/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantMain;

/**
 *
 * @author Gaga
 */
import java.util.Scanner;
public class PlantMain
{

private static final Plant p = new Plant();
private static final Garden g = new Garden();
private static final Anggrek a = new Anggrek();
private static final Mawar ma = new Mawar();
private static final Melati me = new Melati();
private static final Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {

        MainMenu();

    }

    public static void MainMenu() {
        Scanner tanaman = new Scanner(System.in);
        p.displayPlant();

        System.out.println("1. Anggrek");
        System.out.println("2. Mawar");
        System.out.println("3. Melati");
        System.out.println("Pilih: ");
        int t = tanaman.nextInt();
        switch (t) {
            case 1:
                MenuAnggrek(a.jenis);
                break;
            case 2:
                MenuMawar(ma.jenis);
                break;
            case 3:
                MenuMelati(me.jenis);
                break;
        }
    }
    
    public static void MenuAnggrek(String t) {
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do {
            System.out.println();
            System.out.println("0. Menanam Tanaman");
            System.out.println("1. Tanaman Dipanen");
            System.out.println("2. Beri Air");
            System.out.println("3. Beri Pupuk");
            System.out.println("4. Status Tanaman");
            System.out.println("5. Display Garden");
            System.out.println("6. Kembali ke menu utama");
            System.out.println("7. exit \n");
            System.out.println("Pilih:");
            inp = sc.nextInt();

            switch (inp) {
                case 0:
                    g.addPlant(t);
                    break;
                case 1:
                    g.harvestPlant(t);
                    break;
                case 2:
                    a.beriAir();
                    break;
                case 3:
                    a.beriPupuk();
                    break;
                case 4:
                    a.displayPlant();
                    break;
                case 5:
                    g.displayGarden(t);
                    break;
                case 6:
                    MainMenu();
                    break;
                default:
                    System.out.println("\n Program Selesai");
            }
        } while (inp != 7);
    }
    
    public static void MenuMawar(String t) {
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do {
            System.out.println();
            System.out.println("0. Menanam Tanaman");
            System.out.println("1. Tanaman Dipanen");
            System.out.println("2. Beri Air");
            System.out.println("3. Beri Pupuk");
            System.out.println("4. Status Tanaman");
            System.out.println("5. Display Garden");
            System.out.println("6. Kembali ke menu utama");
            System.out.println("7. exit \n");
            System.out.println("Pilih:");
            inp = sc.nextInt();

            switch (inp) {
                case 0:
                    g.addPlant(t);
                    break;
                case 1:
                    g.harvestPlant(t);
                    break;
                case 2:
                    ma.beriAir();
                    break;
                case 3:
                    ma.beriPupuk();
                    break;
                case 4:
                    ma.displayPlant();
                    break;
                case 5:
                    g.displayGarden(t);
                    break;
                case 6:
                    MainMenu();
                    break;
                default:
                    System.out.println("\n Program Selesai");
            }
        } while (inp != 7);
    }
    
    public static void MenuMelati(String t) {
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do {
            System.out.println();
            System.out.println("0. Menanam Tanaman");
            System.out.println("1. Tanaman Dipanen");
            System.out.println("2. Beri Air");
            System.out.println("3. Beri Pupuk");
            System.out.println("4. Status Tanaman");
            System.out.println("5. Display Garden");
            System.out.println("6. Kembali ke menu utama");
            System.out.println("7. exit \n");
            System.out.println("Pilih:");
            inp = sc.nextInt();

            switch (inp) {
                case 0:
                    g.addPlant(t);
                    break;
                case 1:
                    g.harvestPlant(t);
                    break;
                case 2:
                    me.beriAir();
                    break;
                case 3:
                    me.beriPupuk();
                    break;
                case 4:
                    me.displayPlant();
                    break;
                case 5:
                    g.displayGarden(t);
                    break;
                case 6:
                    MainMenu();
                    break;
                default:
                    System.out.println("\n Program Selesai");
                    System.exit(0);
            }
        } while (inp != 7) ;
    }
}