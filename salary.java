import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] excess = {0.2, 0.25, 0.30, 0.32, 0.35};
        double[] deduction = {30000.00, 130000.00, 490000.00, 2410000.00};

        System.out.print("Your Annual Salary: ");
        double salary = input.nextDouble();

        while(salary != 0){
            double mrate = salary/12;
            System.out.printf("Your Monthly Rate: %,.2f \n", mrate);
        
            double drate = mrate/22;
            System.out.printf("Your Daily Rate: %,.2f \n", drate);
        
            double hrate = drate/8;
            System.out.printf("Your Hourly Rate: %,.2f \n", hrate);

            double atd = 0;

            if (salary > 250000 && salary <= 400000){
                atd = salary * excess[0];

            }else if (salary > 400000 && salary <= 800000){
                atd = (((salary - deduction[0]) - 400000)) * excess[1] + deduction[0];

            }else if (salary > 800000 && salary <= 2000000){
                atd = (((salary - deduction[1]) - 800000)) * excess[2] + deduction[1];

            }else if (salary > 2000000 && salary <= 8000000){
                atd = (((salary - deduction[1]) - 800000)) * excess[3] + deduction[2];

            }else if (salary > 8000000){
                atd = (((salary - deduction[1]) - 800000)) * excess[4] + deduction[3];
            }         
      
            System.out.printf("Your Annual Tax Deduction: %,.2f \n",atd);
        
            double mtd = atd/12;
            System.out.printf("Your Monthly Tax Deduction: %,.2f \n", mtd);
    
            double netp = mrate - mtd;
            System.out.printf("Net Pay: %,.2f \n", netp);
            break;
        }
    }
}