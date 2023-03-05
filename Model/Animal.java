package br.com.praticando.Model;

public class Animal {

    String nomeDoAnimal;
    String especieDoAnimal;
    String corDoPelo;
    int idadeDoAnimal;

    public Animal(String nomeDoAnimal, String especieDoAnimal, String corDoPelo, int idadeDoAnimal){
        this.nomeDoAnimal = nomeDoAnimal;
        this.especieDoAnimal = especieDoAnimal;
        this.corDoPelo = corDoPelo;
        this.idadeDoAnimal = idadeDoAnimal;
    }

    public void alimentarAnimal(){
        System.out.println("Alimentando animal...");
    }
    public void banharAnimal(){
        System.out.println("Banhando animal...");
    }
    public String toString(){
        return "Animal {nomeDoanimal=" + nomeDoAnimal + ",EspecieDoAnimal=" + especieDoAnimal + ",CorDoPelo=" + corDoPelo + ",IdadeDoAnimal=" + idadeDoAnimal +"} ";
    }
}
