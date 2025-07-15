# 🔐 Spring Security OTP (One-Time Password) Email Verification System

A Spring Boot web application that allows users to verify their email via a One-Time Password (OTP) sent through Gmail SMTP. This project demonstrates how to integrate Java Mail, Spring MVC, Thymeleaf, and OTP generation into a simple and secure workflow.

---

## ✨ Features

### 👤 User Flow
- User enters their **email** and submits the form.
- System generates a **6-digit OTP** and sends it to the user's email.
- User then enters the OTP to validate.
- If the OTP matches, a success message is shown; otherwise, the user is prompted to re-enter the OTP.

### 📧 Email Integration
- Uses `JavaMailSender` with Gmail SMTP (`smtp.gmail.com`) to send OTP emails.
- OTP is dynamically generated and included in the email body.

### 💻 Frontend (Thymeleaf + Tailwind CSS)
- Clean and responsive UI using Tailwind (via CDN).
- `form.html` → Email input page  
- `validate.html` → OTP entry page  
- `result.html` → Final result page

### 🛠 Backend
- OTP generated using Java `Random` class.
- OTP temporarily stored in memory (for demo).
- Email logic implemented using Spring Boot Mail.
- Controller handles `/send` and `/verify`.

---

## 🧠 Technologies Used

| Category     | Tech Stack                            |
|--------------|----------------------------------------|
| Language     | Java 17                                |
| Framework    | Spring Boot 3.5.3                      |
| Frontend     | HTML, Thymeleaf, Tailwind CSS          |
| Database     | MySQL (via Spring Data JPA)            |
| Email        | Spring Boot Mail (SMTP)                |
| Build Tool   | Maven                                  |

---

## 📸 Screenshots

- Email Entry Page:  

<img width="1920" height="846" alt="Screenshot (512)" src="https://github.com/user-attachments/assets/71a43a74-b899-4448-a11b-1118df0c9d3b" />

---

- OTP Validation Page: 

<img width="1920" height="840" alt="Screenshot (513)" src="https://github.com/user-attachments/assets/28e2ff83-5024-4543-9482-377f244c8d47" />

---

- Result Page: 

<img width="1920" height="852" alt="Screenshot (514)" src="https://github.com/user-attachments/assets/3e2cfce0-3714-4a08-a7ff-8faa915ea0f1" />

---

## 📦 Maven Dependencies

| Dependency                     | Purpose / Usage                                           |
|--------------------------------|-----------------------------------------------------------|
| `spring-boot-starter-web`      | Build web applications and REST APIs                      |
| `spring-boot-starter-data-jpa` | ORM support using Hibernate & JPA                         |
| `spring-boot-starter-mail`     | Send emails using JavaMail (for OTP delivery)             |
| `spring-boot-starter-thymeleaf`| Server-side HTML rendering using Thymeleaf                |
| `mysql-connector-j`            | Connect to MySQL database                                 |
| `spring-boot-devtools`         | Developer tools like auto-restart and live reload         |
| `spring-boot-starter-test`     | Includes testing tools like JUnit, Mockito, Spring Test   |

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Project
```bash
git clone https://github.com/your-username/SpringSecurityOTP.git
cd SpringSecurityOTP
```

### 2️⃣ Configure Your Database & Email

---

## ✅ OTP Logic

- OTP generated using:

```
String otp = String.format("%06d", new Random().nextInt(999999));

```
- Sent via email using Spring's JavaMailSender.

- OTP validation compares input with stored value in memory (simple prototype).
