package org.example.e136;

public class E136AccessModifiers {
private void a(){
    System.out.println("This is Private Method");
}

void b(){
    System.out.println("This is Default Method");
}

protected void c(){
    System.out.println("This is Protected Method");
}

public void d(){
    System.out.println("This is Public Method");
}

    public static void main(String[] args) {
        E136AccessModifiers obj=new E136AccessModifiers();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}


