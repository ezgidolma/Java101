package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax_price=0.0;
        if (this.salary>1000){
            tax_price=this.salary*0.03;
            return tax_price;
        }
        else {
            return tax_price;
        }
    }

    public double bonus(){
        double bonus_price=0.0;
        if (this.workHours>40){
            bonus_price=(this.workHours-40)*30;
            return bonus_price;
        }
return bonus_price;
    }

    public double raiseSalary(){
        int now_year=2021;
        double raise_price=0.0;
        if (now_year-this.hireYear<10){
            raise_price=this.salary*0.5;
            return raise_price;
        }
        if (now_year-this.hireYear>10 && now_year-this.hireYear<20){
            raise_price=this.salary*0.10;
            return raise_price;
        }
        if (now_year-this.salary>20){
            raise_price=this.salary*0.15;
            return  raise_price;
        }
        return raise_price;
    }


    public void printString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+ tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Maaş Artışı: "+ raiseSalary());
        System.out.println("Vergi ve Bonus ile birlikte Maaş : "+ (this.salary-tax()+bonus()));
        System.out.println("Toplam maaş: "+ (this.salary-tax()+bonus()+raiseSalary()));
    }

}
