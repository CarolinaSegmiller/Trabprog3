public class JogoSistemaSolar {
    public static void main(String[] args) {
        // Criando personagens
        Personagem mercurio = new Personagem("Mercúrio");
        Personagem venus = new Personagem("Vênus");
        Personagem terra = new Personagem("Terra");
        Personagem marte = new Personagem("Marte");
        Personagem jupiter = new Personagem("Júpiter");
        Personagem saturno = new Personagem("Saturno");
        Personagem urano = new Personagem("Urano");
        Personagem netuno = new Personagem("Netuno");
        
        // Criando planetas
        Planeta mercurioPlaneta = new Planeta("Mercúrio");
        Planeta venusPlaneta = new Planeta("Vênus");
        Planeta terraPlaneta = new Planeta("Terra");
        Planeta martePlaneta = new Planeta("Marte");
        Planeta jupiterPlaneta = new Planeta("Júpiter");
        Planeta saturnoPlaneta = new Planeta("Saturno");
        Planeta uranoPlaneta = new Planeta("Urano");
        Planeta netunoPlaneta = new Planeta("Netuno");
        
        // Adicionando luas aos planetas
        terraPlaneta.addLua(new Lua("Lua"));
        jupiterPlaneta.addLua(new Lua("Io"));
        jupiterPlaneta.addLua(new Lua("Europa"));
        jupiterPlaneta.addLua(new Lua("Ganimedes"));
        jupiterPlaneta.addLua(new Lua("Calisto"));
        saturnoPlaneta.addLua(new Lua("Titã"));
        saturnoPlaneta.addLua(new Lua("Reia"));
        saturnoPlaneta.addLua(new Lua("Tétis"));
        saturnoPlaneta.addLua(new Lua("Dione"));
        saturnoPlaneta.addLua(new Lua("Encélado"));
        
        // Exibindo informações do jogo
        System.out.println("Bem-vindo ao Jogo Sistema Solar!");
        System.out.println("Personagens disponíveis: " + sol.getNome() + ", " + mercurio.getNome() + ", " + venus.getNome() + ", " + terra.getNome() + ", " + marte.getNome() + ", " + jupiter.getNome() + ", " + saturno.getNome() + ", " + urano.getNome() + ", " + netuno.getNome());
        System.out.println("Planetas disponíveis: " + mercurioPlaneta.getNome() + ", " + venusPlaneta.getNome() + ", " + terraPlaneta.getNome() + ", " + martePlaneta.getNome() + ", " + jupiterPlaneta.getNome() + ", " + saturnoPlaneta.getNome() + ", " + uranoPlaneta.getNome() + ", " + netunoPlaneta.getNome());
    }