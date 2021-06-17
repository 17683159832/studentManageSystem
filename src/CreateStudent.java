import java.util.Scanner;

public class CreateStudent implements CreateAndDeleteStudent{

    //创建学生（无成绩），并把学生存放在studentList中
    @Override
    public Student createStu() {
        System.out.println("输入学生姓名：");
        Scanner can = new Scanner(System.in);
        String name = can.nextLine();
        Student s = new Student();
        s.setName(name);
        System.out.println("输入学生班级：");
        s.set_class(can.nextLine());
        System.out.println("输入学生学号：");
        s.setId(can.nextInt());
        System.out.println("输入语文成绩：");
        s.setChinese(can.nextDouble());
        System.out.println("输入数学成绩：");
        s.setMath(can.nextDouble());
        System.out.println("输入英语成绩：");
        s.setEnglish(can.nextDouble());
        studentList.add(s);
        return s;
    }

    //修改学生基本信息
    @Override
    void updateStu(int id) {
        createStu();
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner.nextLine());
        student.set_class(scanner.nextLine());
        student.setId(scanner.nextInt());
        studentList.add(student);
    }

    //通过学号删除学生
    @Override
    public boolean deleteStuById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                studentList.remove(i);
            }
        }
        return false;
    }
}
