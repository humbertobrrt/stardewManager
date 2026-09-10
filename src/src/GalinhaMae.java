public class GalinhaMae implements Animal{

    public String raca;
    public String nome;
    public int idade;

    public void coletarProduto(){
        System.out.println("Pegando ovos");
    }

    public String emitirSom(){
        return "popó";
    }

    public void exibirInfo(){
        System.out.println(this.nome);
        System.out.println("- Raça: " + this.raca);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- Som: " + this.emitirSom());

    };

    public GalinhaMae(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }
}

