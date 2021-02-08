import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String no;

    
    public Student(String name, String no) {
        super();
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

}

public class Q1 {
    public static void main(String[] args) {
        Student st1 = new Student("홍길동", "1234");
        Student st2 = new Student("사오정", "2345");
        Student st3 = new Student("삼장법사", "3456");

        ArrayList<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for(Student stu : list) {
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        Scanner sc = new Scanner(System.in);

        
        while(true) {
            System.out.println("계속 검색 : y, 종료 : n");
            String input = sc.next();
            if(input.equals("y")) {
                System.out.println("검색 시작");
                String name = sc.next();
                boolean flag = false;

                for(Student stu : list) {
                    if(stu.getName().equals(name)) {
                        System.out.println("해당 학생의 학번 : " + stu.getNo());
                        flag = true;
                    }
                }

            }
            else if(input.equals("n")) {
                break;
            }
        }
        System.out.println("프로그램 종료.");
    }
}