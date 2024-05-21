package exericio2;

public class NinjaDeNinjutsuExericio2 extends PersonagemExercicio2 implements NinjaExercicio2 {

    public NinjaDeNinjutsuExericio2(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarJutsu(PersonagemExercicio2 inimigo, String nomeJutsu) {
        Jutsu jutsu = getJutsu(nomeJutsu);
        if (jutsu != null && getChakra() >= jutsu.getConsumoDeChakra()) {
            System.out.println(getNome() + " está usando " + nomeJutsu + "!");
            diminuirChakra(jutsu.getConsumoDeChakra());
            inimigo.diminuirVida(jutsu.getDano());
        } else {
            System.out.println(getNome() + " não tem chakra suficiente para usar " + nomeJutsu + "!");
        }
    }

    @Override
    public void desviar() {
        System.out.println(getNome() + " está desviando de um ataque usando sua habilidade em Taijutsu!");
    }
}