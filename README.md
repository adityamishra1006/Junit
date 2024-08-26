### JUnit and Maven Notes

#### **JUnit Overview**
   - JUnit is a widely used testing framework in Java that allows developers to write and run repeatable tests. It is an open-source framework primarily used for unit testing Java applications.
   - **Key Points**:
     - JUnit is an essential part of test-driven development (TDD).
     - It provides annotations to identify test methods and various assertions to test expected results.
   - **Syntax and Explanation**:
     - Basic test method:
       ```java
       @Test
       public void testMethod() {
           // code to test
           assertEquals(expected, actual);
       }
       ```
   - **Example**:
     ```java
     import org.junit.Test;
     import static org.junit.Assert.assertEquals;

     public class CalculatorTest {
         @Test
         public void testAdd() {
             Calculator calc = new Calculator();
             assertEquals(5, calc.add(2, 3));
         }
     }
     ```
   - **Explanation of Code**:
     - `@Test`: Marks the method as a test method.
     - `assertEquals`: Checks whether the expected result matches the actual result.

#### **Maven Overview**
   - Maven is a build automation tool used primarily for Java projects. It manages project dependencies, builds, and documentation from a central repository.
   - **Key Points**:
     - Maven uses `pom.xml` to manage project dependencies.
     - It simplifies project build lifecycle and dependency management.
   - **Syntax and Explanation**:
     - Basic `pom.xml` structure:
       ```xml
       <project xmlns="http://maven.apache.org/POM/4.0.0">
           <modelVersion>4.0.0</modelVersion>
           <groupId>com.example</groupId>
           <artifactId>my-app</artifactId>
           <version>1.0-SNAPSHOT</version>
       </project>
       ```
   - **Example**:
     - A `pom.xml` file with dependencies:
       ```xml
       <dependencies>
           <dependency>
               <groupId>junit</groupId>
               <artifactId>junit</artifactId>
               <version>4.13.2</version>
               <scope>test</scope>
           </dependency>
       </dependencies>
       ```
   - **Explanation of Code**:
     - `<groupId>`, `<artifactId>`, `<version>`: Identifies the project uniquely.
     - `<dependencies>`: Section to add project dependencies.

#### **Installation of Maven**
   - Maven can be installed on your system to manage Java projects.
   - **Steps**:
     1. **Download Maven**: Go to the official Apache Maven website and download the latest version.
     2. **Extract and Install**:
        - Extract the downloaded archive to your desired directory.
        - Set the `MAVEN_HOME` environment variable to point to the Maven directory.
        - Add the `bin` directory to the `PATH` variable.
     3. **Verify Installation**: Open a terminal and type `mvn -v` to verify Maven is installed correctly.
   - **Key Points**:
     - Ensure Java is installed before setting up Maven.
     - Update environment variables as per your operating system.

#### **Difference Between JUnit 4 and JUnit 5**
   - JUnit 5 is the latest version and offers more flexibility and new features compared to JUnit 4.
   - **Key Points**:
     - **Architecture**: JUnit 5 is composed of three sub-projects: JUnit Platform, JUnit Jupiter, and JUnit Vintage.
     - **Annotations**: `@BeforeAll`, `@BeforeEach`, `@AfterAll`, `@AfterEach` are used in JUnit 5, whereas JUnit 4 uses `@Before` and `@After`.
     - **Assertions and Assumptions**: JUnit 5 has more robust and readable assertions.
   - **Example**:
     - **JUnit 4**:
       ```java
       @Before
       public void init() { }
       @Test
       public void testMethod() { }
       ```
     - **JUnit 5**:
       ```java
       @BeforeEach
       void init() { }
       @Test
       void testMethod() { }
       ```

#### **Methods Used to Test Java Code Using JUnit**
   - JUnit provides various annotations and methods to write and manage test cases.
   - **Key Methods**:
     - `assertEquals(expected, actual)`
     - `assertTrue(condition)`
     - `assertFalse(condition)`
     - `assertNull(object)`
     - `assertNotNull(object)`
   - **Example**:
     ```java
     @Test
     void testDivision() {
         int result = divide(10, 2);
         assertEquals(5, result);
     }
     ```
   - **Explanation of Code**:
     - Testing basic arithmetic functions using assertions.

#### **How to Test a Maven Project Using JUnit**
   - Maven can be integrated with JUnit to automate the testing process.
   - **Steps**:
     1. **Add JUnit Dependency**: Add the JUnit dependency in the `pom.xml`.
     2. **Create Test Cases**: Write test cases in the `src/test/java` directory.
     3. **Run Tests**: Use the `mvn test` command to run the tests.
   - **Example**:
     - **pom.xml** dependency:
       ```xml
       <dependency>
           <groupId>org.junit.jupiter</groupId>
           <artifactId>junit-jupiter-api</artifactId>
           <version>5.9.0</version>
           <scope>test</scope>
       </dependency>
       ```
     - **Run Tests**: Execute `mvn test` in the terminal.
   - **Explanation of Code**:
     - Maven automatically compiles and runs tests based on the configuration in `pom.xml`.

#### **How to Test a Java Project Using JUnit**
   - Java projects can be tested using JUnit by setting up the necessary classes and methods.
   - **Steps**:
     1. **Add JUnit to Classpath**: Ensure JUnit JARs are added to the classpath.
     2. **Create Test Class**: Write a class with test methods annotated with `@Test`.
     3. **Run Tests**: Use an IDE or command line to run the test cases.
   - **Example**:
     ```java
     public class CalculatorTest {
         @Test
         public void testAdd() {
             assertEquals(4, calculator.add(2, 2));
         }
     }
     ```
   - **Explanation of Code**:
     - Use of assertions to validate expected outcomes in the project.

