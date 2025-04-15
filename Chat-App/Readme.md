# Real-time Chat Application with Spring Boot and WebSocket

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Java Version](https://img.shields.io/badge/Java-21-green)](https://www.oracle.com/java/technologies/javase-jdk21-archive-downloads.html)
[![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-3.4.2-orange)](https://spring.io/projects/spring-boot)

This project is a simple real-time chat application built using **Spring Boot** for the backend and **WebSocket** for real-time communication. It demonstrates how to build a modern chat application with user presence notifications and message broadcasting using STOMP over WebSocket. The frontend is built with HTML, CSS, and JavaScript, utilizing SockJS for WebSocket fallback and STOMP JS for simplifying WebSocket interactions.

## Features

- **Real-Time Chat:**  Instantaneous message delivery using WebSocket for a seamless chat experience.
- **User Status:**  Real-time notifications when users join or leave the chat, enhancing user interaction and awareness.
- **STOMP Protocol:** Utilizes the Simple Text Oriented Messaging Protocol (STOMP) for efficient and structured message routing over WebSocket.
- **SockJS Fallback:**  Ensures broad browser compatibility by falling back to SockJS for browsers that do not natively support WebSocket.
- **Simple and Clean UI:**  An intuitive and straightforward user interface built with static HTML, CSS, and JavaScript for ease of use.
- ** легкий в развертывании **Backend:**  Developed with Java and Spring Boot, providing a robust and scalable backend.
- **Frontend:**  Utilizes standard web technologies (HTML, CSS, JavaScript) along with SockJS and STOMP JS for a rich interactive frontend.

## Technologies

### Backend
- [Java](https://www.oracle.com/java/) - Programming language
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications
- [Spring WebSocket](https://spring.io/projects/spring-websockets) - Module for WebSocket support in Spring
- [Spring Messaging](https://spring.io/projects/spring-messaging) - Module for messaging support in Spring

### Frontend
- [HTML](https://developer.mozilla.org/en-US/docs/Web/HTML) - Markup language for creating web pages
- [CSS](https://developer.mozilla.org/en-US/docs/Web/CSS) - Stylesheet language for describing the presentation of web pages
- [JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript) - Programming language for web interactivity
- [SockJS](https://github.com/sockjs/sockjs-client) - JavaScript library for WebSocket emulation
- [STOMP JS](https://stomp-js.github.io/stomp-websocket/index.html) - JavaScript client for STOMP

### Build Tool
- [Maven](https://maven.apache.org/) - Build automation tool (using Maven Wrapper for project consistency)

## Prerequisites

Before you begin, ensure you have the following installed:

- **[Java JDK 21](https://www.oracle.com/java/technologies/javase-jdk21-archive-downloads.html):**  This application requires Java 21 or higher to run.
- **[Maven](https://maven.apache.org/download.cgi):** While not strictly necessary if you use the Maven Wrapper (`mvnw` or `mvnw.cmd`), having Maven installed can be useful.

## Installation

Follow these steps to set up the project locally:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Ansh2099/chat-app.git
   cd chat-app
   ```
   
2. **Make the Maven Wrapper executable (for Unix/Linux/Mac):**

   ```bash
   chmod +x mvnw
   ```

## Running the Application

You can start the application using the Maven Wrapper. Choose the command based on your operating system:

- **For Unix/Linux/Mac:**

  ```bash
  ./mvnw spring-boot:run
  ```

- **For Windows:**

  ```cmd
  mvnw.cmd spring-boot:run
  ```

Once the application is running, you can access it in your web browser at:

[http://localhost:8080](http://localhost:8080)

You will be greeted with a simple interface to enter your username and join the chat room.


## Contributing

Contributions are welcome! Please feel free to fork the repository and submit pull requests for any improvements or bug fixes.

## License

This project is licensed under the [Apache License 2.0](https://opensource.org/licenses/Apache-2.0). See the [LICENSE](LICENSE) file for more information.

---

**Let's Chat!** 💬