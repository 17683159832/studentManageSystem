import java.io.*;
import java.util.List;

public class FileSaveAndLoad  implements FileManage,StuSystem{
    @Override
    public boolean loadStu() throws IOException, ClassNotFoundException {
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("nativeStu"));
//        studentList = (List<Student>) in.readObject();
//        if (studentList.size() != 0) {
//            return true;
//        }
        return false;
    }

    @Override
    public boolean outStuToFile() throws IOException {
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("nativeStu"));
//        out.writeObject(studentList);
        return true;
    }
}
