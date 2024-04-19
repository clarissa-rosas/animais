package br.com.cursoemvideo.www.animal;

public abstract class Vertebrados {

    //Atributos

    private String nome;
    private String peso;
    private String idade;
    private String membros;
    private String ambiente;
    private String habitat;
    private String locomocao;
    private String ordem;
    private String familia;
    private String som;

    //Métodos acessores

    public String getNome() {
        return nome;
    }

    public String getPeso() {
        return peso;
    }

    public String getIdade() {
        return idade;
    }

    public String getMembros() {
        return membros;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public String getOrdem() {
        return ordem;
    }

    public String getSom() {
        return som;
    }

    public String getFamilia() {
        return familia;
    }

    //Métodos principais


    public Vertebrados(String nome, String peso, String idade, String membros, String ambiente, String habitat,
                       String locomocao, String ordem, String familia, String som) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
        this.ambiente = ambiente;
        this.habitat = habitat;
        this.locomocao = locomocao;
        this.ordem = ordem;
        this.familia = familia;
        this.som = som;
    }

    public void locomoverSe() {
        System.out.println("O " + getClass().getSimpleName().toLowerCase() + getNome() + " locomove-se " + getLocomocao() + ".");
    }

    public void alimentarSe() {
        System.out.println("O " + getClass().getSimpleName().toLowerCase() + getNome() + " é um animal " + getOrdem() + ".");
    }

    public void emitirSom() {
        System.out.println("O " + getClass().getSimpleName().toLowerCase() + getNome() + getSom() + ".");
    }

    public void viverEm() {
        System.out.println("O " +getClass().getSimpleName().toLowerCase() + getNome() + " é um animal " + getAmbiente() + ".");
    }

    public void habitar() {
        System.out.println("O " + getClass().getSimpleName().toLowerCase() + getNome() + " habita o(a) " + ".");
    }

    public void mostrarFicha() {
        System.out.println("===============================================================" +
                "\nFICHA TÉCNICA DO ANIMAL: " +
                "\nNome = " + this.getNome() +
                "\nClasse = " + getClass().getSimpleName().toLowerCase() +
                "\nOrdem = " + this.getOrdem() +
                "\nFamília = " + this.getFamilia() +
                "\nAmbiente = " + this.getAmbiente() +
                "\nHabitat = " + this.getHabitat() +
                "\nLocomoção = " + this.getLocomocao() +
                "\nPeso médio = " + this.getPeso() +
                "\nExpectativa de vida = " + this.getIdade() + " anos " +
                "\nN.º de membros = " + this.getMembros() +
                "\nSom = " + this.getSom());
    }

    public void mostrarApresentacao() {
        System.out.println("===============================================================" +
                "\nAPRESENTAÇÃO DO ANIMAL: " +
                "\nO vertebrado '" + this.getNome() + "' é um animal " + this.getAmbiente() + ", " +
                "\nda classe dos(as) " + getClass().getSimpleName().toLowerCase() + ", da ordem " + this.getOrdem() +
                "\ne da família dos " + this.getFamilia() + "." +
                "\nTem " + this.getMembros() + ", " + this.getLocomocao() + "," +
                "\npesa em média " + this.getPeso() + " e vive em média " + this.getIdade() + " anos." +
                "\nO(A) " + this.getNome() + " " + this.getSom() + ".");
    }
}
