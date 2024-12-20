import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){

		Account account1 = new Account("Joseph", 50.00);
		Account account2 = new Account("Chris", 500.00);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), 					
		account1.getBalance());

		System.out.printf("%s balance: $%.2f%n%n",account2.getName(), 					
		account2.getBalance());

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter deposit ammount for account1: ");
		double depositAmount = scanner.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), 					
		account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), 					
		account2.getBalance());

		System.out.print("Enter deposit ammount for account2:");
		depositAmount = scanner.nextDouble();
		System.out.printf("%nadding $%.2f%n to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount);
		System.out.printf("%s balance: $%.2f%n", account1.getName(), 					
		account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), 					
		account2.getBalance());

		System.out.print("Withdraw money:");
		double withdraw = scanner.nextDouble();
		System.out.printf("%s withdraw: $%.2f%n");
		account1.withdraw(withdraw);
		System.out.printf("%s withdraw: $%.2f%n",  account1.getName(), account1.getBalance());
		System.out.printf("%s withdraw: $%.2f%n%n", account2.getName(), account2.getBalance());
	}
}