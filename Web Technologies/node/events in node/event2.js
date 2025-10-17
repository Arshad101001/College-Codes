const EventEmiter = require('events');
const eventEmiter = new EventEmiter();

const greet = (name, surname) => {
    console.log(`Hello ${name} ${surname} How is it going...`);
    
}
eventEmiter.on('greet', greet);

eventEmiter.emit('greet','mike', 'tyson');

const one = ()=>{
    console.log('Hey This will be called once.....');
}
eventEmiter.once('one', one);

// eventEmiter.emit('one');
// eventEmiter.emit('one');
// eventEmiter.emit('one');

eventEmiter.removeListener('one', one);
eventEmiter.emit('one');