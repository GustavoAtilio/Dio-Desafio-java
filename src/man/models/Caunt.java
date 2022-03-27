package man.models;

import main.contracts.ICaunt;

public class Caunt implements ICaunt {
		private int numCaunt;
		private double balance;
		private static int NumCauntAdd = 1;
		public static enum caunt  {
		    CAUNT_CHAIN, CAUNT_SANVINGS;
		}
		public caunt typeCaunt;
		
		public Caunt(caunt type){
			this.numCaunt = this.NumCauntAdd + 1;
			this.typeCaunt = type;
		}
		@Override
		public void withdraw(double valeu) {
			this.balance -= valeu;
			
		}
		@Override
		public void transfer(double valeu, Caunt caunt) {
			this.withdraw(valeu);
			caunt.deposit(valeu);
			
		}
		@Override
		public void deposit(double valeu) {
			this.balance += valeu;
			
		}
		
		@Override
		public String toString() {
			return "Caunt [numCaunt=" + numCaunt + ", balance=" + balance + ", typeCaunt=" + typeCaunt + "]";
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
}
