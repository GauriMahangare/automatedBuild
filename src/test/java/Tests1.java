import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Tests1 {
    @Test
    public void test1(){
        System.out.println("executing test1");
        Assert.fail();
    }
    @Test
    public void test2(){
        System.out.println("executing test2");
    }
    @Test
    public void test3(){
        System.out.println("executing test3");
    }
    @Test
    public void test4(){
        System.out.println("executing test4");
    }
    @Test
    public void test5(){
        System.out.println("executing test5");
    }
    @Test
    public void test6(){
        System.out.println("executing test6");
        Assert.fail();
    }
    @Test
    public void test7(){
        System.out.println("executing test7");
    }
    @Test
    public void test8(){
        System.out.println("executing test8");
        Assert.fail();
    }
}
