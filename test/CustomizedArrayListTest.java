import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomizedArrayListTest {
  private CustomizedArraylist customizedArraylist;
   private int[] array;


    @BeforeEach
   void setUp(){
      customizedArraylist = new CustomizedArraylist();
       array = new int[10];
   }
   @Test void testThatClassExist(){
        assertNotNull(customizedArraylist);
        assertNotNull(array);
   }
   @Test void testAddMethod(){

       int addElementToArray = customizedArraylist.add(array, 2);

      assertEquals(array[0]= 2,addElementToArray);
   }

}
