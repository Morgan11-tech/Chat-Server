### DATE : April 16,2024
### Course: Operating Systems 

# Chat Server Project

Welcome to the Chat Server project! This project aims to provide a simple chat application that can be hosted on local platforms.

## Overview
The chat server allows multiple clients to connect and communicate with each other in real-time. It supports features such as group chatting, chatting with autocompleted sentences and games for friendly interaction.

## How to Host the Application
To host the chat server application, follow these steps:

1. Clone this repository to your local machine.
2. Install the necessary dependencies (e.g. Java Swing, libswingx, Socket.IO). (These can be referred from the **Libraries.txt** that has been added to the source codes. )
3. Navigate to the project directory.
4. Run the server application.
5. Access the chat client interface by running it in the command line. 

### Hosting Options:
Local Server: Host the server application on your local machine.

### Concepts that were used from Operating system class
1. **Threading** : The thread was used to handle incoming messages from the different clients concurrently. Thus continuous reading from the server in a separate thread. Additionally , it was used in updating the clients list as they get connected to the server.
2. **Socket Programming** : This was used to estabkish communication between the server and multiple clients over a network.
3. **File system** : Clients can upload files to the server and download files from it. When a file is uploaded, the server saves it to the file system. Subsequently, when requested for download, the server reads it from the file system and sends it to the client. File input and output were also implemented to ensure fast and convenient read and write operations.

4. **Memory Allocation** :Dynamic memory allocation was an essential aspect of the codebase, enabling the creation and management of data structures and resources needed for network communication, file handling, and graphical user interface components.
5. **Command-line terminal** : Most of the compilation of the code deal with usig the bash or command line to run and test.
6. **Multithreading**: For the Java client code, the concept of multithreading was employed, allowing a process to have multiple threads executing concurrently within the same address space.
7. **I/O Operations**: Reading and writing to the socket were achieved using the input and output streams. These streams facilitate the exchange of messages and data between the server and the clients.
8. **Concurrency**: When managing multiple clients, the concept of "concurrency" was implemented using threads. Each thread typically managed its own client, enabling the server to handle multiple clients simultaneously without becoming bloated or interrupting the handling of other clients.

9. **Error Handling**:  Error handling was done to address potential exceptions that may occur during socket operations, such as socket binding errors (BindException) or I/O errors (IOException). This ensures proper recovery from errors and enhances the robustness of the server application.
## Video Demo
Watch this [Link to YouTube video](https://youtu.be/l1rD1msnnJU)
 for a detailed explanation of how the chat server system works.

## Contributors
- Jacinta Esi Amoawah Badu 
- Nana Kofi Morgan Sarpong

HOW TO COMPILE THE CODES
## For the server 
gcc -Wall -Wextra -Werror -O2 -pthread server.c -o server

The **'02'** can be adjusted based on how you want to improve performance and optimization.

 ## For the clients 
javac -Xlint Client.java

 ## Running the code
 ### For the server
 ./server

 ### For the clients
 java client


 ### For the swingx
1. Go to project structure
2. Add it as project structure

**NOTE:** All neccessary packages has to be downloaded before one can fully run the code.
