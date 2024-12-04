/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author HP
 */
public interface MetodeBayar {
    public double BayarCash(double cash, double belanja);
    public double BayarQRIS();
    public double BayarEwallet();
    public double BayarCreditCard();
    public double BayarDebitCard();            
}
