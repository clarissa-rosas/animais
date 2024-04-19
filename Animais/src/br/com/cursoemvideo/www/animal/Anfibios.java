package br.com.cursoemvideo.www.animal;

public class Anfibios extends Vertebrados {

    //Atributos

    private String corPele;

    //Métodos acessores

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    //Métodos principais

    public Anfibios(String nome, String peso, String idade, String membros, String ambiente, String habitat,
                    String locomocao, String ordem, String familia, String som) {
        super(nome, peso, idade, membros, ambiente, habitat, locomocao, ordem, familia, som);
        this.setCorPele(corPele);
    }
}