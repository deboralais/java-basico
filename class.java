import java.util.Scanner;

/** Classe **/

class Carro {
    String marca;
    String placa;
    Int ano;
}

class Garagem {
    String id;
    Carro carro[];
}

public class Estacionamento {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Garagem garagens = new Garagem() ;
        garagens.id = "123";
        garagens.carro = new Carro [2];
        
        garagem.carro[0] = new Carro();
        garagem.carro[0].marca = "Hyundai"
        garagem.carro[0].placa ="pcx1020"
        garagem.carro[0].ano = 2014;

        garagem.carro[1] = new Carro();
        garagem.carro[1].marca = "Ferrari";
        garagem.carro[1].placa = "pfk1530";
        garagem.carro[1].ano = 1994;

         Carro carro1 = new Carro;
         Carro carro2 = new carro;

         Garagem.carro1.marca = "Hyundai";
         Garagem.carro1.placa = "pcx1020";
         Garagem.carro1.ano = 2014;

         Garagem.carro2.marca = "Ferrari";
         Garagem.carro2.placa = "fwc1530";
         Garagem.carro2.ano = 1994;
    }
}