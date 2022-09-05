package testapp.services;

import testapp.data.Test;

import java.util.List;

public interface TestService {
    List<Test> getAllTests();
    Test getTestById(int id);
    void creatTest(Test test);
}
