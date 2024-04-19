package br.com.cursoemvideo.www.animal;

public class Animais {
    public static void main(String[] args) {

        Mamiferos m[] = new Mamiferos[3];
        m[0] = new Mamiferos("gato doméstico", "4-5 kg", "12-18", "4 patas", "terrestre", "doméstico",
                "anda e corre", "carnívora", "felídeos", "mia, rosna e ronrona");
        m[1] = new Mamiferos("foca", "80-100 kg", "30-35", "4 nadadeiras", "aquático", "oceano",
                "nada e arrasta-se", "carnívora", "focídeos", "late, rosna e guincha");
        m[2] = new Mamiferos("ornitorrinco", "0,5-2,0 kg", "17-20", "4 nadadeiras", "semiaquático", "rios, córregos, lago e lagoas",
                "nada e anda", "carnívora", "ornitorrinquídeos", "grunhe, sussurra e assobia");

        for (Mamiferos mamiferos : m) {
            mamiferos.mostrarFicha();
            mamiferos.mostrarApresentacao();
        }

        Aves ave[] = new Aves[3];
        ave[0] = new Aves("garça-branca-grande", "1,8-2,5 kg", "15", "2 pernas e 2 asas", "aquático",
                "lagos, rios, pântanos, costas", "voa, nada e anda", "carnívora", "ardeídeos", "grunhe, crocita e grasna");
        ave[1] = new Aves("sabiá-laranjeira", "68-110 g", "10", "2 pernas e 2 asas", "aéreo e terrestre",
                "florestas e áreas verdes urbanas", "voa e anda", "onívoro", "turdídeos", "canta");
        ave[2] = new Aves("pinguim-imperador", "22-45 kg", "15-20", "2 asas-nadadeiras e 2 pernas", "aquático",
                "plataformas de gelo da Antártida", "nada, anda e desliza", "carnívora", "Spheniscidae", "vocaliza chamados altos e distintivos");

        for (Aves aves : ave) {
            aves.mostrarFicha();
            aves.mostrarApresentacao();
        }

//        Repteis r[] = new Repteis[3];
//        r[0] = new Repteis("camaleão",);
//        r[1] = new Repteis("sucuri",);
//        r[2] = new Repteis("jacaré",);
//
//        for (Repteis repteis : r) {
//            repteis.mostrarFicha();
//            repteis.mostrarApresentacao();
//        }
//
//        Anfibios anf[] = new Anfibios[3];
//        anf[0] = new Anfibios("sapo-cururu", );
//        anf[1] = new Anfibios("salamandra-de-fogo",);
//        anf[2] = new Anfibios("axolote",);
//
//        for (Anfibios anfibios : anf) {
//            anfibios.mostrarFicha();
//            anfibios.mostrarApresentacao();
//        }
//
//        Peixes p[] = new Peixes[3];
//        p[0] = new Peixes("tubarão-branco",);
//        p[1] = new Peixes("cavalo-marinho",);
//        p[2] = new Peixes("salmão",);
//
//        for (Peixes peixes : p) {
//            peixes.mostrarFicha();
//            peixes.mostrarApresentacao();
//        }
    }
}