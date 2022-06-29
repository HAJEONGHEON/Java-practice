
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		double valueofsupply = Double.parseDouble(args[0]);
        double vatrate = 0.1;
        double expenserate = 0.3;
        double vat = valueofsupply * vatrate;
        double total = valueofsupply + vat;
        double expense = valueofsupply * expenserate;
        double income = valueofsupply - expense;
 
        
        System.out.println("Value of supply : " + valueofsupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        
        
        double[] dividendrates = new double[3]; // dividendrates 3개 배열
        dividendrates[0] = 0.6;
        dividendrates[1] = 0.3;
        dividendrates[2] = 0.1;
        
        
        int i =0;
        while (i < dividendrates.length) {
        	
        	System.out.println("Dividend : " + (income * dividendrates[i]));
        	i = i + 1;
        // i = 0 부터 dividendrates배열의 길이만큼까지 출력 반복
        }

    }

}
