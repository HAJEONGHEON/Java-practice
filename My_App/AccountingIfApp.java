public class AccountingIfApp {
 
    public static void main(String[] args) {
 
        double valueofsupply = Double.parseDouble(args[0]);
        double vatrate = 0.1;
        double expenserate = 0.3;
        double vat = valueofsupply * vatrate;
        double total = valueofsupply + vat;
        double expense = valueofsupply * expenserate;
        double income = valueofsupply - expense;
        double dividend1;
        double dividend2;
        double dividend3; 
 
        if(income < 10000.0) {
        	dividend1 = income * 0.8;
        	dividend2 = income * 0.2;
        	dividend3 = income * 0;
        }
        else {
        	dividend1 = income * 0.6;
        	dividend2 = income * 0.3;
        	dividend3 = income * 0.1;
        }
        
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
