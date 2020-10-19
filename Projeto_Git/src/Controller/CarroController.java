/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Carro;
import domain.CarroDao;
import domain.FactoryCarro;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaias
 */
public class CarroController {
    private Carro obj;
    private final CarroDao dao = new CarroDao();

    public CarroController() {
    }
    
    public void salvar(String placa, String modelo, String marca, int ano, String tipo, String cambio, String combustivel){
        try{
            FactoryCarro factory = new FactoryCarro();
            obj = factory.getCarro(placa, modelo, marca, ano, tipo, cambio, combustivel);
            dao.cadastrarCarro(obj);
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar carro!");
            //e.printStackTrace();
        }
    }
    
    public void alterar(String placa, String modelo, String marca, int ano, String tipo, String cambio, String combustivel){
        try{
            FactoryCarro factory = new FactoryCarro();
            obj = factory.getCarro(placa, modelo, marca, ano, tipo, cambio, combustivel);
            dao.alterarCarro(obj);
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao alterar carro!");
            //e.printStackTrace();
        }
    }
    
    public void excluir(String placa, String modelo, String marca, int ano, String tipo, String cambio, String combustivel){
        try{
            FactoryCarro factory = new FactoryCarro();
            obj = factory.getCarro(placa, modelo, marca, ano, tipo, cambio, combustivel);
            dao.excluirCarro(obj);
            
            JOptionPane.showMessageDialog(null, "Carro excluido com sucesso!");

            }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao deletar carro!");
        }
}
}
