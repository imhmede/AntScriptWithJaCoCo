# Code Coverage Testing for QuickSort and BinarySearch

This is a sample Java program designed for a lab assignment involving the integration of JaCoCo for code coverage analysis and JUnit tests for QuickSort and BinarySearch algorithms.

## Project Structure

The project is structured as follows:

- `src/main/sorting/QuickSort.java`: Contains the implementation of the QuickSort algorithm.
- `src/main/sorting/BinarySearch.java`: Contains the implementation of the BinarySearch algorithm.
- `src/test/sorting/CalculatorTest.java`: JUnit test class that verifies the correctness of the QuickSort and BinarySearch programs.
- `lib`: Contains the JAR files for JaCoCo (both agent and Ant tasks), JUnit, and Hamcrest.
- `build.xml`: Ant build script for compiling, testing, and running code coverage analysis.
- `README.md`: This file, containing instructions and additional information.

## Requirements

- **Java JDK**: The program requires Java JDK to compile and run. Make sure you have it installed on your machine.
- **JaCoCo**: Ensure that JaCoCoagent and JaCoCoant JAR files are available in the `lib` directory.
- **JUnit**: Download the JUnit JAR file and place it in the `lib` directory.
- **Hamcrest**: Download the Hamcrest JAR file and place it in the `lib` directory.
- **Apache Ant**: The program is automated using an Ant script, so you need to have Apache Ant installed.
    - Follow the instructions in the [official Apache Ant installation guide](https://ant.apache.org/manual/install.html).
    - For a tutorial on getting started with Apache Ant, check out the [Hello World with Apache Ant guide](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html).

## Usage

### Compiling

To compile all the Java files, run the following command in your terminal:

```bash
ant compile
''''

### Clean and Compile
To clean, compile, and run the program, run the following command in your terminal:
```bash
ant clean compile
''''

### Running Tests
To run the unit tests and code coverage analysis, use the following command in your terminal:
```bash
ant test
''''

### Generating Code Coverage Reports
To generate code coverage reports after running tests, use the following command:
```bash
ant report
''''


