<div align="center">

# 🌱 Nalla-Nudi 📚
### *Bridging Kannada Learning with English Technical Education*

<img src="https://img.shields.io/badge/Platform-Android-green?style=for-the-badge">
<img src="https://img.shields.io/badge/Language-Kotlin-purple?style=for-the-badge">
<img src="https://img.shields.io/badge/Database-RoomDB-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Offline-Supported-orange?style=for-the-badge">
<img src="https://img.shields.io/badge/UI-Compose-red?style=for-the-badge">
<img src="https://img.shields.io/badge/Architecture-MVVM-yellow?style=for-the-badge">
<img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge">

</div>

---

# 📖 About Nalla-Nudi

Nalla-Nudi is an offline Android educational application designed to help Kannada-medium students transition smoothly into English-medium higher education.

Many rural and regional-language students understand concepts clearly in Kannada but struggle with English technical vocabulary used in:
- Science
- Mathematics
- Commerce
- Computer Science
- Engineering Subjects

Nalla-Nudi acts as a **Bridge Dictionary for Technical Terms** by providing:
- English technical words
- Kannada meanings
- Simple explanations
- Subject-wise learning
- Pronunciation support
- Flashcard-based revision

The application is designed to reduce language barriers and improve confidence in technical learning.

---

# ❗ Problem Statement

Students from Kannada-medium schools often face difficulties while transitioning into English-medium higher education.

Although they understand concepts well, they struggle with technical terms such as:
- Photosynthesis
- Trigonometry
- Algorithm
- Economic Terms
- Scientific Vocabulary

Traditional dictionaries are:
- Too broad
- Difficult for students
- Not subject-specific
- Lacking contextual explanations

This affects:
- Academic confidence
- Technical communication
- Competitive exam preparation
- Career readiness

Nalla-Nudi solves this challenge through an easy-to-use offline educational platform.

---

# 🎯 Vision

Nalla-Nudi serves as a **“Bridge Dictionary for Technical Terms”** focused on helping students during their educational transition phase.

The application helps students:
- Search technical terms instantly
- Learn Kannada explanations easily
- Hear correct pronunciation
- Improve technical communication confidence

The project promotes:
- 🌍 Educational Equality
- 📱 Digital Accessibility
- ❤️ Linguistic Pride
- 🚀 Inclusive Learning

---

# ✨ Features

## 🔍 Instant Technical Word Search
Search technical words and instantly get:
- Kannada meaning
- Simple explanation
- Example usage

Example:
> Gravity → Gurutvakarshane

---

## 📚 Subject-wise Vocabulary
Explore vocabulary based on subjects:
- Science
- Mathematics
- Commerce
- Biology
- Physics
- Computer Science

---

## ⭐ Saved Words List
Bookmark difficult words for:
- Daily revision
- Quick review
- Flashcard learning

---

## 🔊 Pronunciation Support
Hear accurate English pronunciation using Android Text-To-Speech.

---

## 🃏 Flashcard Learning
Interactive flashcards help students memorize technical terms effectively.

---

## 🧠 Quiz System
Students can test their understanding using:
- Vocabulary quizzes
- Subject-wise practice
- Revision exercises

---

## 🌙 Dark Mode Support
Modern dark mode support for:
- Better accessibility
- Reduced eye strain
- Improved UI experience

---

## 🌟 Word of the Day
Daily highlighted technical vocabulary for continuous learning.

---

## 📴 Fully Offline Support
The application works completely offline without internet connectivity.

---

# 🎯 Impact Goals

## 🌍 Equitable Education
Helping Kannada-medium students overcome language barriers in STEM and technical education.

---

## 🚀 Career Readiness
Preparing students for:
- Technical interviews
- Competitive exams
- English-medium academics

---

## ❤️ Linguistic Pride
Encouraging students to learn through their mother tongue while adapting to global technical learning.

---

# 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Kotlin | Android Development |
| Jetpack Compose | UI Development |
| Android Studio | Development IDE |
| Room Database | Local Database |
| SQLite FTS4 | Full Text Search |
| MVVM Architecture | App Structure |
| Material Design 3 | Modern UI Components |
| Text-To-Speech API | Pronunciation Feature |

---

# ⚙️ Technical Implementation

## ✅ Room Full-Text Search (FTS4)

