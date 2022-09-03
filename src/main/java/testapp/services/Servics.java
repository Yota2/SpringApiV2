package testapp.services;

import org.springframework.stereotype.Service;
import testapp.data.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class Servics {
   private List<Test> tests = Arrays.asList(
           new Test(1,"East",true),
           new Test(2,"Elephant",false),
           new Test(3,"Elion",true));

public List<Test> getAllservics(){
    return tests;
}}





