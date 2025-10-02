# Digital Addiction Test - Java Application

### 📋 Project Overview
A **Java console application** that evaluates **digital addiction levels** through a behavioral questionnaire. The program assesses smartphone usage patterns and provides personalized feedback based on user responses.

---

### 🎯 Features

#### Core Functionality
* **10-Question Survey:** Comprehensive assessment of digital device usage habits.
* **Score-Based Evaluation:** Automatic categorization into **5 addiction levels**.
* **Personalized Feedback:** Tailored advice based on individual results.

#### Extended Features
* **User Personalization (Extension a):** Name-based greeting and customized results.
* **Repeat Survey Option (Extension b):** Multiple consecutive assessments.
* **Usage Statistics (Extension c):** Track total users and addiction rate percentages.
* **Deep Dive Analysis (Extension d):** Daily smartphone usage percentage calculation for **extreme cases**.
* **Summary Report (Extension e):** Comprehensive result overview with all answers and recommendations.

---

### 📊 Assessment Criteria

#### Survey Questions
1.  The last thing I do before turning off the lights at night is quickly check if I have received any messages, etc. on my smartphone.
2.  The first thing I do when I turn on the lights in the morning is check my smartphone for messages, etc.
3.  I have notifications (that make a sound or vibrate) activated on my smartphone.
4.  When I notice that a notification has come in on my smartphone, I check my smartphone within a minute to see what it is.
5.  While watching a TV series or movie on TV or my computer screen, I use my smartphone one or more times.
6.  When I eat alone (breakfast/lunch/dinner), I use my smartphone several times during the meal.
7.  When I eat in company—family, friends, etc. (breakfast/lunch/dinner)—I use my smartphone several times during the meal.
8.  When I am waiting (for a bus, train, tram, a friend, etc.), I use my smartphone.
9.  When walking alone on the street, I do so with my smartphone in my hand and regularly look at the screen.
10. When I'm cycling or driving, I sometimes pick up my smartphone and look at the screen.

#### Scoring Matrix
| Yes Count | Addiction Level | Feedback Message |
| :-------- | :-------------- | :--------------- |
| **0** | **Not Addicted** | You are not digitally addicted. Keep it up! |
| **1-2** | **Mild** | You have a mild form of digital addiction. |
| **3-5** | **Moderate** | You have a form of digital addiction that should not be underestimated. Set some limits for yourself. |
| **6-8** | **Severe** | You have a severe form of digital addiction. Consider taking a digital detox course! |
| **9-10** | **Extreme** | You have an extreme form of digital addiction. You probably need professional help! |

#### Additional Analysis (Extreme Cases)
For users scoring **9-10**, the program calculates daily smartphone usage percentage:

| Usage % | Warning Level | Message |
| :------ | :------------ | :------ |
| **> 80%** | **Critical** | Your addiction is a danger to yourself and those around you. Seek help as soon as possible!! |
| **20-80%** | **High** | We advise you to seek professional help. |
| **< 20%** | **Inconsistent** | Strange, are you sure you filled in the survey honestly? Be honest with yourself! |

---

### 🛠️ Technical Requirements

* **Language:** Java
* **IDE:** IntelliJ IDEA
* **Concepts Used:**
    * `Scanner` for user input
    * Conditional statements (`if-else`)
    * Loops (`for` for survey questions and repeat functionality)
    * Variables and data types
    * String manipulation
    * Arrays (for storing questions and answers)
    * Percentage calculations