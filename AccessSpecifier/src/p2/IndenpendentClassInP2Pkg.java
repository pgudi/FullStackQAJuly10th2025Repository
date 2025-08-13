package p2;

import p1.Protection;

public class IndenpendentClassInP2Pkg {
    Protection o=new Protection();
    public IndenpendentClassInP2Pkg()
    {
        System.out.println("It is IndependentClassInP2Pkg class constructor");
    //     System.out.println("private_a :"+o.private_a);
    //    System.out.println("default_b :"+o.default_b);
    //    System.out.println("protected_c :"+o.protected_c);
        System.out.println("public_d :"+o.public_d);

    }
}
