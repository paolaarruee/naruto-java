package exericio1;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int idade;
    private String aldeia;
    private List<String> jutsus;
    private int chakra;


    public Personagem(String nome, int idade, String aldeia, List<String> jutsus, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.jutsus = new ArrayList<>(jutsus);
        this.chakra = chakra;
    }


    public Personagem(String nome, int idade, String aldeia, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.jutsus = new ArrayList<>();
        this.chakra = chakra;
    }


    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }

    public List<String> getJutsus() {
        return jutsus;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }


    public void adicionarJutsu(String jutsu) {
        jutsus.add(jutsu);
    }


    public void aumentarChakra(int quantidade) {
        this.chakra += quantidade;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Jutsus: " + jutsus);
        System.out.println("Chakra: " + chakra);
    }
}
