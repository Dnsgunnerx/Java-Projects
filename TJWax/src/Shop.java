import java.util.ArrayList;


public class Shop extends Company {
    ArrayList<String> employees = new ArrayList<>();
//-----------------------------------------------------------------------------------------------
    public static class ManagerMoneyCalc extends Shop {
        public int  ManagerSal(int salary) {return salary;}
        public int ManagerExpenses(int expenses) {return expenses;}
    }
//-----------------------------------------------------------------------------------------------
    public static class EmployeeCalc extends Shop {

        public int EmployeeSalary(int salary) {return salary;}
        public int TotalEmployees() { return employees.size();}
        public void AddEmployee(String employee) {
            final boolean b = employees.add(employee);
        }
        public int salaries() {
            int total = employees.size()*EmployeeSalary(30000);
            return total;
        }
    }

//-----------------------------------------------------------------------------------------------
    public static class ShopExpenses extends Shop{
        public int utilities(int utilities) {return utilities;}
    }

//-----------------------------------------------------------------------------------------------
    public int income(int balance){

        return balance;
    }

    public static void main(String[] args){
        Shop s = new Shop();
            ManagerMoneyCalc mmc = new ManagerMoneyCalc();
                EmployeeCalc ec = new EmployeeCalc();
                    ShopExpenses se = new ShopExpenses();



        //Employee salary
        System.out.println("employees make " + ec.EmployeeSalary(30000) + " a year");
        //Adding Employee
        ec.AddEmployee("Bob");
        ec.AddEmployee("Henry");
        ec.AddEmployee("Carter");
        //Total employees
        System.out.println("we have " + ec.TotalEmployees() + " employees");

            //Manager expenses
            System.out.println("the manager spends " + mmc.ManagerExpenses(3000) + " on shop expenses");
            //Manager salary
        System.out.println("the manager makes " + mmc.ManagerSal(50000) + " a year");

                //Shop monthly income
                System.out.println("the shop makes " + s.income(200000) + " a month");
                //Shop utility bill (1500)
                System.out.println("the utility bill is " + se.utilities(1500));
                //Shop salary total
                System.out.println("the shop spends " + ec.salaries() + " on paying their employees");

        //calculates total profit
        int profit = s.income(200000) - (mmc.ManagerSal(50000) + ec.salaries() + se.utilities(1500));
        System.out.println("The shop makes " + profit + " for TJWax");

    }


}


