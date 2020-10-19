/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexao.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Isaias
 */
public class CarroDao {
    private Connection conecta;

   public CarroDao() {
        this.conecta = new ConnectionFactory().conecta();
    }
    
    public void cadastrarCarro(Carro obj) {
        try {
            String cmdsql = "insert into carro(placa, modelo, marca,ano, tipo, cambio, combustivel) values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getPlaca());
            stmt.setString(2, obj.getModelo());
            stmt.setString(3, obj.getMarca());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getTipo());
            stmt.setString(6, obj.getCambio());
            stmt.setString(7, obj.getCombustivel());
            stmt.execute();
            stmt.close();
            } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public List<Carro>listarCarros(){
        try{
            List<Carro> lista = new ArrayList<Carro>();
            String Sql="SELECT * FROM carro";
            PreparedStatement stmt=conecta.prepareStatement(Sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Carro c = new Carro();
                c.setId(rs.getInt("id"));
                c.setPlaca(rs.getString("placa"));
                c.setModelo(rs.getString("modelo"));
                c.setMarca(rs.getString("marca"));
                c.setAno(rs.getInt("ano"));
                c.setTipo(rs.getString("tipo"));
                c.setCambio(rs.getString("cambio"));
                c.setCombustivel(rs.getString("combustivel"));
                lista.add(c);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }

    public void excluirCarro(Carro obj) {
        try {
            String cmdsql = "delete from carro where id=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, obj.getId());
            stmt.execute();

            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public void alterarCarro(Carro obj){
        try {
            String cmdsql = "update carro set placa=?, modelo=?, "
            + "marca=?, ano=?, tipo=?, cambio=?, combustivel=? where id=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getPlaca());
            stmt.setString(2, obj.getModelo());
            stmt.setString(3, obj.getMarca());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getTipo());
            stmt.setString(6, obj.getCambio());
            stmt.setString(6, obj.getCombustivel());
            stmt.execute();
            stmt.close();

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
