/**
 * 李星池负责
 * 注意：所使用的学生临时保存在studentList集合中
 */

public interface CreateAndDeleteStudent extends StuSystem{

    //创建学生（无成绩），并把学生存放在studentList中
    Student createStu();

   //修改学生基本信息
    void updateStu(int id);

    //通过学号删除学生
    boolean deleteStuById(int id);
}
