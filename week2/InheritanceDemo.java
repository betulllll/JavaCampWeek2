package week2;

public class InheritanceDemo {

	public static void main(String[] args) {

		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(new TeacherCreditManager());

	}

}
