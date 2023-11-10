package diodesafiodeprojeto;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
            
            Scanner ler = new Scanner(System.in);
            Scanner ler2 = new Scanner(System.in);
            System.out.printf("Bem vindo ao seu banco!\n digite seu nome:");
            String resposta1 = ler.nextLine();
            Cliente c1 = new Cliente();
            c1.setNome(resposta1);
            Conta cc = new ContaCorrente(c1);
            Conta cp = new ContaPoupanca(c1);
            int opcao = 0;
            
            while(opcao != 3){
            
                System.out.println("1) conta corrente\n2) conta poupanca\n3) sair");
                opcao = ler.nextInt();
            
                if(opcao == 1){
                    
                    do{
                        System.out.println("MENU CONTA CORRENTE\n1) Saques\n2) Depositos \n3) Extrato\n4) Sair");
                        opcao = ler.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.printf("Digite o valor:");
                                int respostaCase1 = 0;
                                respostaCase1 = ler.nextInt();
                                cc.sacar(respostaCase1);
                                break;

                            case 2:
                                System.out.println("Digite o valor do deposito");
                                double respostaCase2 = 0;
                                respostaCase2 = ler.nextDouble();
                                cc.depositar(respostaCase2);
                                break;

                            case 3:
                                cc.imprimirExtrato();
                                break;

                            case 4:
                                System.out.println("Origado por utilizar!");
                                break;
                                
                            default:
                                System.out.println("Digite uma opcao valida");
                                break;
                                
                        }
                    }while(opcao != 4);
                }else if(opcao == 2){
                    do{
                        System.out.println("MENU CONTA POUPANCA\n1) Saques\n2) Depositos \n3) Extrato\n4) Sair");
                        opcao = ler.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.printf("Digite o valor:");
                                int respostaCase1 = 0;
                                respostaCase1 = ler.nextInt();
                                cp.sacar(respostaCase1);
                                break;

                            case 2:
                                System.out.println("Digite o valor do deposito");
                                double respostaCase2 = 0;
                                respostaCase2 = ler.nextDouble();
                                cp.depositar(respostaCase2);
                                break;

                            case 3:
                                cp.imprimirExtrato();
                                break;

                            case 4:
                                System.out.println("Origado por utilizar!");
                                break;
                                
                            default:
                                System.out.println("Digite uma opcao valida");
                                break;
                        }
                    }while(opcao !=4);
                }else if(opcao == 3){
                    System.out.println("Encerrado");
                    cc.imprimirExtrato();
                    cp.imprimirExtrato();
                }else{
                    System.out.println("Digite uma opcao valida");
                }
            }
	}

}
