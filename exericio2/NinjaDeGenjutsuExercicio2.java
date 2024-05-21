package exericio2;

import exericio1.Ninja;
import exericio1.Personagem;

class NinjaDeGenjutsuExercicio2 extends Personagem implements Ninja {

    public NinjaDeGenjutsuExercicio2(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public void usarJutsu() {
        System.out.println(super.getNome() + " está usando um golpe de Genjutsu!");
    }

    @Override
    public void desviar() {
        System.out.println(super.getNome() + " está desviando de um ataque usando sua habilidade em Genjutsu!");
    }
}
