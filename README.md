# Selenium TestNG Automation Framework Template

This is a demo project that serves as a reference template for creating new test automation projects using Selenium WebDriver with TestNG.

## Project Structure

```
├── src
│   └── test
│       ├── java
│       │   └── com.example.selenium
│       │       ├── DriverManager.java        # WebDriver initialization and management
│       │       ├── listeners                 # TestNG listeners
│       │       │   ├── TestListener.java     # Test execution logging
│       │       │   └── ScreenshotListener.java # Screenshot capture on test events
│       │       └── utilities                 # Utility classes
│       └── resources
│           └── testng.xml                    # TestNG configuration
├── build.gradle                              # Gradle build configuration
└── README.md
```

## Features

- Selenium WebDriver integration
- TestNG test framework
- Chrome browser automation
- Screenshot capture on test failure
- Logging implementation
- Gradle build system
- Cross-platform support

## Prerequisites

- JDK 11 or higher
- Gradle 7.x or higher
- Chrome browser
- Git

## Setup Instructions

### Windows

1. Clone the repository:
```bash
git clone https://github.com/yourusername/AppScripAutomationAssignment.git
cd AppScripAutomationAssignment
```

2. Set JAVA_HOME environment variable:
   - Right-click on 'This PC' > Properties > Advanced System Settings
   - Click 'Environment Variables'
   - Add new System Variable:
     - Variable name: JAVA_HOME
     - Variable value: Path to your JDK (e.g., C:\Program Files\Java\jdk-11)

3. Build the project:
```bash
gradlew.bat clean build
```

4. Run tests:
```bash
gradlew.bat test
```
Or

```bash
gradlew.bat clean test
```

### Linux/macOS

1. Clone the repository:
```bash
git clone https://github.com/yourusername/AppScripAutomationAssignment.git
cd AppScripAutomationAssignment
```

2. Set JAVA_HOME environment variable:
```bash
export JAVA_HOME=/path/to/your/jdk
export PATH=$JAVA_HOME/bin:$PATH
```

3. Make gradlew executable:
```bash
chmod +x gradlew
```

4. Build the project:
```bash
./gradlew clean build
```

5. Run tests:
```bash
./gradlew test
```
Or

```bash
gradlew.bat clean test
```

## Test Execution

The project includes a sample test case (TestCase01.java) that:
1. Opens Google search
2. Searches for "Open AI"
3. Verifies search results
4. Captures screenshots

Test results and logs can be found in:
- Test reports: `build/reports/tests/test/index.html`
- Screenshots: `build/screenshots/`
- Logs: Console output with SLF4J

## Configuration

- TestNG configuration: `src/test/resources/testng.xml`
- Build configuration: `build.gradle`
- Browser options: `DriverManager.java`

## Best Practices Demonstrated

- Page Object Model structure
- Centralized WebDriver management
- Test listeners for logging and screenshots
- Proper exception handling
- Gradle dependency management
- Cross-platform compatibility

## Using as Template

1. Fork this repository
2. Modify package names and configurations
3. Add your page objects
4. Create your test cases
5. Update testng.xml with your test classes

## Notes

- This is a demo project intended as a reference
- Chrome browser is required
- Internet connection needed for dependencies
- Gradle will download required dependencies automatically
