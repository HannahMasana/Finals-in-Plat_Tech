import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Annual Salary: ");
        double salary = input.nextDouble();

        double mrate = salary/12;
        System.out.printf("Your Monthly Rate: %.2f \n", mrate);
        
        double drate = mrate/22;
        System.out.printf("Your Daily Rate: %.2f \n", drate);
        
        double hrate = drate/8;
        System.out.printf("Your Hourly Rate: %.2f \n", hrate);

        double tax_excess = 0;
        double atd = 0;
        if (salary <= 250000){
            tax_excess = salary - 0;
            atd = (0 * tax_excess);

        }else if(salary >= 250000 && salary < 400000){
            tax_excess = salary - 250000;
            atd =  (0.2 * tax_excess);

        }else if(salary >= 400000 && salary < 800000){
            tax_excess = (salary - 30000) - 400000;
            atd = 30000 + (0.25 * tax_excess);

        }else if(salary >= 800000 && salary < 2000000){
            tax_excess = (salary - 130000) - 800000;
            atd = 130000 + (0.3 * tax_excess);

        }else if(salary >= 2000000 && salary < 8000000){
            tax_excess = (salary - 490000) - 2000000;
            atd = 490000 + (0.32 * tax_excess);

        }else if(salary >= 8000000 ){
            tax_excess = (salary - 2410000) - 8000000;
            atd = 2410000 + (0.35 * tax_excess);
        }
        
        System.out.printf("Your Annual Tax Deduction: %.2f \n", atd);
        
        double mtd = atd/12;
        System.out.printf("Your Monthly Tax Deduction: %.2f \n", mtd);
    
        double netp = mrate - mtd;
        System.out.printf("Net Pay: %.2f \n", netp);
        
    }
}