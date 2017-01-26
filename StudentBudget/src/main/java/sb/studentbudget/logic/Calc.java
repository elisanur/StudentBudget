
package sb.studentbudget.logic;

import sb.studentbudget.budget.Budget;


public class Calc {
    private Budget budget;

    public Calc(Budget budget) {
        this.budget = budget;
    }
    
    public double countIncome(){
        
        double income = 0;
        for (int i = 0; i < budget.getIncome().size(); i++) {
            income += budget.getIncome().get(i).getAmount();
        }
        
        return income;
    }
    
    public double countExpenses(){
        
        double expenses=0;
        
        for (int i = 0; i < budget.getExpense().size(); i++) {
            expenses += budget.getExpense().get(i).getAmount();
        }
        
        return expenses;
    }
    
    public double countBalance(){
        return countIncome()-countExpenses();
    }
    
    public double countWeeklyBudget(){
        return (countBalance()/4);
    }
    
    public double countDailyBudget(){
        return countBalance()/30;
    }
    

}
