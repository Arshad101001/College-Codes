const func = ()=>{
    console.log('This is a simple function');
    
}

function greet(name){
    console.log(`Hello ${name}`);
}

function add(a, b) {
    return 'Addition is ' + (a+b);
}

function child(){
    console.log("This is a child function");
    
}

function parent(){
    console.log("This is parent function");
    child();
}

greet('Raaj')
func();
parent();
const val = add(3,2);
console.log(val);
console.log();


