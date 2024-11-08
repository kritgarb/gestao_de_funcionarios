public abstract class Funcionario {
    protected String nome;
    protected int idade;
    protected int id;
    protected double salarioBase;

    public Funcionario(String nome, int idade, int id, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamento();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("ID: " + id);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Pagamento Total: R$ " + calcularPagamento());
    }
}
