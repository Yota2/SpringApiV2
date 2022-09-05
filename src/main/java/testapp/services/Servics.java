package testapp.services;

import org.springframework.stereotype.Service;
import testapp.data.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class Servics {
   private List<Test> testss = new ArrayList<>(Arrays.asList(
           new Test(1,"East",true),
           new Test(2,"Elephant",false),
           new Test(3,"Elion",true)));

public List<Test> getAllservics(){
    return testss;
}
public Test getTestById(String  test){
    return testss.stream().filter(t->t.getTest().equals(test)).findFirst().get();
    //if we need to use to filter by Id or int
  // return ( tests.stream().filter(t ->t.toString().equals(id)).findFirst().get());
}

    public void addTest(Test test) {
    testss.add(test);
    }

    public void updateTest(String test, Test tests) {
    for (int i = 0; i<testss.size();i++){
        Test t = testss.get(i);
        if(t.getTest().equals(test)){
            testss.set(i, tests);
            return;
        }
    }
    }
/*public void addTest(Test test){
    tests.add(test);
}
 */
}





