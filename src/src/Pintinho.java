public class Pintinho extends GalinhaMae {

    public Pintinho(String raca, String nome, int idade) {
        super(raca, nome, idade);
    }

    @Override
    public void coletarProduto() {

        System.out.println("O pintinho ainda não produz ovos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }

}
