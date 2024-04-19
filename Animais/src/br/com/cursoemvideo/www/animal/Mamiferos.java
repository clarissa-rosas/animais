package br.com.cursoemvideo.www.animal;

public class Mamiferos extends Vertebrados {

    //Atributos

    private String corPelo;

    //Métodos acessores

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Métodos principais

    public Mamiferos(String nome, String peso, String idade, String membros, String ambiente, String habitat,
                     String locomocao, String ordem, String familia, String som) {
        super(nome, peso, idade, membros, ambiente, habitat, locomocao, ordem, familia, som);
    this.setCorPelo(corPelo);
    }
}

