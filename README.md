# junit-4-5-difference-test
Demonstration of different work [@Before](https://junit.org/junit4/javadoc/4.13.2/index.html?org/junit/Before.html) of JUnit 4 and [@BeforeEach](https://junit.org/junit5/docs/5.9.0/api/org.junit.jupiter.api/org/junit/jupiter/api/BeforeEach.html) of JUnit 5

run command `mvn test` and see output

Important is:

1) In test-junit-4 output:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestChild
before child
test child
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.06 sec
```

2) In test-junit-5 output:

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestChild
test child
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.035 s - in TestChild
```

Note, tht in output of test-junit-4 output we can see a row `before child`, but in output of test-junit-5 this row absent.

This example demonstrates the difference between `@Before` of JUnit 4 and `@BeforeEach` of JUnit 5 in case of inheritance. With JUnit 4 annotation `@Before` working for overriden methode, with JUnit 5 and `@BeforeEach` - not working.
