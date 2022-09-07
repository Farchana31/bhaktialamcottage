
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roy Eko
 */
public class BhaktiAlam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan tipe cottage: ");
        String cottage = input.next();
         System.out.println("Masukan hari masuk: ");
        String hari = input.next();
        System.out.println("Untuk berapa orang? ");
        int orang = input.nextInt();
        int harga = 0;
        
        if(!cottage.equalsIgnoreCase("barrack")) {
        if (cottage.equalsIgnoreCase("Duku")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 915000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 1025000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 1225000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Jeruk")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 915000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 1025000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 1225000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Alpukat")) {
            if (orang > 1) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 575000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 695000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 895000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("JambuAir")) {
            if (orang > 1) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 575000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 695000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 895000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Durian")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 595000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 915000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Melon")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 595000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 915000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Belimbing")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 495000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Mangga")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 495000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000;
            }else {
                harga = 0;
            }
        }
        if (cottage.equalsIgnoreCase("Kedondong")) {
            if (orang > 2) {
                System.out.println("Melebihi kapasitas");
            }if(hari.equalsIgnoreCase("Weekday")){
                harga = 495000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000;
            }else {
                harga = 0;
            }
        }
        System.out.println("Harga cottage " + cottage + " pada " + hari + " dengan " + orang + " orang = " + harga);
        }else{
            if(hari.equalsIgnoreCase("Weekday")){
                harga = 25000;
            }else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 25000;
            }else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 35000;
            }else {
                harga = 0;
            }
            System.out.println("Harga Cottage " + hari + " dengan " + orang + " orang = " + harga*orang);
        }
    }
}
