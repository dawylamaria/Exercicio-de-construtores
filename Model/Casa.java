package br.com.praticando.Model;

public class Casa {

    Veiculo[] listaDeVeiculos = new Veiculo[5];
    Animal[] listaAnimais = new Animal[2];

    public Casa(Veiculo[] listaDeVeiculos, Animal[] listaAnimais){
        this.listaDeVeiculos = listaDeVeiculos;
        this.listaAnimais = listaAnimais;

    }
    public void imprimirVeiculos(){
        for (Veiculo veiculo : listaDeVeiculos){
            System.out.println(veiculo.toString());
        }
    }
    public void imprimirAnimais(){
        for (Animal animal : listaAnimais){
            System.out.println(animal.toString());
        }
    }

}
