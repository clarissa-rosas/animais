package br.com.cursoemvideo.www.animal;

public class Aves extends Vertebrados {

    //Atributos

    private String corPenas;

    //Métodos acessores

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    //Métodos principais

    public Aves(String nome, String peso, String idade, String membros, String ambiente, String habitat,
                String locomocao, String ordem, String familia, String som) {
        super(nome, peso, idade, membros, ambiente, habitat, locomocao, ordem, familia, som);
        this.setCorPenas(corPenas);
    }

    public void fazNinho() {
        System.out.println("A ave " + this.getNome() + " pode fazer ninhos.");
    }
}
