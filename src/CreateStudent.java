import java.util.Scanner;

public class CreateStudent implements CreateAndDeleteStudent{

    //创建学生（无成绩），并把学生存放在studentList中
    @Override
    public boolean createStu() {
        Scanner can = new Scanner(System.in);
        String name = can.nextLine();
        Student s = new Student();
        s.setName(name);
        studentList.add(s);
        return false;
    }

    //创建学生（同时添加成绩），并把学生存放在studentList中
    @Override
    public boolean createStuAndScore() {
        createStu();
        Scanner scanner = new Scanner(System.in);
        double great = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        double great1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        double great2 = scanner2.nextDouble();
        Student student = new Student();
        student.setMath(great);
        student.setChinese(great1);
        student.setEnglish(great2);
        studentList.add(student);
        return false;
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
