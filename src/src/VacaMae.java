public class VacaMae implements Animal {

    public String raca;
    public String nome;
    public int idade;

    public VacaMae(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("muuuuu");
    }

    public void exibirInfo() {
        System.out.println(this.nome);
        System.out.println("- Raça: " + this.raca);
        System.out.println("- Idade: " + this.idade);
        this.emitirSom();
    }

    @Override
    public void coletarProduto(){
        System.out.println(this.nome);
        System.out.println("Pegando ovos");
    }
}
