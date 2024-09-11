package org.example.e161;

public class E161MethodOverriding {
    public static void main(String[] args) {
        Manager m=new Manager();
        Developer d=new Developer();
        Intern i=new Intern();

        Employee[] arr={m,d,i};
        for (int j = 0; j < arr.length; j++) {
            Employee em=arr[j];
            em.hello();
        }

        d.work();
        d.takeBreak();
        d.attendMeeting();

    }

}

class Employee{

    //creating public Method
    public void work(){
        System.out.println("I am an Employee working");
    }

    //creating protected Method
    protected void takeBreak(){
        System.out.println("I am an Employee taking a break");
    }

    //creating default (package-private) Method
    void  attendMeeting(){
        System.out.println("I am an Employee attending a meeting");
    }

    //creating private Method
    private void submitReport(){
        System.out.println("I am an Employee submitting a report");
    }

    //creating public Method
    public void hello(){
        System.out.println("method in Employee class");
    }
}

class Manager extends Employee{
    public void work(){
        System.out.println("I am a Manager working");
    }
    protected void takeBreak(){
        System.out.println("I am a Manager taking a break");
    }
    void  attendMeeting(){
        System.out.println("I am Manager attending a meeting");
    }
    public void hello(){
        System.out.println("method in Manager class");
    }
}

class Developer extends Employee{
    public void work(){
        System.out.println("I am a Developer working");
    }
    protected void takeBreak(){
        System.out.println("I am a Developer taking a break");
    }
    void  attendMeeting(){
        System.out.println("I am a Developer attending a meeting");
    }
    public void hello(){
        System.out.println("method in Developer class");
    }
}

class Intern extends Employee{
    public void work(){
        System.out.println("I am an Intern working");
    }
    protected void takeBreak(){
        System.out.println("I am an Intern taking a break");
    }
    void  attendMeeting(){
        System.out.println("I am an Intern attending a meeting");
    }
    public void hello(){
        System.out.println("method in Intern class");
    }
}