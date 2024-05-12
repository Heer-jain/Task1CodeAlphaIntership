import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Gets the number of students
        System.out.println("Enter number of students");
        int numOfStudents = sc.nextInt();

        // Create the two array, one of students name and other of their grade 
        String[] nameOfStudents = new String[numOfStudents];
        float[] gradeOfStudents = new float[numOfStudents];
        
        for(int i=0; i<numOfStudents; i++){
            
            // Gets the name of students
            System.out.print("Enter the name of students " + (i+1) + ": ");
            nameOfStudents[i] = sc.next();

            // Gets the grade of students
            System.out.print("Enter the number of students " + (i+1) + ": ");
            gradeOfStudents[i] = sc.nextFloat();
        }

        // Give the average marks of students
        float sum = 0;
        for(int i=0; i<numOfStudents; i++){
            sum += gradeOfStudents[i];
        }
        float avg = (sum/numOfStudents);
        System.out.printf("Average of grade of all students are: %.2f \n", avg);

        // Give the highest among all the student
        float highest = gradeOfStudents[0];
        int indexOfHighest = 0;
        for(int i=0; i<numOfStudents; i++){
            if(highest < gradeOfStudents[i]){
                highest = gradeOfStudents[i];
                indexOfHighest = i;
            }
        }
        System.out.println("Highest grade is " + highest + " of " + nameOfStudents[indexOfHighest]);

        // Give the lowest among all the student
        float lowest = gradeOfStudents[0];
        int indexOfLowest = 0;
        for(int i=0; i<numOfStudents; i++){
            if(lowest > gradeOfStudents[i]){
                lowest = gradeOfStudents[i];
                indexOfLowest = i;
            }
        }
        System.out.println("Lowest grade is " + lowest + " of " + nameOfStudents[indexOfLowest]);
    }
}