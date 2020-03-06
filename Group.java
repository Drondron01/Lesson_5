import java.util.ArrayList;

    public class  Group {

        private String number;

        private ArrayList<Student> students = new ArrayList<>();

        public ArrayList<Student> getStudents() {
            return students;
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public Group(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "number =" + number + "\n" +
                   "students=" + students;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
