public class Principal {
    public static void main(String[] args) {
        Papagaio p = new Papagaio();
        Aguia a = new Aguia();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        
        a.setNome("Gritadeira");
        System.out.println(a.voar());
        System.out.println(a.nadar());

        p.setNome("Loro");
        System.out.println(p.voar());
        System.out.println(p.nadar());

        c.setRaca("rottweiler");
        c.setTamanho("Grande");
        System.out.println(c.emitirSom());
        System.out.println(c.amamentar());

        g.setRaca("Siamês");
        System.out.println(g.emitirSom());
        System.out.println(g.amamentar());
    }
}
