package exam2.view;

import exam2.controller.StudentController;
import exam2.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student student1 = new Student("tran thai cong","21/02/2000" );
        Student student2 = new Student("tran thai cong","21/02/2000" );
        Student student3 = new Student("nguyen van ha","21/02/2000" );
        Student student4 = new Student("nguyen van do","21/02/2000" );
        list.add(student1);
        list.add(student2);
        list.add(student3);
        StudentController studentController = new StudentController();
        studentController.add(list,student4);


        int run=0;
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("moi ban chon yeu cau :");
            System.out.println("1: them hoc sinh");
            System.out.println("2: xoa hoc sinh ");
            System.out.println("3: sua hoc sinh ");
            System.out.println("4: sap xep hoc sinh theo ten :");
            System.out.println("5 : sap xep hoc sinh theo ngay sinh :");

            System.out.println("nhap lua chon");
            run = scanner.nextInt();
            switch (run ){
                case 1:
                    System.out.println("moi ban nhap ho ten ");scanner.nextLine();
                    String hoTen =scanner.nextLine();
                    System.out.println("moi ban nhap ngay sinh :");
                    String ngaySinh = scanner.nextLine();

                    Student tem = new Student(hoTen,ngaySinh);
                    studentController.add(list,tem);
                    studentController.disPlay(list);
                    break;
                case 2:
                    System.out.println("moi ban nhap ma sinh vien :"); scanner.nextLine();
                    String ma = scanner.nextLine();
                    studentController.delete(list,ma);
                    studentController.disPlay(list);

                    break;
                case 3:
                    System.out.println("moi ban nhap ma hoc sinh sua ");scanner.nextLine();
                    String maHS = scanner.nextLine();
                    System.out.println("ten hoc sinh sua thanh :");
                    String hoTenSua =scanner.nextLine();
                    System.out.println("ngay sinh sua thanh :");
                    String ngaySinhSua = scanner.nextLine();
                    studentController.edit(list,maHS,hoTenSua,ngaySinhSua);
                    studentController.disPlay(list);

                    break;
                case 4:
                    System.out.println("sap xep theo ten :");
                    Collections.sort(list, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getHoTen().split(" ")[2].compareTo(o2.getHoTen().split(" ")[2]);
                        }
                    });
                    studentController.disPlay(list);
                    break;

                case 5:
                    System.out.println("sap xep theo ngay sinh ");
                    Collections.sort(list, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                        }
                    });
                    studentController.disPlay(list);

            }
        }


    }
}
