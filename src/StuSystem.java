import java.util.ArrayList;
import java.util.List;
/**
 * 总接口，其他接口都要继承该接口
 */
public interface StuSystem {
    //临时存放学生的集合,,所有需要增加，修改的东西，需要使用该集合来访问该学生
    List<Student> studentList = new ArrayList<>(20);
}
