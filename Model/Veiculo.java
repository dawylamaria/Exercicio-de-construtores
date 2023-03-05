package br.com.praticando.Model;

public class Veiculo {

    String cor;
    int quantidadeRodas;
    int quantidadeEspelhos;
    String chassi;

    public Veiculo(String tipoDeVeiculo,String cor, int quantidadeRodas, int quantidadeEspelhos, String chassi){
        this.cor = cor;
        this.quantidadeRodas = quantidadeRodas;
        this.quantidadeEspelhos = quantidadeEspelhos;
        this.chassi = chassi;

    }

    public void dirigir(){
        System.out.println("Dirigindo...");
    }
    public void parar(){
        System.out.println("Parando...");
    }
    public String toString(){
        return "Veiculo {Cor=" + cor + ",QuantidadeRodas=" + quantidadeRodas + ",QuantidadeDeEspelhos=" + quantidadeEspelhos + ",Chassi=" + chassi +"}";
    }
}
