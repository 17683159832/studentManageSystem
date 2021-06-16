public class show implements ShowStudentScore {




    //展示全部学生
    @Override
    public void showAllStu() {

        for (int i =0;i<studentList.size();i++){

            System.out.println("名字："+studentList.get(i).getName()+" "+"班级："+studentList.get(i).get_class()+
                    " "+"学号："+studentList.get(i).getId()+" "+"语文成绩："+studentList.get(i).getChinese()+" "+"数学成绩:"
            +studentList.get(i).getMath()+" "+"英语成绩"+studentList.get(i).getEnglish());

        }
    }
    //按语文降序展示
    @Override
    public void showDescChinese() {
        for (int i=0;i<studentList.size();i++){
            for (int j=0;j<studentList.size()-i;j++){
                if (studentList.get(j).getChinese()<studentList.get(j+1).getChinese()){
                    Student t =new Student();
                    t  = studentList.get(j);
                    studentList.set(j,studentList.get(j+1));
                    studentList.set(j+1,t);
                }

            }
        }
        for (int i = 0;i<studentList.size();i++){
            System.out.println("名字："+studentList.get(i).getName()+" "+"班级："+studentList.get(i).get_class()+
                    " "+"学号："+studentList.get(i).getId()+" "+"语文成绩："+studentList.get(i).getChinese()+" "+"数学成绩:"
                    +studentList.get(i).getMath()+" "+"英语成绩"+studentList.get(i).getEnglish());
        }

    }
    //通过参数班级名，按班级展示
    @Override
    public void showStuByClass(String _className) {

        System.out.println("一下都是"+_className+"的");
        for (int i = 0;i<studentList.size();i++){
            if (studentList.get(i).get_class() == _className){
                System.out.println("名字："+studentList.get(i).getName()+" "+"班级："+studentList.get(i).get_class()+
                        " "+"学号："+studentList.get(i).getId()+" "+"语文成绩："+studentList.get(i).getChinese()+" "+"数学成绩:"
                        +studentList.get(i).getMath()+" "+"英语成绩"+studentList.get(i).getEnglish());
            }
        }


    }





}
