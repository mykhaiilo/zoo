package zoom;

import org.testng.Assert;
import org.testng.annotations.Test;
import zoom.Lesson1.UsefulProgram.Tax;
import zoom.Lesson1.WrappersAutoboxingUnboxing;

class TestLesson1 {
    @Test()
public void testWrapper(){
        WrappersAutoboxingUnboxing wrappersAutoboxingUnboxing = new WrappersAutoboxingUnboxing();
        Assert.assertEquals(12,wrappersAutoboxingUnboxing.i);

    }
    @Test()
    public void testTax(){
        Tax tax =new Tax();
        Assert.assertEquals(234.55,tax.calcTax());
    }
}



