#!/bin/bash
userinput=""
read -p "Enter the hyperlink of the text file you want to search: " userinput
printf "\nYou have typed: $userinput\n"
dataObject=$(wget $userinput)
echo dataObject