abstract class exam{
    String subject;
    int marks;
    abstract void calculateGrade();
}
TheoryExam extends exam {
    TheoryExam(String subject, int marks){
        this.subject = subject;
        this.marks = marks;
    }
    void calculateGrade(){
        if(marks>=90){
            System.out.println(subject +  "Grade: A");
        }
        else if(marks>=75){
            System.out.println(subject + "Grade: B");
        }
        else if(marks>=50){
            System.out.println(subject + "Grade: C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
    PracticalExam extends exam {
        PracticalExam(String subject, int marks){
            this.subject = subject;
            this.marks = marks;
        }
        void calculateGrade(){
            if(marks>=80){
                System.out.println(subject + "Grade: A");
            }
            else if(marks>=60){
                System.out.println(subject + "Grade: B");
            }
            else if(marks>=40){
                System.out.println(subject + "Grade: C");
            }
            else{
                System.out.println("Fail");
            }
        }

    }