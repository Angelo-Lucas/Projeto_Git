package domain;

public class Carro {
    private int id;
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String tipo;
    private String cambio;
    private String combustivel;
    
    public Carro(){}

    public Carro(String placa, String modelo, String marca, int ano, String tipo, String cambio, String combustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.tipo = tipo;
        this.cambio = cambio;
        this.combustivel = combustivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", tipo=" + tipo + 
                ", cambio=" + cambio + ", combustivel=" + combustivel + '}';
    }
    
    
}
