public class Example {
    private String name;
    private int rollno;
    private String location;
    

    public Example(String name, int rollno, String location) {
        this.name = name;
        this.rollno= rollno;
        this.location = location;
    }
        public string getName(String name)
        {
            return name;
        }
    
}
public void display() {
    System.out.println(getName());
}

public static void main(String[] args) {
    System.out.println();
            Example student1 = new Example("Alice", 20, "A");
            Example student2 = new Example("Bob", 21, "B");
            Example student3 = new  Example("Charlie", 22, "C");
            Example student4 = new  Example("David", 19, "A");
            Example student5 = new Example("Eve", 20,"B");
            student1.setName(newName:"Pavithra")
            System.out.println(student1.getName());
            student1.display();
}
    
}
