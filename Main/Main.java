package br.com.praticando.Main;
import br.com.praticando.Model.Veiculo;
import br.com.praticando.Model.Animal;
import br.com.praticando.Model.Casa;
public class Main {
    public static void main(String[] args) {
        Veiculo[] listaDeVeiculos = new Veiculo[5];

        Veiculo veiculo1 = new Veiculo(
                "moto",
                "vermelha",
                2,
                2, "asdasdasdas"
        );


        Veiculo veiculo2 = new Veiculo(
                "moto",
                "azul",
                2,
                2,"asdasdasdas"
        );


        Veiculo veiculo3 = new Veiculo(
                "carro",
                "preto",
                4,
                2,"asdasdasdas"
        );


        Veiculo veiculo4 = new Veiculo(
                "carro",
                "branco",
                4,
                2, "asdasdasdas"
        );


        Veiculo veiculo5 = new Veiculo(
                "carro",
                "cinza",
                4,
                2
                ,"asdasdasdas"
        );

        listaDeVeiculos[0] = veiculo1;
        listaDeVeiculos[1] = veiculo2;
        listaDeVeiculos[2] = veiculo3;
        listaDeVeiculos[3] = veiculo4;
        listaDeVeiculos[4] = veiculo5;

        Animal[] listaAnimais = new Animal[2];

        Animal animal1 = new Animal(
                "Zeus",
                "Gato",
                "preto",
                4
        );

        Animal animal2 = new Animal(
                "Bob",
                "Cachorro",
                "Branco",
                2
        );

        listaAnimais[0] = animal1;
        listaAnimais[1] = animal2;


        Casa casa = new Casa(listaDeVeiculos,listaAnimais);

        casa.imprimirVeiculos();
        casa.imprimirAnimais();


    }
}