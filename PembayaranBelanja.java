/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author HP
 */

public class PembayaranBelanja implements MetodeBayarPakeAplikasi {
    double kembalian;

    @Override
    public double BayarCash(double cash, double belanja) {
        kembalian = cash - belanja;
        return kembalian; // Mengembalikan kembalian
    }

    @Override
    public double BayarQRIS() {
        System.out.println("Pembayaran melalui QRIS berhasil.");
        return 0; // Tidak ada kembalian
    }

    @Override
    public double BayarEwallet() {
        System.out.println("Pembayaran melalui E-Wallet berhasil.");
        return 0; // Tidak ada kembalian
    }

    @Override
    public double BayarCreditCard() {
        System.out.println("Pembayaran melalui Kartu Kredit berhasil.");
        return 0; // Tidak ada kembalian
    }

    @Override
    public double BayarDebitCard() {
        System.out.println("Pembayaran melalui Kartu Debit berhasil.");
        return 0; // Tidak ada kembalian
    }

    @Override
    public double bayarGopay(int idUser , double saldo, double belanjaTotal) {
        if (saldo >= belanjaTotal) {
            System.out.println("Pembayaran melalui Gopay berhasil.");
            return saldo - belanjaTotal; // Mengembalikan sisa saldo
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan pembayaran.");
            return saldo; // Kembali saldo jika tidak cukup
        }
    }

    @Override
    public double bayarQRIS(int idUser , double saldo, double belanjaTotal) {
        // Implementasi pembayaran QRIS dengan saldo
        if (saldo >= belanjaTotal) {
            System.out.println("Pembayaran melalui QRIS berhasil.");
            return saldo - belanjaTotal; // Mengembalikan sisa saldo
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan pembayaran.");
            return saldo; // Kembali saldo jika tidak cukup
        }
    }
}