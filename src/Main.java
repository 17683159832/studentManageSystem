import java.io.IOException;
import java.util.Scanner;
/**
 * 提供界面交互，函数调用
 */
public class Main implements StuSystem{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //文件加载
        FileSaveAndLoad file = new FileSaveAndLoad();
        try {
            file.loadStu();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (true){
            System.out.println("==========================");
            System.out.println("输入序号完成对应操作：");
            System.out.println("1.学生管理模块");
            System.out.println("2.成绩管理模块");
            System.out.println("3.展示成绩模块");
            System.out.println("4.退出并保存");
            System.out.println("==========================");
            int i = in.nextInt();
            switch(i){
                case 1:
                    stuManage();
                    break;
                case 2:
                    stuScore();
                    break;
                case 3:
                    stuShow();
                    break;
                case 4:
                    //退出并保存
                    try {
                        file.outStuToFile();
                        System.exit(0);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                default:
                    System.out.println("输入非法");
            }
        }
    }
    private static void stuShow() {
        while (true){
            System.out.println("==========================");
            System.out.println("输入序号完成对应操作：");
            System.out.println("1.展示所有学生");
            System.out.println("2.按语文降序展示");
            System.out.println("3.按班级展示");
            System.out.println("4.通过学号查询");
            System.out.println("5.按姓名查询");
            System.out.println("6.退出当前模块");
            System.out.println("==========================");
            int i = in.nextInt();
            Show show = new Show();
            switch (i){
                case 1:
                    //展示所有
                    show.showAllStu();
                    break;
                case 2:
                    //语文降序展示
                    show.showDescChinese();
                    break;
                case 3:
                    System.out.println("输入需要查看的班级：");
                    String c = new Scanner(System.in).nextLine();
                    //班级查看方法
                    show.showStuByClass(c);
                    break;
                case 4:
                    System.out.println("输入需要查看的学号：");
                    int x = in.nextInt();
                    show.showId(x);
                    break;
                case 5:
                    System.out.println("输入需要查看的姓名：");
                    String n = new Scanner(System.in).nextLine();
                    show.showNameStu(n);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入非法");
            }
        }
    }
    private static void stuScore() {
        while (true){
            System.out.println("==========================");
            System.out.println("输入序号完成对应操作：");
            System.out.println("1.添加对应学号学生成绩");
            System.out.println("2.修改对应学号学生成绩");
            System.out.println("3.退出当前模块");
            System.out.println("==========================");
            int i = in.nextInt();
            StuIdStore stuIdStore = new StuIdStore();
            switch (i){
                case 1:
                    //添加成绩
                    System.out.println("输入添加学生成绩的学号：");
                    int id1 = in.nextInt();
                    stuIdStore.addScore(id1);
                    break;
                case 2:
                    //修改成绩
                    System.out.println("输入修改学生成绩的学号：");
                    int id2 = in.nextInt();
                    stuIdStore.updateScore(id2);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入非法");
            }
        }
    }
    private static void stuManage() {
        while (true){
            System.out.println("==========================");
            System.out.println("输入序号完成对应操作：");
            System.out.println("1.添加学生");
            System.out.println("2.修改学生的基本信息");
            System.out.println("3.删除对应学号学生");
            System.out.println("4.退出当前模块");
            System.out.println("==========================");
            int i = in.nextInt();
            CreateStudent creS = new CreateStudent();
            switch (i){
                case 1:
                    //添加学生方法
                    creS.createStu();
                    break;
                case 2:
                    //修改学生基本信息
                    System.out.println("输入修改学生的学号：");
                    int id = in.nextInt();
                    creS.updateStu(id);
                    break;
                case 3:
                    //删除对应学号方法
                    System.out.println("输入删除学生的学号：");
                    int id2 = in.nextInt();
                    creS.deleteStuById(id2);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入非法");
            }
        }
    }
}
