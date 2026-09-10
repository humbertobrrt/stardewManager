public class Bezerro extends VacaMae {

    public Bezerro(String raca, String nome, int idade) {
        super(raca, nome, idade);
    }

    @Override
    public void coletarProduto() {
        System.out.println(this.nome);
        System.out.println("O bezerro ainda não produz leite.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

}

