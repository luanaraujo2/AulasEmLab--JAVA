/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;
//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

           /**System.out.println("Digite o agencia da conta 1: ");
            int agencia = sc.nextInt();  primeiro modo **/

            /**System.out.println("Digite o numero da conta 1: ");
            int numero = sc.nextInt(); **/
            
            /**System.out.println("Digite o saldo inicial da conta 1: ");
            double saldo = sc.nextDouble();**/
            
            /**System.out.println("Digite o limite da conta 1: ");
            double limite = sc.nextDouble();**/
//PRIMEIRA PARTE           
            int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta 1: "));
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta 1: "));
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta 1: "));
            double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta 1: "));

            Conta c1 = new Conta (agencia, numero, saldo, limite);

            int agencia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta 2: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta 2: "));
            double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta 2: "));
            double limite2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta 2: "));
            // --c1.transferir(c2, 10000);
            Conta c2 = new Conta (agencia2, numero2, saldo2, limite2);
        
//----------------------------------------------------------------------------------------------------------------
//SEGUNDA PARTE
            int escolhaConta;
            int escolhaMov;
            
            do{
                
                escolhaConta = Integer.parseInt(JOptionPane.showInputDialog("MENU 1: \nEscolha qual conta voce quer movimentar: \nConta: (1) ou (2)\n0: Terminar programa e ver saldos"));
                if(escolhaConta == 1 || escolhaConta == 2){
                do{
                    double deb, cred, trans;
                    escolhaMov = Integer.parseInt(JOptionPane.showInputDialog("MENU 2: \nEscolha a movimentacao que deseja fazer: \n1 - Debitar\n2 - Creditar \n3 - Transferir"));
                    switch (escolhaMov){
                    case 1:
                        if(escolhaConta == 1){
                            deb = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja debitar da CONTA 1?: "));
                            c1.debitar(deb);
                            JOptionPane.showMessageDialog(null, "Saldo Debitado com Sucesso!");
                            
                        }
                        else{
                            deb = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja debitar da CONTA 2?: "));
                            c2.debitar(deb);
                            JOptionPane.showMessageDialog(null, "Saldo Debitado com Sucesso!");
                        }
                    break;

                    case 2:
                        if(escolhaConta == 1){
                            cred = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja creditar na CONTA 1?: "));
                            c1.creditar(cred);
                            JOptionPane.showMessageDialog(null, "Saldo Creditado com Sucesso!");
                        }
                        else{
                            cred = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja creditar na CONTA 2?: "));
                            c2.creditar(cred);
                            JOptionPane.showMessageDialog(null, "Saldo Creditado com Sucesso!");
                        }
                    break;

                    case 3:
                        if(escolhaConta == 1){
                            trans = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja transferir da CONTA 1 para a CONTA 2?: "));
                            c1.transferir(c2, trans);
                            JOptionPane.showMessageDialog(null, "Transferencia Realizada com Sucesso!");
                        }
                        else{
                            trans = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja transferir da CONTA 2 para a CONTA 1?: "));
                            c2.transferir(c1, trans);
                            JOptionPane.showMessageDialog(null, "Transferencia Realizada com Sucesso!");
                        }
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Movimentacao invalida. Tente novamente.\n");
                    break;
                    }
                }while(escolhaMov < 1 || escolhaMov > 3);}
                else if(escolhaConta == 0) {
                    JOptionPane.showMessageDialog(null, "Saldos Finais: \nConta 1: " + c1.getSaldoDisponivel() + " reais." + "\nConta 2: " + c2.getSaldoDisponivel() + " reais.");
                }
                else JOptionPane.showMessageDialog(null, "Opcao invalida. Tente novamente.\n");
            }while(escolhaConta != 0);
            
        
        // --JOptionPane.showInputDialog(null, c1.getSaldoDisponivel());
        //System.out.println(c1.getSaldoDisponivel());
        //System.out.println(c2.getSaldoDisponivel());
    }
}
