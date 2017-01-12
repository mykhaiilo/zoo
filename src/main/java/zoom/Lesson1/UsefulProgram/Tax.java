package zoom.Lesson1.UsefulProgram;

public class Tax {
    double grossIncome;
    String state;
    int dependents;
    public double calcTax(){
        double stateTax=0;
        if(grossIncome<=30000){
            stateTax=grossIncome*0.05;
        }  else if (grossIncome>60000){
            stateTax=grossIncome*0.06;
        }
        return stateTax;
    }

}
   /* class TestTax{
        public static void main(String[] args) {
         Tax t  = new Tax();
            t.grossIncome =5000;
            t.dependents=2;
            t.state ="NJ";
            double yourTax = t.calcTax();
            System.out.println("Your tax is "+ yourTax);
        }

}*/

class NJJTax extends Tax {
    double adjustStudents (double stateTax){
        double adjustedTax=stateTax-500;
        return adjustedTax;

    }
}
class TestTax {
    public static void main(String[] args) {
        NJJTax t = new NJJTax();
        t.grossIncome = 5000;
        t.dependents = 2;
        t.state = "NJ";
        double yourTax = t.calcTax();
        System.out.println("Your tax is " + yourTax);
    }
}
