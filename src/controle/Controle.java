public class JogoSonicRPG {
    public static void main(String[] args) {
        // Criando personagens
        Personagem sonic = new Personagem("Sonic");
        Personagem tails = new Personagem("Tails");
        Personagem knuckles = new Personagem("Knuckles");
        Personagem amy = new Personagem("Amy");
        
        // Criando mundos
        Mundo greenHillZone = new Mundo("Green Hill Zone");
        Mundo chemicalPlantZone = new Mundo("Chemical Plant Zone");
        Mundo stardustSpeedway = new Mundo("Stardust Speedway");
        Mundo lavaReefZone = new Mundo("Lava Reef Zone");
        Mundo finalZone = new Mundo("Final Zone");
        
        // Adicionando fases aos mundos
        greenHillZone.addFase(new Fase("Act 1"));
        greenHillZone.addFase(new Fase("Act 2"));
        greenHillZone.addFase(new Fase("Boss"));
        
        chemicalPlantZone.addFase(new Fase("Act 1"));
        chemicalPlantZone.addFase(new Fase("Act 2"));
        chemicalPlantZone.addFase(new Fase("Boss"));
        
        stardustSpeedway.addFase(new Fase("Act 1"));
        stardustSpeedway.addFase(new Fase("Act 2"));
        stardustSpeedway.addFase(new Fase("Boss"));
        
        lavaReefZone.addFase(new Fase("Act 1"));
        lavaReefZone.addFase(new Fase("Act 2"));
        lavaReefZone.addFase(new Fase("Boss"));
        
        finalZone.addFase(new Fase("Act 1"));
        finalZone.addFase(new Fase("Act 2"));
        finalZone.addFase(new Fase("Boss"));
        
        // Exibindo informações do jogo
        System.out.println("Bem-vindo ao Jogo Sonic RPG!");
        System.out.println("Personagens disponíveis: " + sonic.getNome() + ", " + tails.getNome() + ", " + knuckles.getNome() + ", " + amy.getNome());
        System.out.println("Mundos disponíveis: " + greenHillZone.getNome() + ", " + chemicalPlantZone.getNome() + ", " + stardustSpeedway.getNome() + ", " + lavaReefZone.getNome() + ", " + finalZone.getNome());
    }
}