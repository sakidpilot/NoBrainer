# OPSC7312 POE - KRSS
___

# No Brainer Quiz App
___

## Table of Contents

- Overview
- Features
- Installation
- Usage
- Technologies Used](#technologies-used
- Release Notes - Version 2.0]
- Links
___

## Project Overview

The No Brainer Quiz App is an Android Studio-based entertainment application that allows users to engage in quizzes, create custom quiz sets, and earn points that can be redeemed for hints in other quiz sets. The app includes classic games, such as Snake, a user manual, a leaderboard, and user profiles. It uses Firebase Realtime Database for data persistence and user authentication, with SQLite for local data storage and REST API integration for on-demand access to the user manual.

Technologies Used:
- Android Studio was used to create this project.
- Language: Kotlin
- Minimum SDK:  API 24: Android Studio Iguana
- Firebase Database Technologies :Data storage and user authentication

Extra Features:
- Hint: User can pay 5 tokens for a hint while playing the quiz.
- Create your own quiz: User can create, play and delete their own personal quiz. 
- Other Game: User can play other games on the No brainer app. Currently user can play the snake game.
- Chat AI: Users can interact with an in-app chat AI to ask questions or learn more about quizzes.
- Leaderboard: Displays user rankings based on points from completed quizzes.
___
## GitHub and CI/CD Integration

All code is version-controlled with GitHub, using GitHub Actions to automate testing and deployment. CI/CD pipelines ensure smooth integration and deployment, with the REST API hosted on Azure Web App Services for scalability and high availability. Workflows in GitHub verify code integrity, and the CI/CD pipeline enables reliable updates to the live environment without downtime.
___

## Installation

