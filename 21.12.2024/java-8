import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases-- > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }

        // Sort the student list using a custom comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Sort by CGPA in descending order
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }

                // If CGPA is same, sort by first name in ascending order
                int nameComparison = s1.getFname().compareTo(s2.getFname());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                // If both CGPA and first name are same, sort by ID in ascending order
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        // Print the names of the students in the required order
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
