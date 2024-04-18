import java.util.ArrayList; oi

import dominio.Fase;

// Classe representando um personagem
class Personagem {
    private String nome;
    
    public Personagem(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

// Classe representando uma fase
class Fase {
    private String nome;
    
    public Fase(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

// Classe representando um mundo
class Mundo {
    private String nome;
    private ArrayList<Fase> fases;
    
    public Mundo(String nome) {
        this.nome = nome;
        fases = new ArrayList<>();
    }
    
    public void addFase(Fase fase) {
        fases.add(fase);
    }
    
    public ArrayList<Fase> getFases() {
        return fases;
    }
}