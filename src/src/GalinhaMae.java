public class GalinhaMae implements Animal{

    public String raca;
    public String nome;
    public int idade;

    @Override
    public void coletarProduto(){
        System.out.println(this.nome);
        System.out.println("Pegando ovos");
    }

    public void emitirSom(){
        System.out.println("popó");
    }

    public void exibirInfo(){
        System.out.println(this.nome);
        System.out.println("- Raça: " + this.raca);
        System.out.println("- Idade: " + this.idade);
        this.emitirSom();
    };

    public GalinhaMae(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }
}

