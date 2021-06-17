import java.util.Scanner;
public class StuIdStore  implements AddAndUpdateScore{
    @Override
    public boolean addScore(int id){
        for (int i = 0; i < StuSystem.studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
             Student s=studentList.get(i);
                Scanner scanner = new Scanner(System.in);
               if(s.getChinese()==null) {
                   System.out.println("输入语文成绩：");
                   double C = scanner.nextDouble();
                   s.setChinese(C);
               }else{
                   System.out.println("已有语文成绩不用输入");
               }
                if(s.getMath()==null){
                   System.out.println("输入数学成绩：");
                   double M = scanner.nextDouble();
                   s.setMath(M);
                }else{
                    System.out.println("已有数学成绩不用输入");
                }
                if(s.getEnglish()==null){
                   System.out.println("输入英语成绩：");
                   double E = scanner.nextDouble();
                   s.setEnglish(E);
               }else{
                    System.out.println("已有英语成绩不用输入");
                }
                return  true;
            }
        }
        System.out.println( "找不到该学号！");
        return false;
    }

    @Override
    public boolean updateScore(int id) {
        for (int i = 0; i < StuSystem.studentList.size(); i++) {
            if(studentList.get(i).getId()==id){
                Student s=studentList.get(i);
                if(s.getChinese()!=null){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("原来的语文成绩为"+s.getChinese()+"更改语文成绩:");
                    double C = scanner.nextDouble();
                    s.setChinese(C);
                    System.out.println("原来的数学成绩为"+s.getMath()+"更改数学成绩:");
                    double M= scanner.nextDouble();
                    s.setMath(M);
                    System.out.println("原来的英语成绩为"+s.getEnglish()+"更改英语成绩:");
                    double E = scanner.nextDouble();
                    s.setEnglish(E);
                    System.out.println( "更改成功");
                }
            }
        }
        return false;
    }
}

