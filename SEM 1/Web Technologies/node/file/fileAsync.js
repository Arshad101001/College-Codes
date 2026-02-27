const fs = require('fs');

// creating and writing into the file
// fs.writeFile('sample.txt', 'This is sample text.', ()=>{console.log("Some error has been occured.")});

fs.writeFile('sample.txt', 'Hello, this is some content for my new file.' , (err) => {
    if (err) {
        console.error('Error creating file:', err);
    }
});
console.log('File Created and written successfully.');

// reading file
const content = fs.readFile('sample.txt', 'utf-8', (err) => {
    if (err) {
        console.error('Error while reading file:', err);
    }
});
console.log('Content of the file is ', content);

// appending file

fs.appendFile('sample.txt', '\nThis is a new line in the file', (err)=>{
    if(err){
        console.log('Error while appending file');
    }
})

// reading file after appending
const result = fs.readFile('sample.txt', 'utf-8', (err) => {
    if (err) {
        console.error('Error while reading file:', err);
    }
});
console.log('Content of the file is ', result);

// renaming the file
fs.rename('sample.txt', 'renamed_sample.txt', (err)=>{
    if (err) {
        console.log('Error while renaming the file.');
    }
});
console.log('File renamed Successfully.');

// deleting the file
fs.unlink('renamed_sample.txt', (err) => {
    if (err) {
        console.log('Error while deleting the file.');
    }
});
console.log('File Deleted Successfully.');
