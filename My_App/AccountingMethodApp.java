public class AccountingMethodApp {
 
    public static double valueofsupply;
    public static double vatrate;
    public static double vat;
    public static double expenserate;
    public static double expense;
    // main 바깥에 변수를 지정해줘야 getVAT메소드에 적용
    public static void main(String[] args) {
 
    	valueofsupply = 15000.0;
    	vatrate = 0.1;
        expenserate = 0.3;
        // 변수값은 local내에 생성가능
 
        print(); // print라는 method를 만들어 깔끔하게 정리
 
    }

	private static void print() {
		System.out.println("Value of supply : " + valueofsupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.6;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.1;
	}

	private static double getIncome() {
		return valueofsupply - expense;
	}

	private static double getExpense() {
		return valueofsupply * expenserate;
	}

	private static double getTotal() {
		return valueofsupply + vat;
	}

	private static double getVAT() {
		return valueofsupply * vatrate;
	}
 
}
