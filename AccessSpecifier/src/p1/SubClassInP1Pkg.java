package p1;

public class SubClassInP1Pkg  extends Protection{

    public SubClassInP1Pkg()
    {
        System.out.println("It is SubClassInP1Pkg Constructor");
    //    System.out.println("private_a :"+private_a);
        System.out.println("default_b :"+default_b);
        System.out.println("protected_c :"+protected_c);
        System.out.println("public_d :"+public_d);
    }
}
