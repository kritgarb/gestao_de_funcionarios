public class FuncionarioMensalista extends Funcionario {
    private double bonus;

    public FuncionarioMensalista(String nome, int idade, int id, double salarioBase, double bonus) {
        super(nome, idade, id, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + bonus;
    }
}
