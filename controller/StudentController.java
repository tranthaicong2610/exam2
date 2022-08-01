package exam2.controller;

import exam2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    //them hoc sinh
    public ArrayList<Student> add(ArrayList<Student> list,Student student){
        System.out.println("them sinh vien :");
        list.add(student);
        return list;
    }
    // sua hoc sinh theo ma
    public ArrayList<Student> edit (ArrayList<Student> list , String maHS,String hoTen , String ngaySinh){
        System.out.println("sua sinh vien :");
        for(Student  student: list){
            if(student.getMaHS().equals(maHS) ){
                student.setHoTen(hoTen);
                student.setNgaySinh(ngaySinh);
                break;
            }
        }
        return list;

    }
    // xoa hoc sinh theo ma :
    public ArrayList<Student> delete (ArrayList<Student> list , String maHS){
        System.out.println("xoa sinh vien :");
        for(int i=0;i<list.size();i++){
            String ma = list.get(i).getMaHS();
            if(maHS.equals(ma)){
                list.remove(list.get(i).getId());
                break;
            }
        }
        return list;

    }
    // Hien thi danh sach
    public void  disPlay(ArrayList<Student> list){
        char tem ='A';

        int count=1;
        for(int i=0;i<list.size()-1;i++){
            count=1;
            for(int j =i+1;j<list.size();j++){

                if(list.get(i).getHoTen().equals(list.get(j).getHoTen())){

                    list.get(j).setHoTen(list.get(j).getHoTen()+" "+(char)(tem+count));
                    count++;

                }
            }
            if(count>1) {
                list.get(i).setHoTen(list.get(i).getHoTen() + " " + tem);
            }


        }
        for(Student s : list ){
            System.out.println(s);
        }

    }


}
