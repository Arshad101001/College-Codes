// write an event emitter code to design an event called calculate salary which is used to calculate the salary of an employee by passing some arguments such as hra basic salary and TA DA

const EventEmitter = require('events');
const eventEmitter = new EventEmitter();

eventEmitter.on('calculateSalary', (salary, hra, ta,da)=>{
    console.log(`Total salary is ${salary + hra + ta + da}`);
});

eventEmitter.emit('calculateSalary', 15000, 5000, 1000, 3000);

// String operation
eventEmitter.on('string', (first, last)=>{
    console.log(`Name in upper case is ${first.toUpperCase()}`);
    console.log(`Name in lower case is ${first.toLowerCase()}`);
    console.log(`Concatenation is  ${first.concat(last)}`);

})

eventEmitter.emit('string', 'akshata', 'shejwal');

