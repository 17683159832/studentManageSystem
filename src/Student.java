public class Student{
    private int id;  //学号
    private String name;    //姓名
    private String _class;  //班级
    private Double chinese; //语文成绩
    private Double math;    //数学
    private Double english; //英语
    public Student() {
    }
    public Student(int id, String name, String _class, Double chinese, Double math, Double english) {
        this.id = id;
        this.name = name;
        this._class = _class;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }
}
