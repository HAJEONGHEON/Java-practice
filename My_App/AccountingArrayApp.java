
public class AccountingArrayApp {

	public static void main(String[] args) {
		double valueofsupply = Double.parseDouble(args[0]);
        double vatrate = 0.1;
        double expenserate = 0.3;
        double vat = valueofsupply * vatrate;
        double total = valueofsupply + vat;
        double expense = valueofsupply * expenserate;
        double income = valueofsupply - expense;
 
        double[] dividendrates = new double[3];
        dividendrates[0] = 0.6;
        dividendrates[1] = 0.3;
        dividendrates[2] = 0.1;
        
        double dividend1 = income * dividendrates[0];
        double dividend2 = income * dividendrates[1];
        double dividend3 = income * dividendrates[2];
        
        
        
        System.out.println("Value of supply : " + valueofsupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
 
    }

}