#### **Dependencies in Maven Projects and How to Insert Them**
   - **Explanation**: Maven uses dependencies to include external libraries in your project.
   - **Steps to Add Dependencies**:
     1. **Locate Dependency**: Find the required dependency from the Maven repository.
     2. **Add to `pom.xml`**: Insert the dependency under the `<dependencies>` section.
   - **Example**:
     - **pom.xml** entry:
       ```xml
       <dependency>
           <groupId>org.apache.commons</groupId>
           <artifactId>commons-lang3</artifactId>
           <version>3.12.0</version>
       </dependency>
       ```
   - **Explanation of Code**:
     - Maven will automatically download and include the specified dependency in your project.

### JUnit Annotations Explained

JUnit provides several annotations that help manage the lifecycle of tests and enhance the testing process. Below is an explanation of the key annotations used in JUnit:

#### 1. **@Test**
   - **Explanation**: Marks a method as a test method. The method annotated with `@Test` is executed as a test case.
   - **Example**:
     ```java
     @Test
     public void testAddition() {
         int sum = calculator.add(2, 3);
         assertEquals(5, sum);
     }
     ```
   - **Details**:
     - This is the most basic and widely used annotation in JUnit.
     - The method should be `public` and return `void`.
     - Any exceptions thrown by the method are reported as test failures.

#### 2. **@BeforeEach**
   - **Explanation**: Annotates a method to be run before each test case in the class. It is used for setting up common test data or initializing resources.
   - **Example**:
     ```java
     @BeforeEach
     void setUp() {
         calculator = new Calculator();
     }
     ```
   - **Details**:
     - Replaces the `@Before` annotation from JUnit 4.
     - Helps in avoiding code duplication by setting up the test environment.

#### 3. **@AfterEach**
   - **Explanation**: Annotates a method to be run after each test case in the class. It is typically used for cleanup, like closing connections or freeing resources.
   - **Example**:
     ```java
     @AfterEach
     void tearDown() {
         calculator = null;
     }
     ```
   - **Details**:
     - Replaces the `@After` annotation from JUnit 4.
     - Ensures that resources are properly released after each test case.

#### 4. **@BeforeAll**
   - **Explanation**: Annotates a method that is run once before all tests in the class. It is used for initializing resources that are expensive to set up and need to be shared across all tests.
   - **Example**:
     ```java
     @BeforeAll
     static void init() {
         databaseConnection = Database.connect();
     }
     ```
   - **Details**:
     - Replaces the `@BeforeClass` annotation from JUnit 4.
     - The method must be `static` and is executed only once before any test methods in the class.

#### 5. **@AfterAll**
   - **Explanation**: Annotates a method that is run once after all tests in the class have been executed. It is used for tearing down shared resources.
   - **Example**:
     ```java
     @AfterAll
     static void cleanUp() {
         databaseConnection.close();
     }
     ```
   - **Details**:
     - Replaces the `@AfterClass` annotation from JUnit 4.
     - The method must be `static` and is executed only once after all test methods in the class.

#### 6. **@Disabled**
   - **Explanation**: Disables a test method or an entire test class, preventing it from being executed.
   - **Example**:
     ```java
     @Test
     @Disabled("Not implemented yet")
     void testFutureFeature() {
         // test code
     }
     ```
   - **Details**:
     - Useful for temporarily disabling tests that are not yet ready or require further setup.
     - The reason for disabling can be specified in the annotation.

#### 7. **@ParameterizedTest**
   - **Explanation**: Used to run a test multiple times with different parameters.
   - **Example**:
     ```java
     @ParameterizedTest
     @ValueSource(strings = { "racecar", "radar", "level" })
     void testPalindrome(String word) {
         assertTrue(isPalindrome(word));
     }
     ```
   - **Details**:
     - Allows for running the same test logic with various inputs.
     - Supports various sources of parameters like `@ValueSource`, `@MethodSource`, `@CsvSource`, etc.

#### 8. **@RepeatedTest**
   - **Explanation**: Marks a method to be run multiple times in a row.
   - **Example**:
     ```java
     @RepeatedTest(5)
     void testFiveTimes() {
         assertEquals(2, calculator.add(1, 1));
     }
     ```
   - **Details**:
     - Useful for stress testing or verifying consistent behavior across multiple runs.

#### 9. **@Tag**
   - **Explanation**: Used to filter test methods by a tag.
   - **Example**:
     ```java
     @Test
     @Tag("slow")
     void testSlowMethod() {
         // slow test code
     }
     ```
   - **Details**:
     - Helps in categorizing tests and running only a specific group of tests.

#### 10. **@DisplayName**
   - **Explanation**: Provides a custom display name for a test method or test class.
   - **Example**:
     ```java
     @Test
     @DisplayName("Test addition of two numbers")
     void testAddition() {
         assertEquals(2, calculator.add(1, 1));
     }
     ```
   - **Details**:
     - Makes test output more readable and meaningful.

#### 11. **@TestInstance**
   - **Explanation**: Controls the lifecycle of the test instance. It allows configuring whether a new instance is created for each test method or shared across all test methods.
   - **Example**:
     ```java
     @TestInstance(TestInstance.Lifecycle.PER_CLASS)
     class MyTestClass {
         // Test methods
     }
     ```
   - **Details**:
     - Can be used to optimize resource usage by sharing a single test instance across multiple methods.

These annotations provide powerful capabilities to manage the test lifecycle, structure tests logically, and improve code readability and maintainability.