### Files Added
- `TermFts.kt` — FTS4 virtual table entity

### Files Modified
- `TermDao.kt`
- `AppDatabase.kt`
- `TermRepository.kt`

### Features
- Full-text search on English and Kannada words
- Prefix matching support
- Fast ranked suggestions
- Search performance under 100ms
- Automatic fallback for short queries

---

## ✅ Typography & Fonts

### Files Modified
- `Type.kt`

### Features
- Clear typography hierarchy
- Kannada-friendly fonts
- Technical font styling
- Ready for custom fonts integration

---

## ✅ Flashcard UI & Animations

### Features
- Smooth 3D flip animation
- Tap-to-flip gesture
- Progress tracking
- Mark Known system
- Gradient flashcard styling
- Interactive learning experience

---

## ✅ Stability & Bug Fixes

### Improvements
- Fixed transparent detail dialog
- Proper TTS lifecycle management
- Removed deprecated APIs
- Clean imports
- Stable offline performance
- Optimized Compose rendering

---

# 📸 Application Screenshots

---

## 🌟 Splash Screen

<p align="center">
 <img src="https://github.com/user-attachments/assets/d463dfe7-4d81-4c52-94bb-86b6d0bbd686" width="250"/>
</p>

<div align="center">

**Figure 1:** Splash Screen of Nalla-Nudi

</div>

---

## 🏠 Dashboard / Home Screen

<p align="center">
  <img src="https://github.com/user-attachments/assets/34a78310-6404-4491-b906-d1b4bdb50f17" width="250"/>
</p>

<div align="center">

**Figure 2:** Dashboard / Home Screen

</div>

---

## ➗ Mathematics Subject Filter

<p align="center">
  <img src="https://github.com/user-attachments/assets/f571524f-f7e5-4dc7-84e7-aefbe80c8aad" width="250"/>
</p>

<div align="center">

**Figure 3:** Mathematics Vocabulary Screen

</div>

---

## 💼 Commerce Subject Filter

<p align="center">
  <img src="https://github.com/user-attachments/assets/c0d772e7-d5e0-480a-a92e-110e9c3a36f3" width="250"/>
</p>

<div align="center">

**Figure 4:** Commerce Vocabulary Screen

</div>

---

## 🌟 Word of the Day

<p align="center">
  <img src="https://github.com/user-attachments/assets/4440c0c5-b90f-439e-8299-55ba75f5486f" width="450"/>
</p>

<div align="center">

**Figure 5:** Word of the Day Feature

</div>

---

## 🃏 Flashcard Learning

<p align="center">
  <img src="https://github.com/user-attachments/assets/7cdae9b6-016d-4260-a1d6-5ae81b11cc8c" width="250"/>
  <img src="https://github.com/user-attachments/assets/b48d91db-e2fa-4f36-85b2-501bf5025878" width="250"/>
</p>

<div align="center">

**Figure 6:** Flashcard Learning Feature

</div>

---

## 🔊 Pronunciation Feature

<p align="center">
 <img src="https://github.com/user-attachments/assets/1efbc4bf-fd2b-49f9-b006-f8d78e58b6be" width="250"/>
</p>

<div align="center">

**Figure 7:** Pronunciation Support

</div>

---

## 📖 Word Definition Screen

<p align="center">
  <img src="https://github.com/user-attachments/assets/6f6e3fbe-2773-4dd8-bea9-3313fe9352d3" width="250"/>
</p>

<div align="center">

**Figure 8:** Word Definition and Example

</div>

---

## ⭐ Saved Words List

<p align="center">
  <img src="https://github.com/user-attachments/assets/d5ecf3f0-9e11-490e-9a5b-b369b5895157" width="250"/>
</p>

<div align="center">

**Figure 9:** Saved Vocabulary List

</div>

---

## 🧠 Quiz Completion Screen

<p align="center">
  <img src="https://github.com/user-attachments/assets/cee5ccc9-b6de-48a5-b617-3d7bd8b234ca" width="250"/>
</p>

<div align="center">

**Figure 10:** Quiz Completion Screen

</div>

---

## 👤 User Profile Screen

<p align="center">
  <img src="https://github.com/user-attachments/assets/4da41104-9ed0-494c-a127-a9a8d630f4fd" width="250"/>
</p>

<div align="center">

**Figure 11:** User Profile Screen

</div>

---

