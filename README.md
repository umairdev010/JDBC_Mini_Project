# 🎓 Student Database Management System

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white)

**A sleek and efficient student management system built with Java and PostgreSQL**

[Features](#-features) • [Installation](#-installation) • [Usage](#-usage) • [Database Schema](#-database-schema) • [Contributing](#-contributing)

</div>

---

## 📋 Overview

A lightweight, command-line student database management system that demonstrates the power of JDBC (Java Database Connectivity) with PostgreSQL. This project provides full CRUD (Create, Read, Update, Delete) operations for managing student records efficiently.

## ✨ Features

- 🎯 **Add Students** - Register new students with ID, name, and marks
- 📝 **Update Records** - Modify student marks by name
- 🗑️ **Delete Students** - Remove student records from the database
- 📊 **View All Students** - Display complete list of all registered students
- 🔒 **Prepared Statements** - SQL injection protection built-in
- 🎨 **Clean Architecture** - Well-organized code with separation of concerns

## 🏗️ Project Structure

```
src/org/practice/umair/
├── ConnectDB.java      # Database connection handler
├── DBoperations.java   # CRUD operations implementation
├── Main.java           # CLI interface and user interaction
├── SQLqueries.java     # SQL query constants
└── Students.java       # Student entity model
```

## 🚀 Installation

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **PostgreSQL** 12 or higher
- **PostgreSQL JDBC Driver** (included in dependencies)

### Setup Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/student-database-management.git
   cd student-database-management
   ```

2. **Create PostgreSQL Database**
   ```sql
   CREATE DATABASE testing;
   ```

3. **Create Students Table**
   ```sql
   CREATE TABLE students (
       id INT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       marks INT NOT NULL
   );
   ```

4. **Configure Database Connection**

   Update the credentials in `ConnectDB.java`:
   ```java
   String url = "jdbc:postgresql://localhost:5432/testing";
   String user = "your_username";
   String password = "your_password";
   ```

5. **Add PostgreSQL JDBC Driver**

   Download from [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/download/) and add to your classpath.

6. **Compile and Run**
   ```bash
   javac -d bin src/org/practice/umair/*.java
   java -cp bin org.practice.umair.Main
   ```

## 💻 Usage

### Main Menu

When you run the application, you'll see:

```
WELLCOME TO DATABASE MANAGEMENT OF STUDENTS SELECT FROM THE FOLLOWING TO PERFORM OPERATION

1. Add Student  2. Updated Student  3. Delete Student  4. Get All Students
Enter the choice: _
```

### Operations

#### 1️⃣ Add a New Student
```
Enter the choice: 1
ENTER THE ID: 101
ENTER THE NAME: John
ENTER THE MARKS: 85
```

#### 2️⃣ Update Student Marks
```
Enter the choice: 2
PLEASE ENTER THE NAME OF STUDENT: John
PLEASE ENTER MARKS TO UPDATE: 92
```

#### 3️⃣ Delete a Student
```
Enter the choice: 3
PLEASE ENTER A NAME TO DELETE STUDENT: John
```

#### 4️⃣ View All Students
```
Enter the choice: 4
[ id = 101 name = Alice marks = 88 ]
[ id = 102 name = Bob marks = 75 ]
[ id = 103 name = Charlie marks = 92 ]
```

## 🗄️ Database Schema

| Column | Type    | Constraints    |
|--------|---------|----------------|
| id     | INT     | PRIMARY KEY    |
| name   | VARCHAR | NOT NULL       |
| marks  | INT     | NOT NULL       |

## 🏛️ Architecture

### Class Descriptions

| Class | Responsibility |
|-------|----------------|
| **ConnectDB** | Manages PostgreSQL database connections using JDBC |
| **DBoperations** | Implements all CRUD operations with prepared statements |
| **Students** | Entity model representing student data |
| **SQLqueries** | Centralized storage for all SQL query strings |
| **Main** | Command-line interface for user interaction |

### Key Design Patterns

- 🎯 **Singleton Pattern** - Database connection management
- 📦 **DAO Pattern** - Data Access Object for database operations
- 🏗️ **MVC-inspired** - Separation of data, logic, and presentation

## 🔒 Security Features

- ✅ Prepared statements prevent SQL injection attacks
- ✅ Exception handling for database errors
- ✅ Connection management with proper resource handling

## 🛠️ Technologies Used

- **Language:** Java
- **Database:** PostgreSQL
- **API:** JDBC (Java Database Connectivity)
- **Architecture:** Layered Architecture

## 📈 Future Enhancements

- [ ] Add input validation and error handling
- [ ] Implement search functionality
- [ ] Add pagination for large datasets
- [ ] Create a graphical user interface (GUI)
- [ ] Add authentication and authorization
- [ ] Implement logging functionality
- [ ] Add unit tests with JUnit
- [ ] Support for bulk operations

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Umair**

- GitHub: [@yourusername](https://github.com/yourusername)

## 🙏 Acknowledgments

- PostgreSQL community for excellent database documentation
- Oracle for JDBC specifications and driver support

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

Made with ❤️ by Umair

</div>