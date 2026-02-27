'use strict';
var http = require('http');
var port = 8000;

http.createServer(function (req, res){
    console.log(req.method + " " + req.url);
    console.log(req.headers);
    console.log();
    res.writeHead(200, {'content-type' : 'text/plain'});
    res.end('<h1>Headers logged  to console!</h1>\n');
}).listen(port);

console.log('Listening at port' + port);