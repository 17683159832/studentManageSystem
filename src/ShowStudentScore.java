/**
 * 赵子昂负责
 * 注意：所使用的学生临时保存在studentList集合中
 */
public interface ShowStudentScore extends StuSystem{

    //展示全部学生
    void showAllStu();

    //按语文降序展示
    void showDescChinese();

    //通过参数班级名，按班级展示
    void showStuByClass(String _className);

    //通过学号查找来展示
    void showId(int id);

    //通过名字查找学生成绩
    void showNameStu(String _name);


}
