import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 邓先德负责
 */
public interface FileManage extends StuSystem{
    //转入到内存
    boolean loadStu() throws IOException, ClassNotFoundException;

    //转出到磁盘
    boolean outStuToFile() throws IOException;
}
