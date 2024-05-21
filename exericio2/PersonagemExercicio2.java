package exericio2;

import java.util.HashMap;
import java.util.Map;

public abstract class PersonagemExercicio2 {
    private String nome;
    private Map<String, Jutsu> jutsus;
    private int chakra;
    private int vida;

    public PersonagemExercicio2(String nome, int vida) {
        this.nome = nome;
        this.jutsus = new HashMap<>();
        this.chakra = 100;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }

    public int getVida() {
        return vida;
    }

    public void adicionarJutsu(String nome, Jutsu jutsu) {
        jutsus.put(nome, jutsu);
    }

    public void diminuirChakra(int quantidade) {
        this.chakra -= quantidade;
    }

    public void diminuirVida(int quantidade) {
        this.vida -= quantidade;
    }

    public Jutsu getJutsu(String nome) {
        return jutsus.get(nome);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Chakra: " + chakra);
        System.out.println("Vida: " + vida);
        System.out.println("Jutsus: " + jutsus.keySet());
    }
}


