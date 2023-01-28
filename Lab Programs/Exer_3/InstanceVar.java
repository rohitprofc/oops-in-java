package Exer_3;

public class InstanceVar {
    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.display();
    }

}

class MainClass extends InheritedClass {
    int a = 45;

    void display() {
        super.display();
        System.out.println("(MainClass) Main class (a) = " + a);
        System.out.println("(MainClass) Main class (this.a) = " + this.a);
        System.out.println("(MainClass) Inherited class (super.a) = " + super.a);
    }

}

class InheritedClass {
    int a = 51;

    void display() {
        System.out.println("(InheritedClass) Inherited class (this.a) = " + this.a);
        System.out.println("(InheritedClass) Inherited class (a) = " + a);
    }
}
/*
 * Output
 * (InheritedClass) Inherited class (this.a) = 51
 * (InheritedClass) Inherited class (a) = 51
 * (MainClass) Main class (a) = 45
 * (MainClass) Main class (this.a) = 45
 * (MainClass) Inherited class (super.a) = 51
 */
