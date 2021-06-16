import java.io.*;
import java.util.List;

public class FileSaveAndLoad  implements FileManage,StuSystem{
    @Override
    public boolean loadStu() throws IOException, ClassNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader("src/nativeStu"));
        String stu = null;
        while ((stu = in.readLine()) != null) {
            String[] stus = stu.split(",");
            Student s1 = new Student();
            s1.setId(Integer.parseInt(stus[0]));
            s1.setName(stus[1]);
            s1.set_class(stus[2]);
            s1.setChinese(Double.parseDouble(stus[3]));
            s1.setMath(Double.parseDouble(stus[4]));
            s1.setEnglish(Double.parseDouble(stus[5]));
            studentList.add(s1);
        }
        return true;
    }

    @Override
    public boolean outStuToFile() throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/nativeStu"));
        StringBuffer str = new StringBuffer();
        for (Student stu:studentList) {
            str.append(stu.getId()+",");
            str.append(stu.getName()+",");
            str.append(stu.get_class()+",");
            str.append(stu.getChinese().doubleValue()+",");
            str.append(stu.getMath().doubleValue()+",");
            str.append(stu.getEnglish().doubleValue()+"\n");
        }
        out.write(str.toString());
        out.flush();
        out.close();
        return true;
    }
}
