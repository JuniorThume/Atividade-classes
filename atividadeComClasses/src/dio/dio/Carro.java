package src.dio;

import java.lang.String;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }



    void setCor(String corAux){
        this.cor=corAux;
    }

    String getCor(){
        return this.cor;
    }

    void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }

    String getModelo(){
        return this.modelo;
    }

    void setCapacidadeTanque(int novaCapacidade){
        this.capacidadeTanque = novaCapacidade;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
