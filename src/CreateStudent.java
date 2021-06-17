import java.util.Scanner;

public class CreateStudent implements CreateAndDeleteStudent{

    //创建学生，并把学生存放在studentList中
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

    //通过id修改学生基本信息
    @Override
    public void updateStu(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                Scanner scanner = new Scanner(System.in);
                System.out.println("修改姓名：");
                studentList.get(i).setName(scanner.nextLine());
                System.out.println("修改班级：");
                studentList.get(i).set_class(scanner.nextLine());
                System.out.println("修改学号");
                studentList.get(i).setId(scanner.nextInt());
            }
        }

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
