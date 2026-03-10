/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author alunolab13
 */
public class Conta {
    
    private int agencia, numero;
    private double saldo, limite;
    

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public Conta(){
      
    }

    public Conta(int agencia, int numero, double saldoInicial, double limite) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    
    
    
    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldoDisponivel(){  
        return saldo + limite;    
    }
    
    public void creditar(double valor){
      //saldo = saldo + valor; 
      saldo += valor;
    }
       public boolean debitar(double valor){
           if(valor<=getSaldoDisponivel()){
               saldo -= valor;
               return true;
           }else{
               System.out.println("Saldo Insuficiente!");
               return false;
           }
    }
       
    public boolean transferir(Conta destino, double valor){
        if(this.debitar(valor)){
            destino.creditar(valor);
            return true;
        }
        else{
            System.out.println ("Transferencia nao realizada");
            return false;
    }
    }
}
