public class ExampleBlocks {
    {
        System.out.println("1.) ExampleBlocks Instance Init Block");
    }

    static{
        System.out.println("1.) ExampleBlocks static Init Block");
    }

    ExampleBlocks(){
        System.out.println("ExampleBlocks - No-Arg Constructor");
    }

    {
        System.out.println("2.) ExampleBlocks Instance Init Block");
    }
}

class SubClass1 extends ExampleBlocks{

    SubClass1(){
        System.out.println("SubClass1 - No-Arg Constructor");
    }

    static {
        System.out.println("1.) SubClass1 static Init Block");
    }

    {
        System.out.println("1.) SubClass1 Instance Init Block");
    }
}

class SubClass4 extends SubClass1{

    static {
        System.out.println("1.) SubClass4 static Init Block");
    }

    SubClass4(){
        System.out.println("SubClass4 - No-Arg Constructor");
    }

    {
        System.out.println("1.) SubClass4 Instance Init Block");
    }
}

class SubClass2 extends SubClass1{

    static {
        System.out.println("1.) SubClass2 static Init Block");
    }

    SubClass2(){
        this(10);
        System.out.println("SubClass2 - No-Arg Constructor");
    }

    {
        System.out.println("1.) SubClass2 Instance Init Block");
    }

    SubClass2(int a){
        System.out.println(a);
    }

    {
        System.out.println("2.) SubClass2 instance Init Block");
    }

    static {
        System.out.println("2.) SubClass2 static Init Block");
    }

    public static void main(String[] args) {
        System.out.println("1) SubClass2 main method");
        SubClass2 subClass2 = new SubClass2();
        System.out.println("2) SubClass2 main method");

        SubClass3 subClass3 = new SubClass3();

        ClassNotSub classNotSub1 = new ClassNotSub();
        ClassNotSub classNotSub2 = new ClassNotSub();
    }

}

class SubClass3 extends SubClass2{

    static {
        System.out.println("1.) SubClass3 static Init Block");
    }

    SubClass3(){
        System.out.println("SubClass3 - No-Arg Constructor");
    }

    {
        System.out.println("1.) SubClass3 Instance Init Block");
    }

    {
        System.out.println("2.) SubClass3 Instance Init Block");
    }

    static {
        System.out.println("2.) SubClass3 static Init Block");
    }
}

class ClassNotSub{
    static {
        System.out.println("1.) ClassNotSub static Init Block");
    }

    {
        System.out.println("1.) ClassNotSub Instance Init Block");
    }
}

// class4 instance oluşturmadığımız için onun blokları çalışmaz (static de dahil..)