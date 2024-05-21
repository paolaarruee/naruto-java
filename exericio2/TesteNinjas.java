package exericio2;

public class TesteNinjas {
    public static void main(String[] args) {
        System.out.println(" ----------- Balha ninja --------- ");

        NinjaDeTaijutsuExercicio2 leebattle = new NinjaDeTaijutsuExercicio2("Rock Lee", 100);
        leebattle.adicionarJutsu("Lotus Primária", new Jutsu(30, 10));
        leebattle.exibirInformacoes();

        NinjaDeNinjutsuExericio2 narutobattle = new NinjaDeNinjutsuExericio2("Naruto Uzumaki", 100);
        narutobattle.adicionarJutsu("Rasengan", new Jutsu(40, 20));
        narutobattle.exibirInformacoes();

        System.out.println("\n--- Batalha ---");
        leebattle.usarJutsu(narutobattle, "Lotus Primária");
        narutobattle.exibirInformacoes();

        narutobattle.usarJutsu(leebattle, "Rasengan");
        leebattle.exibirInformacoes();

        narutobattle.desviar();
        leebattle.desviar();
    }

}
