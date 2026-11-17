package funcionarios;

public class Funcionarios{
    private String nome;
    private String matricula;
    private String cargo;
    private double salario;


    //Construtor1
    public Funcionarios(String nome, String matricula, String cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = 0;
    }

    //Construtor2
    public Funcionarios(String nome, String matricula, String cargo, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }
    // Exibir os dados do funcionário
    public void mostrarDados(){
        IO.println("Nome: " + nome);
        IO.println("Matrícula: " + matricula);
        IO.println("Cargo: " + cargo);
        IO.println("Salário...: R$" + salario);
        IO.println("--------------------------------------------------");

    }
    public void aumentarSalario(double percentual){
        salario += salario * (percentual / 100);
        IO.println("Aumento salarial de " + percentual + "% aplicado ao funcionário " + nome);
    }
    public void aumentarSalario(double valor, String motivo){
        salario += valor;
        IO.println("Aumento salarial de R$" + valor + " por " + motivo + " aplicado ao funcionário " + nome);

    }

}