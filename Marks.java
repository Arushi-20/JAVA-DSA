public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;

        StudentData(int s){
            marks = new int[s];
        }
    }

    public static void main(String[] args) {
        StudentData s1= new StudentData(4);
        s1.marks[0]=98;
        s1.marks[1]= 100;
        
    }
}
