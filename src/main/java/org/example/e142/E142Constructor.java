package org.example.e142;

public class E142Constructor {




    public static void main(String[] args) {
SyntaxTechnologies obj1=new SyntaxTechnologies("Syntax",6, 2020, "07/30/2020" );
SyntaxTechnologies obj2=new SyntaxTechnologies();
obj2.display();
obj1.display();

    }
}

class SyntaxTechnologies{
    private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

     public SyntaxTechnologies(){
     }

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        this.batch=batch;
        this.schoolName=schoolName;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }

    public void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
