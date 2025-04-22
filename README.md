# 🎓 Student ID Card Android App

This is an Android application developed in **Kotlin** that allows users to log in, view existing student ID cards, or create a new digital ID card by entering personal details and uploading an image.

---

## 📱 Features

- 🔐 **Login Screen**: Users enter their **Name**, **Registration Number**, and **Date of Birth** to access the app.
- 🆔 **View ID Card**: Enter a registration number and if it matches pre-defined entries, the app displays a ready-made ID card.
- 🧾 **Create ID Card**: Fill out a form with name, regd. number, branch, phone number, and upload an image to generate a new custom ID card.
- 🖼️ **Image Upload**: Allows users to pick and preview an image from the device gallery.
- 🧭 **Multi-Screen Navigation**: Seamless transitions between login, menu, form, and ID card preview pages.

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Framework**: Android SDK
- **UI Layouts**: ConstraintLayout & GridLayout
- **Image Handling**: `ActivityResultContracts.GetContent()`

---

 ## 🧩 Project Structure
- MainActivity8.kt – Login Page where the user enters their name, registration number, and date of birth.
- MainActivity.kt – Main menu page that appears after login. Offers two options: view ID card or create a new ID card.
- MainActivity2.kt to MainActivity5.kt – Displays predefined ID cards based on specific registration numbers.
- MainActivity6.kt – A form where the user can enter their details (name, regd number, branch, phone) and upload an image to generate an ID card.
- MainActivity7.kt – Displays the newly created ID card using the data provided in MainActivity6.kt.
- **XML Layout Files (in res/layout/)**:
- activity_main8.xml – Layout for the login page.
- activity_main.xml – Layout for the main menu page.
- activity_main2.xml to activity_main5.xml – Layouts for the predefined ID cards.
- activity_main6.xml – Layout for the ID card creation form.
- activity_main7.xml – Layout for displaying the generated ID card.

---
## 🚀 How to Run the App

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
Open the project in Android Studio.
Run the app on an emulator or physical device.
Use the login page to enter credentials, then explore:
Enter Regd No. → View Existing ID
Create ID Card → Fill details & preview your ID

---

🎯 Future Improvements
- Add validation for input fields
- Store and retrieve data using a local database (e.g., Room)
- Use shared preferences for login state
- Export generated ID card as a PDF/image

---

📸 Screenshots

- login page
- ![Screenshot 2025-04-23 001018](https://github.com/user-attachments/assets/124f293d-dee4-4dc7-875d-5a024add3be9)
- Main Menu Page
- ![Screenshot 2025-04-23 001146](https://github.com/user-attachments/assets/01ada176-d041-48b0-80b0-f98d0b1e554c)
- ID Card Sample
- ![Screenshot 2025-04-23 001409](https://github.com/user-attachments/assets/2b47ed9d-3446-4fd2-8f87-3affa96e7008)
- Create ID card Page
- ![Screenshot 2025-04-23 001516](https://github.com/user-attachments/assets/e054689b-496f-4216-9e96-eb18058ee44d)
- Created ID receiver page
- ![Screenshot 2025-04-23 001635](https://github.com/user-attachments/assets/b07afe62-18ea-4b3b-b774-233ede021989)

  ---

This Project uses simple UI for better understanding of the functionalities used in this project.



