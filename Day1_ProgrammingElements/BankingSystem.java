interface Loanable{
    void loan(double amount);
    boolean eligible();
}

abstract class BankAccount{
    private String accNo;
    private String name;
    private double bal;

    public BankAccount(String accNo,String name,double bal){
        this.accNo=accNo;
        this.name=name;
        this.bal=bal;
    }

    public String getAccNo(){
        return accNo;
    }

    public String getName(){
        return name;
    }

    public double getBal(){
        return bal;
    }

    public void deposit(double amt){
        if(amt>0)bal+=amt;
    }

    public void withdraw(double amt){
        if(amt>0&&amt<=bal)bal-=amt;
    }

    protected void setBal(double bal){
        this.bal=bal;
    }

    public abstract double interest();

    public void show(){
        System.out.println(accNo+" "+name+" "+bal);
    }
}

class Savings extends BankAccount implements Loanable{
    public Savings(String accNo,String name,double bal){
        super(accNo,name,bal);
    }

    public double interest(){
        return getBal()*0.04;
    }

    public void loan(double amt){
        System.out.println("Loan:"+amt);
    }

    public boolean eligible(){
        return getBal()>=5000;
    }
}

class Current extends BankAccount implements Loanable{
    public Current(String accNo,String name,double bal){
        super(accNo,name,bal);
    }

    public double interest(){
        return getBal()*0.02;
    }

    public void loan(double amt){
        System.out.println("Loan:"+amt);
    }

    public boolean eligible(){
        return getBal()>=10000;
    }
}

public class BankingSystem{
    public static void main(String[] args){
        Loanable[] accts={
            new Savings("S101","Aman",6000),
            new Current("C202","Ravi",12000)
        };

        for(Loanable l:accts){
            BankAccount b=(BankAccount)l;
            b.show();
            System.out.println("Interest:"+b.interest());
            System.out.println("Eligible:"+l.eligible());
            l.loan(5000);
            System.out.println();
        }
    }
}
