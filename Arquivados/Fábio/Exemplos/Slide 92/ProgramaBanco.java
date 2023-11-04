import java.util.Scanner;

class ProgramaBanco{   

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
                
        System.out.println("Cadastre sua conta:");
        System.out.println();
        
        ContaCorrente Conta = new ContaCorrente();

        System.out.print("Número da conta:");
        Conta.numero = sc.next();

        Cliente primeiroTitular = new Cliente();

        System.out.print("Nome 1º Titular:");
        primeiroTitular.nome = sc.next();
        System.out.print("Ano 1º Titular:");
        primeiroTitular.anoNascimento = sc.next();
        System.out.print("CPF 1º Titular:");
        primeiroTitular.cpf = sc.next();

        Conta.primeiroTitular = primeiroTitular;
        
        Cliente segundoTitular = null;

        System.out.print("");
        System.out.print("Deseja adicionar um 2º Titular? (S/N)");

        char confirmaTitular2 = sc.next().charAt(0);
            if (confirmaTitular2 == 'S' || confirmaTitular2 == 's'){

                segundoTitular = new Cliente();

                System.out.print("Nome 2º Titular:");
                segundoTitular.nome = sc.next();
                System.out.print("Ano 2º Titular:");
                segundoTitular.anoNascimento = sc.next();
                System.out.print("CPF 2º Titular:");
                segundoTitular.cpf = sc.next();
                Conta.segundoTitular = segundoTitular;
                
            } else{
                System.out.println("Saldo da conta:");
                Conta.saldo = 2000;        
            }
        Conta.saldo = 2000;
        Conta.limiteTotal = 4000;
        System.out.print("");
        System.out.print("Deposito");
        Conta.creditar(sc.nextDouble());        
        System.out.print("Saque");
        Conta.debitar(sc.nextDouble()); 

        Conta.resumo();

        sc.close();

    }
}