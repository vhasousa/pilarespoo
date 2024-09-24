package com.senai.pilarespoo;

public class Veiculo {
    String marca;
    private String modelo;
    String cor;
    
    public void ligarMotor() {
        System.out.println("O veiculo esta ligado.");
    }
    
    public void desligarMotor() {
        System.out.println("O veiculo esta desligado.");
    }
    
    public void setModelo(String modelo) {
         if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido");
        }
    }
    
    public String getModelo() {
        return this.modelo;
    }
}
