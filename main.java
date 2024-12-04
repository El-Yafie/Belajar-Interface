/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author HP
 */

public class main {
    public static void main(String[] args) {
        PembayaranBelanja PB = new PembayaranBelanja();

        // Contoh penggunaan
        System.out.println(" Pembayaran Cash ");
        double kembalian = PB.BayarCash(50000, 30000);
        System.out.println("Kembalian: " + kembalian);

        System.out.println("\n Pembayaran QRIS ");
        PB.BayarQRIS();

        System.out.println("\n Pembayaran E-Wallet ");
        PB.BayarEwallet();

        System.out.println("\n Pembayaran Kartu Kredit ");
        PB.BayarCreditCard();

        System.out.println("\n Pembayaran Kartu Debit ");
        PB.BayarDebitCard();

        System.out.println("\n Pembayaran Gopay ");
        double sisaSaldo = PB.bayarGopay(1, 100000, 30000);
        System.out.println("Sisa saldo setelah pembayaran Gopay: " + sisaSaldo);
    }
}
