#!/bin/bash

# Find and delete any existing *Client$.class files
find . -name "*Client\$.class" -delete

# Compile the Java client code with extra error checking
javac -Xlint:all Client.java
if [ $? -ne 0 ]; then
    echo "Error compiling Client.java"
    exit 1
fi

# Run the Java client
java Client
