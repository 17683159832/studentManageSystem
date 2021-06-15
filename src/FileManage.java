public interface FileManage {
    //转入到内存
    boolean loadStu();

    //转出到磁盘
    boolean outStuToFile();
}
