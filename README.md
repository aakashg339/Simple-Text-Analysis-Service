# Simple-Text-Analysis-Service
Simple Text Analysis Service done as part of learning spring framework. The below assignment text was generated using Google gemini.

# 📝 Simple Text Analysis Service Project

## 🎯 Project Goal
This project is designed to solidify your understanding of **Spring Context (Non-Boot)**, **Dependency Injection (DI)**, **Inversion of Control (IoC)**, **Maven**, and **JUnit** by implementing a basic text processing service. The focus is on manually configuring and using the Spring Container.

## 🛠️ Required Technologies & Concepts
* **Java** (Core Language)
* **Maven** (Build Tool)
* **Spring Context** (DI, IoC, @Component, @Configuration, @Value, @Autowired, @Qualifier)
* **JUnit** (Unit Testing Framework, @Test, @Before)

---

## ✅ Implementation Requirements & Scoring (100 Points Total)

You will earn points for successfully implementing and demonstrating the required concepts.

### I. Core Application Logic (40 Points)

| Requirement | Concept Focus | Points |
| :--- | :--- | :--- |
| **1. `TextProcessor` Interface** | Define an interface with a simple method, e.g., `process(String text)`. | 5 |
| **2. `WordCounterService` Class** | Implement the `TextProcessor` interface. Annotate the class with **`@Component`**. The `process` method must count and return the total number of words in the input text. | 10 |
| **3. `AnalysisConfig` Class** | Create a class annotated with **`@Configuration`**. Use the **`@Value`** annotation to inject a constant string (e.g., a stop word or a configurable parameter). | 15 |
| **4. Application Loader** | In the `main` method, manually load the Spring Container using **`AnnotationConfigApplicationContext`** and provide the `AnalysisConfig.class` to load the beans. | 10 |

---

### II. Dependency Injection & Wiring (30 Points)

Focus on connecting different components using Spring's IoC mechanism.

| Requirement | Concept Focus | Points |
| :--- | :--- | :--- |
| **5. Client Injection** | Create a `TextAnalysisClient` class. Use **`@Autowired`** to inject the `WordCounterService` bean into this client. Call the service method from a client method. | 15 |
| **6. Qualifier Practice** | Create a second, empty implementation of the `TextProcessor` interface (e.g., `CharacterCounterService`). Then, ensure the `TextAnalysisClient` successfully injects the **`WordCounterService`** using the **`@Qualifier`** annotation. | 15 |

---

### III. Testing with JUnit (30 Points)

Write unit tests to verify the functionality of your services.

| Requirement | Concept Focus | Points |
| :--- | :--- | :--- |
| **7. Basic Test Setup** | Ensure Maven dependencies for JUnit are correctly configured and a `WordCounterServiceTest` class is created. | 5 |
| **8. Primary Test Case** | Write one method annotated with **`@Test`** that tests the `WordCounterService` with a known input sentence and uses JUnit assertions (e.g., `assertEquals`) to verify the correct word count is returned. | 15 |
| **9. Lifecycle Practice** | Use the **`@Before`** or **`@BeforeEach`** annotation to initialize a shared resource (like the input text string or the service instance) before the test case runs. | 10 |

---

**Total Possible Score: 100 Points**