public interface CreateAndDeleteStudent {

    //创建学生，并把学生存放在studentList中
    boolean createStu();

    //通过学号删除学生
    boolean deleteStuById(int id);
}
