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
}
