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

        double atd = 0;
        if (salary <= 250000){
            atd = 0;
        }else if(salary >= 250000 && salary < 400000){
            atd = 30000 * 0.2;
        }else if(salary >= 400000 && salary < 800000){
            atd = 30000 + (0.25 * (salary - 400000));
        }else if(salary >= 800000 && salary < 200000000){
            atd = 130000 + (0.3 * (salary - 800000));
        }else if(salary >= 200000000 && salary < 800000000){
            atd = 490000 + (0.32 * (salary - 200000000));
        }else if(salary >= 800000000 ){
            atd = 2410000 + (0.35 * (salary - 800000000));
        }
        System.out.printf("Your Annual Tax Deduction: %.2f \n", atd);
        
        double mtd = atd/12;
        System.out.printf("Your Monthly Tax Deduction: %.2f \n", mtd);
    
        double netp = mrate - mtd;
        System.out.printf("Net Pay: %.2f \n", netp);
        

        
    }
}