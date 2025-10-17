// Demonstrating Basic File operation in Node.js

const fs = require('fs');
const path = require('path');

// Define the file path
const filepath = path.join(__dirname, 'exampleexample.txt');


// create and write to a file
fs.writeFileSync(filepath, 'This is a Demonstration of basic file operation in Node.js');
console.log('File created and written successfully');

// read the file
const fileContent = fs.readFileSync(filepath, 'utf-8');
console.log('File content: ', fileContent);

// Append data to the file 
fs.appendFileSync(filepath, '\nAppending some more content to the file');
console.log('Content appended to the file');

// Reading the updated file
const updatedContent = fs.readFileSync(filepath, 'utf-8');
console.log('Updated file content ', updatedContent);

// Renaming the file
const newFilePath = path.join(__dirname, 'rename_example.txt');
fs.renameSync(filepath, newFilePath);
console.log('File renamed to rename_example.txt ');

// Delete the file 

// fs.unlinkSync(newFilePath);
// console.log('File deleted succesfully');
// console.log('File Handling operations completed');





