package OOP;

public class LoanAccount implements IRate {

		@Override
		public void setRate() {
			System.out.println("Set Rate...");
		}
		
		@Override
		public void increaseRate() {
			System.out.println("Increase Rate...");
		}
		
		public void setTerm(int term) {
			System.out.println("Set Term to: " + term + " years." );
		}
		
		public void setAmmortSchedule() {
			System.out.println("Ammortization Schedule...");
		}
}
