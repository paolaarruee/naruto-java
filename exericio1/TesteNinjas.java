package exericio1;


public class TesteNinjas {
    public static void main(String[] args) {
        NinjaDeTaijutsu lee = new NinjaDeTaijutsu("Rock Lee", 17, "Konoha", 100);
        lee.adicionarJutsu("Lotus Primária");
        lee.aumentarChakra(50);
        lee.exibirInformacoes();
        lee.usarJutsu();
        lee.desviar();

        NinjaDeNinjutsu naruto = new NinjaDeNinjutsu("Naruto Uzumaki", 17, "Konoha", 200);
        naruto.adicionarJutsu("Rasengan");
        naruto.aumentarChakra(100);
        naruto.exibirInformacoes();
        naruto.usarJutsu();
        naruto.desviar();

        NinjaDeGenjutsu itachi = new NinjaDeGenjutsu(" Itachi Uchiha", 21, "Konoha", 150);
        itachi.adicionarJutsu("Tsukuyomi");
        itachi.aumentarChakra(70);
        itachi.exibirInformacoes();
        itachi.usarJutsu();
        itachi.desviar();
    }}