public class VacaMae {

    public String raca;
    public String nome;
    public int idade;

    public String emitirSom(){
        return "muuuuu";
    }

    public void exibirInfo(){
        System.out.println(this.nome);
        System.out.println("- Raça: " + this.raca);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- Som: " + this.emitirSom());

    };

    public VacaMae(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public void coletarProduto(){
        System.out.println("Retirando leite");
    }


}
