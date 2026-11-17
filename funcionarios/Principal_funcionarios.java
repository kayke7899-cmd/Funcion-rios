package funcionarios;

import java.util.Scanner;
public class Principal_funcionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cadastro do funcionário 1 (com salário inicial)
        IO.println("=== Cadastro do Funcionário (com salário inicial) ===");

        IO.print("Nome:");
        String nome1 = sc.nextLine();
        IO.print("Matrícula:");
        String matricula1 = sc.nextLine();
        IO.print("Cargo:");
        String cargo1 = sc.nextLine();
        IO.print("Salário:");
        double salario1 = sc.nextDouble();
        sc.nextLine(); // consome o "\n" deixado pelo nextDouble()
        Funcionarios f1 = new Funcionarios(nome1, matricula1, cargo1, salario1);
        f1.mostrarDados();


        //Cadastro do funcionário 2 (com salário inicial)
        IO.println("=== Cadastro do Funcionário 2 (com salário inicial) ===");
        IO.print("Nome:");
        String nome2 = sc.nextLine();
        IO.print("Matrícula:");
        String matricula2 = sc.nextLine();
        IO.print("Cargo:");
        String cargo2 = sc.nextLine();
        IO.print("Salário:");
        double salario2 = sc.nextDouble();
        Funcionarios f2 = new Funcionarios(nome2, matricula2, cargo2, salario2);
        f2.mostrarDados();
        sc.nextLine();

        //Cadastro do funcionário 3 (com salário inicial)
        IO.println("=== Cadastro do Funcionário 3 (com salário inicial) ===");
        IO.print("Nome:");
        String nome3 = sc.nextLine();
        IO.print("Matrícula:");
        String matricula3 = sc.nextLine();
        IO.print("Cargo:");
        String cargo3 = sc.nextLine();
        IO.print("Salário:");
        double salario3 = sc.nextDouble();
        Funcionarios f3 = new Funcionarios(nome3, matricula3, cargo3, salario3);
        f3.mostrarDados();
        sc.nextLine();

        //Aumento salarial do funcionário 1 (percentual)
        IO.println("=== Aumento salarial do funcionário 1 ===");
        IO.print("Digite o percentual de aumento:");
        double percentual = sc.nextDouble();
        sc.nextLine();
        f1.aumentarSalario(percentual);
        f1.mostrarDados();

        //Aumento salarial do funcionário 2 (valor e motivo)
        IO.println("=== Aumento salarial do funcionário 2 ===");
        IO.print("Digite o valor do aumento:");
        double porcentual = sc.nextDouble();
        sc.nextLine();
        IO.print("Digite o motivo do aumento:");
        String motivo2 = sc.nextLine();
        f2.aumentarSalario(porcentual, motivo2);
        f2.mostrarDados();

        //Aumento salarial do funcionário 3 (valor e motivo)
        IO.println("=== Aumento salarial do funcionário 3 ===");
        IO.print("Digite o valor do aumento:");
        double percentual = sc.nextDouble();
        sc.nextLine();
        IO.print("Digite o motivo do aumento:");
        String motivo3 = sc.nextLine();
        f3.aumentarSalario(percentual, motivo3);
        f3.mostrarDados();
        sc.close();
    }

}