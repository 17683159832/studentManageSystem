/**
 * 甄润泽负责
 * 注意：所使用的学生临时保存在studentList集合中
 */

public interface AddAndUpdateScore extends StuSystem{

    //向指定学号的学生，添加各科成绩（注意判断成绩是否已存在）
    boolean addScore(int id);

    //修改指定学号的学生成绩
    boolean updateScore(int id);
}