## 🌙 Dark Mode Interface

<p align="center">
  <img src="https://github.com/user-attachments/assets/050e6212-cabe-43a3-a11b-5b3819ff6208" width="250"/>
  <img src="https://github.com/user-attachments/assets/6017a381-25c7-4978-a56d-3f24068e86e0" width="250"/>
</p>

<div align="center">

**Figure 12:** Dark Mode Interface

</div>

---

# 🚧 Project Status

Nalla-Nudi is currently under active development and enhancement.

The project aims to continuously improve accessibility and technical learning support for Kannada-medium students.

---

# 🔮 Future Enhancements

Planned future improvements include:

- 🌐 Multi-language support
- ☁️ Cloud synchronization
- 🤖 AI-powered personalized learning
- 📊 Student progress tracking
- 🎮 Gamified learning system
- 🧑‍🏫 Teacher dashboard
- 🗣️ Kannada voice search
- 🔔 Daily revision reminders
- 📚 Expanded technical glossary database
- 📱 Tablet-friendly interface
- 🧠 Smart quiz recommendations
- 📈 Learning analytics dashboard

---

# 🚀 Build & Run Instructions

# Nalla-Nudi: Build & Run Instructions

## Overview
**Nalla-Nudi** is an Android app designed to help Kannada-medium students learn technical English vocabulary with Kannada meanings, explanations, and pronunciation guidance.

**Status**: All code compiles successfully. The app is ready to build, install and run on an emulator or Android device.

---

## Quick Start (Windows PowerShell)

### Step 1: Clean Build

```powershell
cd C:\Users\hadiah\AndroidStudioProjects\nelanudi

.\gradlew.bat clean
.\gradlew.bat assembleDebug
```

---

### Step 2: Install on Emulator / Device

```powershell
adb uninstall com.example.nelanudi

.\gradlew.bat installDebug
```

---

### Step 3: Launch the App

- Open emulator/device
- Run the application
- Bottom navigation includes:
  - Home
  - Saved
  - Flashcards

---

# 🧪 Testing the Application

## Home Screen
- Search technical words
- View suggestions
- Open word details
- Save words
- Play pronunciation

---

## Flashcards
- Tap card to flip
- Use pronunciation button
- Mark words as known
- Track progress

---

## Saved Words
- Save important words
- Practice saved flashcards
- Review vocabulary later

---

# ⚙️ Command Summary

## Clean Build

```powershell
.\gradlew.bat clean assembleDebug
```

---

## Install APK

```powershell
.\gradlew.bat installDebug
```

---

## View Logs

```powershell
adb logcat
```

---

# 🧠 Complete Implementation Summary

## Features Implemented

### ✅ Full-Text Search (FTS4)
- Fast SQLite FTS4 search
- Instant ranked suggestions
- Optimized offline search

---

### ✅ Typography System
- Kannada-friendly typography
- Technical font hierarchy
- Readable educational UI

---

### ✅ Flashcard Learning System
- 3D card flip animations
- Progress tracking
- Interactive learning flow

---

### ✅ Stable Offline Architecture
- Room Database integration
- MVVM architecture
- Optimized Compose UI
- Proper lifecycle handling

---

### ✅ Educational Dashboard
- Word of the Day
- Subject filtering
- Recently viewed words
- Modern Bento layout

---

# 📊 App Performance

| Feature | Performance |
|---|---|
| Search Response | < 100ms |
| Offline Support | 100% |
| Database | Room + SQLite FTS4 |
| Terms Loaded | 1000+ |
| UI Framework | Jetpack Compose |

---

# 🤝 Contribution

Contributions are welcome!

To contribute:
1. Fork the repository
2. Create a feature branch
3. Commit changes
4. Push branch
5. Open Pull Request

---

# 📄 License

This project is developed for educational and academic purposes.

---

# 👨‍💻 Developer

## HADIAH TASNEEM

Android Developer | Kotlin Enthusiast | Educational Technology Innovator

---

# 🏁 Conclusion

Nalla-Nudi bridges the gap between regional-language education and English technical learning.

By combining technology with mother-tongue support, the application empowers students to:
- Improve vocabulary
- Build technical confidence
- Learn independently
- Succeed academically without language barriers

---

<div align="center">

## 🌱 “Learning in your mother tongue is the first step toward global knowledge.”

</div>

