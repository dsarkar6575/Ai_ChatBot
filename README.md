# AI Chatbot Application

This project is an AI-powered chatbot application built using **Spring Boot** and **WebFlux** for the backend, and **React** with **Bootstrap** for the frontend.

## Features
- **Reactive API** using Spring WebFlux
- **AI-powered chatbot functionality**
- **Asynchronous communication**
- **Frontend UI built with React and Bootstrap**

## Technologies Used
### Backend
- Java
- Spring Boot
- Spring WebFlux
- Lombok

### Frontend
- React
- Bootstrap
- JavaScript/TypeScript

## Installation
### Prerequisites
- JDK 17+
- Node.js (for frontend)
- Maven

### Backend Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/dsarkar6575/Ai_ChatBot.git

   cd Ai_ChatBot
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory:
   ```sh
   cd ai-chat-frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the React development:
   ```sh
   npm run dev
   ```

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/chat` | Sends a message to the chatbot and gets a response |




