package OgrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.enote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.enote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.enote = kimya;
        }

    }

    public void addBulkVExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.vnote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.vnote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.vnote = kimya;
        }

    }


    public void isPass() {
        if (this.mat.enote == 0 || this.fizik.enote == 0 || this.kimya.enote == 0||this.mat.vnote == 0 || this.fizik.vnote == 0 || this.kimya.vnote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.vnote*0.20 +this.fizik.enote*0.80)+(this.mat.vnote*0.40 +this.mat.enote*0.60)+(this.kimya.vnote*0.30 +this.kimya.enote*0.70))/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Yazılı Notu : " + this.mat.enote);
        System.out.println("Fizik Yazılı Notu : " + this.fizik.enote);
        System.out.println("Kimya Yazılı Notu : " + this.kimya.enote);
        System.out.println("Matematik Sözlü Notu : " + this.mat.vnote);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.vnote);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.vnote);
    }


}
