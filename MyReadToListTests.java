package MyReadToListTests;

import org.junit.jupiter.api.TestInstance;

import Entitys.Man;
import MyReadToList.MyReadToList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

/**
 * Testing the MyReadFromCsvToList
 * @author enikeili
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MyReadToListTests
{
    private MyReadToList rtl;
    private List<Man> list = new ArrayList<>();
    @BeforeEach
    public void set_up()
    {
        rtl = new MyReadToList("C:\\Users\\Jeldar\\eclipse-workspace\\jlab4\\src\\main\\resources\\foreign_names.csv",';',list);
    }
    /**
     * Checks readFromCSVToList() method, checked, isn't a element of list
     */
    @Test
    void isNotEmptyElementTest()
    {
    	rtl.readFromCSVToList();
        boolean flag = true;
        for (int i = 0; i < rtl.getMans().size(); i++)
        {
            if(!rtl.getMans().get(i).isEmpty())
                flag = false;
        }
        assertTrue(flag);
    }

}
