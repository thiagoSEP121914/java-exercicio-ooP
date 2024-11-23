import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionarios> listaDeFuncionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios será cadastrado?: ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Empregado #" + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Funcionarios funcionario = new Funcionarios(id, name, salary);
            listaDeFuncionarios.add(funcionario);

        }

        System.out.print("Entre com Id do funcionario que terá o asalario aumenmtado: ");
        int id = sc.nextInt();
        int resultado = existeId(listaDeFuncionarios, id);

        if (resultado != -1) {
            System.out.print("Entre com a porcentagem de aumento: ");
            double percentagem = sc.nextDouble();
            listaDeFuncionarios.get(resultado).increaseSalary(percentagem);
        } else {
            System.out.println("ID nao encontrado.");
        }


        System.out.println("Lista de Funcionario: ");

        for (Funcionarios pessoa: listaDeFuncionarios) {
            System.out.println(" "+pessoa);
        }
    }

    public static int existeId(ArrayList<Funcionarios> listaDeFuncionario, int id) {

        for (int i = 0; i <listaDeFuncionario.size(); i++){

            if (listaDeFuncionario.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }

}