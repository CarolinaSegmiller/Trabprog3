import java.util.ArrayList;

// Classe representando um personagem do sistema solar
class Personagem {
    private String nome;
    
    public Personagem(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

// Classe representando uma fase do sistema solar
class Satelite {
    private String nome;
    
    public Satelite(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

// Classe representando um mundo do sistema solar
class Planeta {
    private String nome;
    private ArrayList<Satelite> satelites;
    
    public Planeta(String nome) {
        this.nome = nome;
        satelites = new ArrayList<>();
    }
    
    public void addSatelite(Satelite satelite) {
        satelites.add(satelite);
    }
    
    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }
}
    
    public ArrayList<Fase> getFases() {
        return fases;
    }
}