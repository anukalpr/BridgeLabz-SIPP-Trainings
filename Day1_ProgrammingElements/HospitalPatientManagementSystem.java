import java.util.ArrayList;
import java.util.List;

interface MedicalRecord{
    void addRecord(String rec);
    void viewRecords();
}

abstract class Patient{
    private String id;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String id,String name,int age,String diagnosis){
        this.id=id;
        this.name=name;
        this.age=age;
        this.diagnosis=diagnosis;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis=diagnosis;
    }

    public abstract double bill();

    public void show(){
        System.out.println(id+" "+name+" "+age+" "+diagnosis);
    }
}

class InPatient extends Patient implements MedicalRecord{
    private double roomRate;
    private int days;
    private List<String> records=new ArrayList<>();

    public InPatient(String id,String name,int age,String diagnosis,double roomRate,int days){
        super(id,name,age,diagnosis);
        this.roomRate=roomRate;
        this.days=days;
    }

    public double bill(){
        return roomRate*days;
    }

    public void addRecord(String rec){
        records.add(rec);
    }

    public void viewRecords(){
        for(String r:records){
            System.out.println(r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord{
    private double consultFee;
    private List<String> records=new ArrayList<>();

    public OutPatient(String id,String name,int age,String diagnosis,double consultFee){
        super(id,name,age,diagnosis);
        this.consultFee=consultFee;
    }

    public double bill(){
        return consultFee;
    }

    public void addRecord(String rec){
        records.add(rec);
    }

    public void viewRecords(){
        for(String r:records){
            System.out.println(r);
        }
    }
}

public class HospitalPatientManagementSystem{
    public static void main(String[] args){
        MedicalRecord[] patients={
            new InPatient("P101","Raj",45,"Surgery",2000,5),
            new OutPatient("P202","Meena",30,"Fever",500)
        };

        for(MedicalRecord m:patients){
            Patient p=(Patient)m;
            p.show();
            System.out.println("Bill:"+p.bill());
            m.addRecord("Checkup done");
            m.addRecord("Medicine given");
            m.viewRecords();
            System.out.println();
        }
    }
}
