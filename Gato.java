public class Gato extends Mamifero{

    private String raca;
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom(){
        return "Emite o som Miar";
    }

    @Override
    public String amamentar(){
        return "Amamenta com Leite";
    }
}
