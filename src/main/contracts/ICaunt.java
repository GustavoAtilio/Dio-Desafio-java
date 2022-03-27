package main.contracts;

import man.models.Caunt;

public interface ICaunt {
	void withdraw(double valeu);
	void transfer(double valeu, Caunt caunt);
	void deposit(double valeu);
}
