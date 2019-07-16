package ac.kr.ajou.longmethod;

import org.junit.Test;

public class LongMethodTest {

    public static final String CORRECT_SOCIAL_STRING = "abcdef";

    @Test(expected = RuntimeException.class)
    public void dosomething_소셜스트림이_6자리가_아니면_에러(){
        LongMethod longMethod = new LongMethod();
        longMethod.doSomething(CORRECT_SOCIAL_STRING,"asdf","24145");
    }

    @Test(expected = RuntimeException.class)
    public void dosomething_소셜스트림이_6자리이고_숫자가_있으면_에러(){
        LongMethod longMethod = new LongMethod();
        longMethod.doSomething(CORRECT_SOCIAL_STRING,"asdf","24145");
    }

    @Test(expected = RuntimeException.class)
    public void dosomething_이름이_5자리이하면_에러(){
        LongMethod longMethod = new LongMethod();
        longMethod.doSomething(CORRECT_SOCIAL_STRING,"dknlkdsa","24145");
    }

    @Test(expected = RuntimeException.class)
    public void dosomething_이름이_5자리이하이고_숫자가_있으면_에러(){
        LongMethod longMethod = new LongMethod();
        longMethod.doSomething(CORRECT_SOCIAL_STRING,"dknlkdsa","24145");
    }

}
