/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Isaias
 */
public class FactoryCarro {
    
    public Carro getCarro(int placa, String modelo, String marca, int ano, String tipo, String cambio, String combustivel){
        Carro carro = new Carro(placa, modelo, marca, ano, tipo, cambio, combustivel);
        return carro;
    }
    
}
