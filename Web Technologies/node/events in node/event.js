const { error } = require('console');
const EventEmitter = require('events');
const eventEmitter = new EventEmitter();

// Registering listener for events
eventEmitter.on('greet', (name) => {
    console.log(`Hello, ${name}`);
    
});

eventEmitter.on('data_received', ()=> {
    console.log('Data has been successfully recieved');
    
});

// Registering a one-time listener

eventEmitter.once('start', ()=>{
    console.log('Application has started');
    
});

eventEmitter.emit('start');
eventEmitter.emit('greet', 'Alice');
eventEmitter.emit('greet', 'Bob');
eventEmitter.emit('data_received');
eventEmitter.emit('data_received');

// Demonstrating remove listener method

const farewell = (name)=>{
    console.log(`Goodbye, ${name}`);
};

eventEmitter.on('farewell', farewell);
eventEmitter.emit('farewell', 'Alice');

// Removing listener for farewell

eventEmitter.removeListener('farewell', farewell);

eventEmitter.emit('farewell', 'Alice');

// Error handling in events

eventEmitter.on('error', (err)=>{
    console.error('An error has been occured', err.message);
    
});

// Emitting an error event

try{
    eventEmitter.emit('error', new error('Something went wrong'));
}
catch(err){
    console.error('Unhandled  error', err.message)
}

console.log('Node.js Event demonstration completed');
