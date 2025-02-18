public class Student { 
        String name;
        int rollno;
        String grade;
    
        
        public Student(String name, int rollno, String grade) {
            this.name = name;
            this.rollno= rollno;
            this.grade = grade;
        }
    
        
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("rollno: " + rollno);
            System.out.println("Grade: " + grade);
       }
    }
    
 class Students {
        public static void main(String[] args) {
            
            Student student1 = new Student("Alice", 20, "A");
            Student student2 = new Student("Bob", 21, "B");
            Student student3 = new Student("Charlie", 22, "C");
            Student student4 = new Student("David", 19, "A");
            Student student5 = new Student("Eve", 20, "B");
    
            
            student1.displayDetails();
            student2.displayDetails();
            student3.displayDetails();
            student4.displayDetails();
            student5.displayDetails();
        }
    }
    
    
    
}
