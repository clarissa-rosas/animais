package br.com.cursoemvideo.www.animal;

public class Peixes extends Vertebrados {

    //Atributos

    private String corEscamas;

    //Métodos acessores

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    //Métodos principais

    public Peixes(String nome, String peso, String idade, String membros, String ambiente, String habitat,
                  String locomocao, String ordem, String familia, String som) {
        super(nome, peso, idade, membros, ambiente, habitat, locomocao, ordem, familia, som);
        this.setCorEscamas(corEscamas);
    }

    public void soltaBolha() {
        System.out.println("O peixe " + this.getNome() + " solta bolhas.");
    }
}
