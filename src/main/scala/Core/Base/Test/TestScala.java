package Core.Base.Test;

//我们可以理解scala 在运行时，做了一个包装.
public class TestScala {

    public static void main(String[] paramArrayOfString) {
        //TestScala..MODULE$.main(paramArrayOfString);
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

final class TestScala$
{
    public static final TestScala$  MODULE$;

    static
    {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args)
    {
        System.out.println("Hello World");
    }
    //private TestScala$() { MODULE$ = this; }

}
