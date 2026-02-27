const http = require('http');
const url = require('url');
const fs = require('fs');
const path = require('path');

const PORT = 3000;

const server = http.createServer((req, res)=>{

    const parsedUrl = url.parse(req.url, true);
    const pathName = parsedUrl.pathname;

    // console.log(req.method);

    if (pathName === '/' && req.method === 'GET') {
        res.writeHead(200, {'content-type': 'text/plain'});
        res.end('Welcome to Node.js HTTP Server');
    }
    else if (pathName === '/create' && req.method === 'POST'){
        const filePath = path.join(__dirname, 'server_file.txt');
        fs.writeFileSync(filePath, 'This file was created by HTTP Server');
        res.writeHead(201, {'content-Type': 'text/plain'});
        res.end('File created Successfully');


    }
    else if(pathName === '/read' && req.method === 'GET'){
        const filepath = path.join(__dirname, 'server_file.txt');
        if (fs.existsSync(filepath)) {
            const fileContent = fs.readFileSync(filepath, 'utf-8');
            res.writeHead(200, {'content-Type': 'text/plain'});
            res.end(`File Content: ${fileContent}`);

        }

        else{
            res.writeHead(404, {'content-Type': 'text/plain'});
            res.end('File not found');
        }
    }
    else if (pathName === '/delete' && req.method === 'DELETE'){
        const filepath = path.join(__dirname, 'server_file.txt');
        if (fs.existsSync(filepath)) {
            fs.unlinkSync(filepath);
            res.writeHead(200, {'content-Type': 'text/plain'});
            res.end(`File deleted successfully`);
        }
        else{
            res.writeHead(404, {'content-Type': 'text/plain'});
            res.end('File not found');
        }
    }
    else{
        res.writeHead(404, {'content-Type': 'text/plain'});
        res.end('Route not found');
    }
    

    // if (req.method == 'GET') {
    //     res.end("Hello from the home page.");
    // }
    // else{
    //     console.log('This is a post method');
    // }
    // console.log(req.method);
    // res.end('This is a Home page')
    
});

server.listen(PORT, ()=> console.log(`Server is running on https://localhost:${PORT}`))

// To run this code start the server and in second terminal run below code 
// curl.exe -X POST http://localhost:3000/create
