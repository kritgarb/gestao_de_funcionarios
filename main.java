public class main {
    public static void main(String[] args) {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Benjamin", 21, 1, 2000.0, 160, 20.0);
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("João", 30, 2, 3000.0, 500.0);
        System.out.println("Funcionário Horista:");
        funcionarioHorista.exibirDados();

        System.out.println("\nFuncionário Mensalista:");
        funcionarioMensalista.exibirDados();
    }
}
