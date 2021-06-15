import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMain {
/**
 *  其他接口 实现  必须  继承此类
 *
 *  该类的功能主要负责：临时保存学生
 */


    //临时存放学生的集合,,所有需要增加，修改的东西，需要使用该集合来访问该学生
    List<Student> studentList = new ArrayList<>(20);


}
