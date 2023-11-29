import java.util.Scanner;

public class TesteTryCatch {
	
	// Atributos da classe java
	
	private int num1;
	private int num2;
	private int soma;
	
	public int somaNumeros() {
		try {
			Scanner input = new Scanner(System.in);
			num1 = input.nextInt();
			num2 = input.nextInt();
			soma = this.num1 + this.num2;
			return soma;
		}catch(Exception e){
			
			System.out.println("Dados inseros incorreto, permitido somente números!");
			return somaNumeros();
		}
	}
	
	public void mostraNumeros() {
		System.out.print("""
				O número 1 é: %s
				O número 2 é: %s 
				""".formatted(this.num1,this.num2));
	}
	
	public int getNum1() {
		return this.num1;
	}
	public void setNum1(int novoNum1) {
		this.num1 = novoNum1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	public void setNum2(int novoNum2) {
		this.num2 = novoNum2;
	}
	
	public static void main(String[] args) {
		
		TesteTryCatch teste = new TesteTryCatch();
		
		teste.somaNumeros();
	}
	
}
