package exam2.model;

public class Student {
    private static int  idIncreament = 0;
    private int id ;
    private String maHS;
    private String hoTen;
    private String ngaySinh;

    public Student() {
        idIncreament++;
        this.id = idIncreament;
        String s= "HS";
        if(idIncreament<10){
            s+= "00";
            s = s +(idIncreament+'0');
        }
        else if(idIncreament<100){
            s+="0";
            s = s +(idIncreament/10+'0');
            s = s +(idIncreament%10+'0');
        }
        else{
            s = s +(idIncreament/100+'0');
            s = s +((idIncreament%100)/10+'0');
            s = s +(idIncreament%10+'0');
        }

        this.maHS = s;
    }

    public Student( String hoTen, String ngaySinh) {

        idIncreament++;
        this.id = idIncreament;
        int k = idIncreament;
        String s= "HS";
        if(k<10){
            s+= "00";
            s = s +(idIncreament+'0');
        }
        else if(k<100){
            s+="0";
            s = s +(idIncreament/10+'0');
            s = s +(idIncreament%10+'0');
        }
        else{
            s = s +(idIncreament/100+'0');
            s = s +(idIncreament/10+'0');
            s = s +(idIncreament%10+'0');
        }

        this.maHS = s;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public static int getIdIncreament() {
        return idIncreament;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", maHS='" + maHS + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
