public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double taxaPorHora;

    public FuncionarioHorista(String nome, int idade, int id, double salarioBase, double horasTrabalhadas, double taxaPorHora) {
        super(nome, idade, id, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * taxaPorHora;
    }
}
