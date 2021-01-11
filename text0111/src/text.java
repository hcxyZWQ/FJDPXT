public class text {
        public static void main(String[] args) {
            student stu=new student("李明","18778629693");
            stu.setId(1234567899);
            System.out.println("该学生的姓名是:"+stu.getName());
            System.out.println("该学生的学号是:"+stu.getId());
            System.out.println("该学生的电话号码是:"+stu.getPhone());
            System.out.println(stu.getPasswrod());
            System.out.println(stu);

            Teacher teaxher=new Teacher("教授");
            System.out.println("该老师的职称是:"+teaxher.getZhicheng());
            System.out.println(teaxher.getPasswrod());
            System.out.println(teaxher);
        }
    }