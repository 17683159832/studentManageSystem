public interface AddAndUpdateScore {
    // 所使用的学生临时保存在studentList集合中

    //向指定学号的学生，添加各科成绩
    boolean addScore(int id);

    //修改指定学号的学生成绩
    boolean updateScore(int id);
}
