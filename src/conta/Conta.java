package conta;

import java.util.Scanner;

public class Conta {
	public int numConta;
	protected	String tipo;
	private String dono= "Usuário";
	private double saldo = 0;
	private boolean status = false;
	boolean terminal=false;
	

	
	public void menu(boolean terminal){	
		
		while (terminal == true) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("");
			System.out.println(getDono()+ ", digite a operação a ser realizada:");
			System.out.println("1- Abrir conta, 2- Fechar Conta, 3- Saque, 4- Deposito, 5- Saldo, 6- Encerrar operação ");
			int operacao = entrada.nextInt();
			switch (operacao) {
				case 1:
					this.abrirConta();
					break;
				case 2:
					this.fecharConta();
					break;
				case 3:
					this.sacar();
					break;
				case 4:
					this.depositar();
					break;
				case 5:
					this.consultarSaldo();
					break;
				case 6:
					terminal=false;
					break;
				}
		}
		
		
		
	}
	
	public void iniciarMenu() {
		this.terminal = true;
		this.menu(terminal);
	}
		
	public void setnumConta(int nConta){
		this.numConta = nConta;
	}
	
	public int getnumConta(){
		return numConta;
	}
		
	public void setTipo(){
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o tipo de conta:");
		 System.out.println("1 - Conta corrente, 2 - Conta poupança ");
		 int tipoConta = entrada.nextInt();
		 if (tipoConta==1){
			tipo = "cc";
			System.out.println("Conta Corrente criada com sucesso!");
		 } else if (tipoConta ==2){
			tipo = "cp";
			System.out.println("Conta Poupança criada com sucesso!");
		 } else {
			System.out.println("Tipo inválido. Digite 1 para conta corrente ou 2 para conta poupança");
		 }	
	}
	
	public String getTipo(){

		if (tipo=="cc") {
			return "Conta corrente";
		}else {
			return "Conta poupança";
		}
	}
	
	public void setDono(String donoConta){
		this.dono=donoConta;
	}
	
	public String getDono(){
		return dono;
	}
		
	public void setSaldo(double saldoConta){
		this.saldo=saldoConta;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setStatus(boolean statusConta){
		this.status=statusConta;
	}
	
	public boolean getStatus(){
		return status;
	}
		
	public void abrirConta() {		
		this.setStatus(true);
		Scanner entradaDono = new Scanner(System.in);
		System.out.println("Digite o nome do usuário: ");
		String donoConta = entradaDono.nextLine();
		this.setDono(donoConta);
		this.setTipo();
		if(this.getTipo() == "Conta corrente") {
			this.setSaldo(50);			
		} else {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.getStatus()==true) {
			if (this.getSaldo()==0) {
				this.setStatus(false);
			} else {
				System.out.println("Operação inválida, o saldo tem que ser igual a zero.");}
		}else {
			System.out.println("Sua conta ainda está fechada ");	
		}		
	}
		
	public void depositar() {	
		 
		if (this.getStatus()==true) {
			 Scanner entrada = new Scanner(System.in);
			 System.out.print("Digite o valor depositado: ");			 
			 double deposito = entrada.nextDouble();	
			 double novoSaldo= deposito + getSaldo();
			 this.setSaldo(novoSaldo);
		} else {
			 System.out.print("Sua conta ainda está fechada ");		
		}
	}
	
	public void sacar() {	
		if (this.getStatus()==true) {
			 Scanner entrada = new Scanner(System.in);
			 System.out.print("Digite o valor: ");			 
			 double saque = entrada.nextDouble();
			 double valorTotal=getSaldo();
			 if (saque<=valorTotal){
				 double novoSaldo= getSaldo()-saque;
				 this.setSaldo(novoSaldo);
			 } else {
				 System.out.println("Saldo insuficiente ");	
			 }
			
		} else {
			 System.out.println("Sua conta ainda está fechada ");		
		}
	}
	
	public void pagarMensalidade() {
		int mensalidade;
		double saldoFinal = getSaldo();
		if (this.getStatus() == true) {
			if (this.getTipo() == "Conta Corrente") {
				mensalidade = 12; 
			} else {
				mensalidade = 10; 
			}
			
			if (saldoFinal<=mensalidade) {
				this.setSaldo(saldoFinal-mensalidade);
			} else {
				System.out.print("Saldo insufience para a manutenção da conta");		
			}
		} else {
			 System.out.print("Sua conta ainda está fechada ");		
		}
	}
	
	public void consultarSaldo() {
		if (this.getStatus()==true) {
			System.out.println("O saldo da conta é R$: " + getSaldo());
		} else {
			System.out.println("Sua conta ainda está fechada");
		}
	}
}
