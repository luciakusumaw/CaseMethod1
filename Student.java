public class Student {
    String nim;
    String name;
    String studyProgram;
    public Student (String nim, String name, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void printStudent() {
        System.out.println("NIM: "+ nim +" | Name: " +name+ " | Study Program: " + studyProgram);
    }
}