
import java.util.ArrayList;
import java.util.Scanner;
public class StuIdStore  implements AddAndUpdateScore{

    private Object StudentID;

    @Override
    public boolean addScore(int id){


        for (int i = 0; i < StuSystem.studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
             Student s=studentList.get(i);
               if(s.getChinese()!=null){
                   Scanner scanner = new Scanner(System.in);
                   double C = scanner.nextDouble();
                   System.out.println("输入语文成绩"+C);

               }
            }else{
                System.out.println( "找不到该学号！");
                return  false;

            }
        }
        for (int i = 0; i < StuSystem.studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
                Student s=studentList.get(i);
                if(s.getChinese()!=null){
                    Scanner scanner = new Scanner(System.in);
                    double M = scanner.nextDouble();
                    System.out.println("输入数学成绩"+M);
                }
            }else{
                System.out.println( "找不到该学号！");
                return  false;

            }
        }
        for (int i = 0; i < StuSystem.studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
                Student s=studentList.get(i);
                if(s.getChinese()!=null){
                    Scanner scanner = new Scanner(System.in);
                    double E = scanner.nextDouble();
                    System.out.println("输入英语成绩"+E);
                }
            }else{
                System.out.println( "找不到该学号！");
                return  false;

            }
        }

        return false;
    }

    @Override
    public boolean updateScore(int id) {

        return false;
    }
}

class StudentID implements StuSystem { }
class chinese extends Student{ }
class math extends  Student  {  }
class english extends Student{ }
