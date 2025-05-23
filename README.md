# 🔐 File Encryptor Web Application

A clean and intuitive **Java Servlet-based web application** to encrypt or decrypt `.txt` files using a basic Caesar cipher. Designed with a responsive UI using HTML, CSS, and Java Servlets (Jakarta EE), this app enables users to securely transform text files through a simple web interface.

---

## 🚀 Features

- Upload any `.txt` file to **encrypt or decrypt** its contents.
- Basic **Caesar cipher implementation** for lightweight encryption.
- Automatically displays the result in a formatted textarea.
- Fully responsive and modern UI using custom CSS.
- Built with Jakarta Servlets (Jakarta EE 10+) and deployed on Tomcat.
- Preserves line breaks and avoids control character corruption.

---

## 🛠️ Requirements

- **Java JDK** 11 or higher  
- **Apache Tomcat** 10.x (Jakarta EE 9+ compatible)  
- **Eclipse IDE** or any Java IDE supporting Dynamic Web Projects  
- **Jakarta Servlet API** version 6.0.0  
- Modern **Web Browser** for interaction  

---

## 📁 Project Structure

File_EncryptionDecryption/

├── `.classpath`  
├── `.project`  
├── `.settings/`  
│   └── `org.eclipse.jdt.core.prefs`  
├── `src/`  
│   └── `main/`  
│       └── `java/`  
│            └── `com/`  
│                └── `example/`  
│                     └── `FileEncryptorServlet.java`  
├── `WebContent/`  
│   ├── `index.html`  
│   ├── `result.jsp`  
│   ├── `css/`  
│   │   └── `style.css`  
│   └── `WEB-INF/`  
│       ├── `web.xml`  
│       └── `lib/` *(optional)*  
└── `README.md`  

---

## 🌐 How It Works

1. User visits the **index.html** page and uploads a text file.  
2. Selects an operation: **Encrypt** or **Decrypt**.  
3. The form submits the file to `FileEncryptorServlet`.  
4. The servlet reads the file, processes it using Caesar cipher, and forwards the result to `result.jsp`.  
5. The user sees the output in a styled textarea with a button to return and try again.

---

## 🎨 UI Snapshot (Design Overview)

- Glassmorphism-style container with soft shadows and transparency.  
- Gradient blue background with white text.  
- Styled file input and buttons with hover effects.  
- Responsive layout suitable for desktops and tablets.  
- Consistent font and padding for professional appearance.

---

## ▶️ Running the Project

1. Import the project into **Eclipse** as a Dynamic Web Project.  
2. Configure **Apache Tomcat 10+** as the server runtime.  
3. Build and deploy the project to Tomcat.  
4. Open a browser and visit:  
   `http://localhost:8080/FileEncryptor/`  
5. Upload a `.txt` file and choose to encrypt or decrypt it.

---

## 🧪 Example Usage

| Input File Content                         | Operation | Result Output                            |
|-------------------------------------------|-----------|-------------------------------------------|
| `MyEmailPass = qwerty123`                 | Encrypt   | `PbHpdloSdvv#=#tzhuwb456`                 |
| `BankAccount = P@ssW0rd!`                 | Encrypt   | `EdqnDffrxqw#=#S@vvZ3ug$`                 |
| Encrypted string from above               | Decrypt   | Returns to original plain text format     |
| Empty or invalid file                     | Any       | Returns error or blank result             |

---

## 🙋‍♀️ Author

Developed by **Rohini363**  
GitHub: [Check Git Repo](https://github.com/Rohini363/FileEncryptionDecryption)
