package br.com.folhapagamento.model;

import br.com.folhapagamento.conexao.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDao {
     private Connection conecta;  

      public CarroDao() {
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void cadastrarCarro(Funcionario obj){
       
       try {
           String cmdsql = "insert into carro(placa, modelo, marca, ano, tipo, cambio, combustivel) values (?,?,?,?,?,?,?)";
           PreparedStatement stmt = conecta.prepareStatement(cmdsql);
           stmt.setInt(1, obj.getPlaca());
           stmt.setString(2, obj.getModelo());
           stmt.setInt(3, obj.getMarca());
           stmt.setFloat(4, obj.geAno());
           stmt.setInt(5, obj.getTipo());
           stmt.setString(6, obj.getCambio());
           stmt.setString(7, obj.getCombustivel());
           stmt.execute();           
           stmt.close();
       } catch (SQLException erro) {
           throw new RuntimeException(erro);  
       }
    }