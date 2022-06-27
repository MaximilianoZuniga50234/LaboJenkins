/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labojenkins;

/**
 *
 * @author maxim
 */
public class Principal {
    public static void main(String[] args) {
        
        Calculadora c1 = new Calculadora();
        
        System.out.println(c1.sumar(2, 2));
        System.out.println(c1.restar(2, 2));
        System.out.println(c1.multiplicar(2, 2));
        System.out.println(c1.dividir(2, 2));
        System.out.println("Hola mundo");
    }
}
