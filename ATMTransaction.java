/* 
Concepts: Parameterized methods, return values, object manipulation
Question:
Write a Java program simulating an ATM machine with the following methods:

boolean authenticate(int pin)

double deposit(double amount)

double withdraw(double amount)

void displayBalance()

The system should:

Verify the pin (hardcoded for simplicity)

Allow users to deposit and withdraw money

Show updated balance after each transaction
*/
import java.util.Scanner;
class  ATMTransaction{
	int pin;           //instance variable depended on object
	double amount;
	//double amount;
	double total_Amount;
}
