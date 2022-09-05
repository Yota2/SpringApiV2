package testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testapp.data.Test;
import testapp.services.Servics;

import java.util.Arrays;
import java.util.List;


@RestController
public class HelloControler {
    @RequestMapping("/hello")
    public String returnHI() {
        return "Huhu";
    }

    @RequestMapping("/")
    public String returnHello() {
        return "Hello";
    }

    @RestController
    public class serviceController {
        @Autowired
        private Servics servics;

        @RequestMapping("/services")
        public List<Test> getAllServics(){
            return servics.getAllservics();
        }
        //Getting by single  Input by String Name Mapping By Id
        @RequestMapping("/services/{test}")
       public Test getByTestId (@PathVariable String  test){
            return servics.getTestById(test);
       }
       //Posting request
       @RequestMapping(method=RequestMethod.POST, value="/services")
       public void addTest(@RequestBody Test test ){
         servics.addTest(test);
       }

        //Updating  request
        @RequestMapping(method=RequestMethod.PUT, value="/services/{test}")
        public void updateTest(@RequestBody Test tests  , @PathVariable String  test){
            servics.updateTest(test , tests);
        }
        //deleting request
        @RequestMapping(method=RequestMethod.DELETE, value="/services/{test}")
        public void deletingTest(@RequestBody Test tests  , @PathVariable String  test){
            servics.deletTest(test , tests);
        }
    }

    }