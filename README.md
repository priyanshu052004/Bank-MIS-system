
# Bank Management System (MIS)

A web-based **Bank Management System** built using **MVC architecture** and **JSP**, connected to a **PostgreSQL** database. The system runs locally on **Apache Tomcat** to manage customer accounts, transactions, and generate MIS reports. It supports secure login, account operations, and MIS reporting for efficient bank management.

## 📌 Features

- **Secure Login:** Separate authentication for customers and admin.  
- **Account Management:** Create, update, and delete accounts.  
- **Transactions:** Deposit, withdrawal, and transfer money.  
- **Balance Inquiry:** Check account balances in real-time.  
- **MIS Reporting:** Generate reports for account activities and transactions.  

## 🛠️ Technologies Used

- **Frontend:** JSP, HTML, CSS  
- **Backend:** Java (MVC Pattern)  
- **Server:** Apache Tomcat (local)  
- **Database:** PostgreSQL  

## ⚙️ Setup Instructions (Local)

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/priyanshu052004/Bank-MIS-system.git
   ```

2. **Database Setup:**
   - Create a new PostgreSQL database:
     ```sql
     CREATE DATABASE bank_mis;
     ```
   - Import the provided SQL schema for tables and relationships.

3. **Run Locally with Tomcat:**
   - Open the project in your IDE (e.g., Eclipse).  
   - Configure the project with the Apache Tomcat server.  
   - Run the project locally via Tomcat.
