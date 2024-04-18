#!/bin/bash

# Directory where the server code is located
SERVER_DIR="server"

# Change directory to where the server code is located
cd "$SERVER_DIR" || { echo "Error: Could not change directory to $SERVER_DIR"; exit 1; }

# Compile server.c with error handling
gcc -Wall -Wextra -o server server.c || { echo "Error compiling server.c"; exit 1; }