1. Clone the repository: `https://github.com/sakidpilot/NoBrainer`
2. Install the dependencies
3. Youtube Link to assist in installations and cloning: [Video Tutorial](https://www.youtube.com/watch?v=JSwRqOZo2Y8)
___

## How to install and run the project
The project can be opened and run using Android Studio. Be sure that the project is saved and downloaded. To open and run, open the Android Studio application, and click on “open project”. A window will open where you can choose the project you want to open. In this case that would be “st_NoBrainerQuizApp”, locate this folder and once you have found it, click on its name, and then click “OK” at the bottom of the window. The project will then open itself in android studio.

To run this application, you must have an emulator connected or an android device that runs on a minimum SDK of 24, especially for using Firebase. You can connect this project to your emulator by using the default device on android studio, optional you can add a new device. You may also USB debug by using the developer's options on any related android device.

To run this project- after connecting to your emulator, simply click the green play button that has the word “Run” next to it, this is toward the top right at the screen. Once you have clicked this button the application will open on your emulator.
___

## Usage

Once the app is running, users can log in, create gaming profiles, play quizzes, access bonus games (like Snake), view the leaderboard, interact with the chat AI, and access the user manual via the REST API.

## Login Page

![image0](https://github.com/user-attachments/assets/011ae6b7-acc9-46ef-9803-d3d4bf134dbe)
The login page offers users multiple convenient options for authentication. Existing users can log in by entering their credentials, while new users can easily register for an account. For faster and more secure access, users can also choose Single Sign-On (SSO) via their Gmail accounts. Additionally, biometric login options—such as fingerprint, Face ID, or device passcode (depending on device capability)—are available for added convenience. If a user forgets their password, they can reset it by clicking the "Forgot Password" button. All login data, including authentication details, is securely stored and managed using Firebase, ensuring data integrity and security throughout the process.

## Sign Up Page

![image1](https://github.com/user-attachments/assets/2d100943-2fd3-4bc1-9bf8-aedb24814c1c)
The sign-up page is a simple form where users enter their name, email, and password. After filling in the required information, they can click the "Sign Up" button to create an account and become a user on the No Brainer app.

## Create Gaming Profile

![image2](https://github.com/user-attachments/assets/2b87394c-4ca1-4135-95e5-d6ce270ffc90)
New users can create their gaming profile by entering their username, bio, gender, and age. Based on the selected gender, users will receive a pre-set avatar: male users will get a Mario avatar, while female users will receive a Peach avatar. If the user already has a profile, they can click the "Skip" button to bypass this step. Once the profile creation is complete, the user will be redirected to the gaming home page.

## Gaming Home Page

![image3](https://github.com/user-attachments/assets/6bf482d6-91fe-4a28-954e-cf3c5eef86d8)
When a new user is created, they will automatically receive 50 tokens. Users have the option to play quizzes in various categories, create their own quizzes, play other games, and use the chat AI (which will be introduced in part 3).
## Quizies

![image4](https://github.com/user-attachments/assets/e7fb856e-bd16-467d-b526-fb4d602e35a3)
Once a user selects a quiz category, the quiz begins with a timer to encourage timely completion. A progress bar displays the user’s advancement through the quiz. If a user is unsure of an answer, they can spend 5 tokens to receive a hint. Users who score above 75% on the quiz will earn token rewards. Quiz questions are dynamically retrieved from a REST API, while a selection of quizzes is available offline for users to enjoy without internet access.

## Creating Your Own Quiz 

![image5](https://github.com/user-attachments/assets/6666a85a-4856-48ee-81d5-8b78eb49d425)
Create Your Own Quiz: Users can create their own personalized quiz by entering a category or title, their questions, four answer options, and the correct answer for each question. Users can create up to 10 questions, and once they are satisfied with the content, they can click "Save Quiz." This information will be saved in an SQLite database.

## Viewing Your Own Quiz

![image6](https://github.com/user-attachments/assets/83b8aaa8-0efd-49be-9917-56d01590ef65)
When users click on "My Quiz," they can view the quizzes they have created. The recyclable view will display the quiz title/category, the number of questions in the quiz, and the quiz score. Users also have the option to delete a quiz if they no longer want it.

## Playing Your Own Quiz

![image7](https://github.com/user-attachments/assets/8faf9b08-0b8d-4e05-9248-d13e6bab1857)
 Once users click on the quiz they want to play, the information stored in the SQL database will be retrieved and displayed in a quiz format. If the user selects the correct answer, the answer box will appear green. If the answer is incorrect, the selected answer box will turn red, and the correct answer box will be in green.
 
## Playing Other Games

![image9](https://github.com/user-attachments/assets/18e9d93f-0a65-4dd6-85fc-a67e590ed85c)
Users can click on "Other Games" on the gaming homepage and will be redirected to a page where they can play various games. Currently, the only available game in this application is the Snake game. To play, users must click the "Play the Snake Game" button.

## The Snake Game

![image10](https://github.com/user-attachments/assets/25ebfa50-d4d1-4757-968a-88e067bf5de5)
Users can play this classic game from their childhood by clicking on the "Start" button. The objective is to guide the snake to eat the apples and grow as long as possible without hitting the barriers. Users have the option to pause the game or start a new game. When the snake dies, users can either play again or exit the game.

## Viewing Profile Page

![image11](https://github.com/user-attachments/assets/f0f34911-3fb1-4814-a217-1aa0475dd518)
Users can click on the profile icon and will be redirected to a page where they can view their profile information.

## Setting Page

![image12](https://github.com/user-attachments/assets/5bb2e937-409a-4035-b09c-f6dae71df2c5)
Users can click on the settings icon in the bottom navigation bar and will be redirected to the settings page. On this page, users have the ability to edit their profile, toggle between change their languages from either english or zulu. Additionally, a list of offline features will be available. Users can also access the user manual or log out of the app entirely.

## Edit Gaming Profile 

![image13](https://github.com/user-attachments/assets/51d9d1fc-9d70-4378-92e5-63e2ab7eeda2)
On this page, users can fully edit their gaming profile, and the updated profile will be saved to the SQL database. All the new information will be displayed correctly throughout the app.

## User Manual 

![image14](https://github.com/user-attachments/assets/8fceea89-c987-42ef-9496-b298ab240ca8)
When users click on the user manual, they can view a description of the No Brainer app and how it works. The user manual is retrieved from the REST API.

## Learder board 
At the bottom of the navigation bar is a trophy icon. Once users click on it, they will be directed to the leaderboard page.

![image](https://github.com/user-attachments/assets/dea71a78-2347-4414-8ec4-78a5d765c099)


## Chat bot 
Used to assist users at any time of the quizz.

![image](https://github.com/user-attachments/assets/ef39e129-70f5-4dea-88ad-2d351af5634b)

___

## Release Notes - Version 2.0
Since the initial prototype, the No Brainer Quiz app has undergone significant updates, introducing several innovative features:

## 1. Leaderboard Integration:
   The app now includes a real-time leaderboard to display top scores, adding a competitive edge for users as they can track and compare their quiz achievements.

## 2. Biometric Login:
   For enhanced security and convenience, users can log in with biometric authentication, making the login process faster and more secure. User can either their figure print, face id or password depending on what their device supports.

## 3. Offline Mode:
   Users can now play quizzes offline, either from a preloaded set of quizzes or by creating their own. Offline functionality is managed using SQLite, ensuring users have access to the app even without internet connectivity.

## 4. Real-Time and Firebase Notifications:
   The app supports real-time notifications, including Firebase notifications, to keep users engaged and informed of important updates or new quizzes.

## 5. Multi-Language Support:
   The app includes language options for both English and Zulu, allowing users to select their preferred language.

## 6. AI Chat Assistance:
   An AI-powered chat feature is available for users to ask questions or seek help, enhancing the interactive experience within the app.


These added features create a more interactive, accessible, and secure experience for users, reinforcing No Brainer Quiz as an engaging and versatile app for quiz enthusiasts.

If there is any uncertainty, below lies a link to a demonstration video on how to use the application, and another video explaining the tech stack employed in the application development.

[No Brainer App Presentation Video] https://youtu.be/PdSOy-fq764


[No Brainer App, DB, REST API tech stack Presentation Video] https://youtu.be/KJf483xnhF4 

___


## Team

Khatija Essa, Ravelle Balraj, Sherel Davaraj, Sahil Parduman

Contact: st10198310@gmail.com

Thank you :)
