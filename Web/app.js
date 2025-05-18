// In JavaScript, the keywords const, let, and var are used to 
// declare variables — but they behave differently.
// 1 var , 2. let , 3. const

// 1 ver :
console.log("             var");
    // Introduced in ES5 and earlier
    // Function-scoped (not block-scoped)
    // Can be re-declared and re-assigned
    // Hoisted (moved to the top of their scope)


    var a= 10;
    console.log("a :",a);
    var a= 20;  // no error (re-declaration allowed)
    console.log("a :",a);
    a=30;       // allowed
    console.log("a :",a);

    function test(c){
        if(true){

            var x=5+c;
        }
        console.log("x :",x); //  Works! Because var is function-scoped
    }

    test(5);
    test("hi");
    console.log(typeof test(5));


// 2. let :
console.log("             let");
    // Introduced in ES6 (2015)
    // Block-scoped (limited to { })
    // Can be re-assigned, but not re-declared in the same scope
    // Hoisted but not initialized

    // let a=10;
    // console.log(a);  // Uncaught SyntaxError: Identifier 'a' has already been declared
                    // so you can not use it because at line number 12 you used it 

    let b=10;
    console.log(b);
    b=20;            // Allowed
    console.log(b);
 // let b=30; // Uncaught SyntaxError: Identifier 'a' has already been declared
    
    if (true){
        let y=50;
        console.log(y);
    }
    // console.log(y);  // Uncaught ReferenceError: y is not defined at, so we
                    //  access the out the range { } 


// 3. const :
console.log("             const");
    // Also from ES6
    // Block-scoped
    // Cannot be re-declared or re-assigned
    // Must be initialized when declared

    const c=1;
    console.log(c);
    // c=2;
    // const c=3; //  Assignment to constant variable , if ones the variable is assigned 
        //   than we can't ues it for reassign 

        //  However, if const is used with objects or arrays, the contents can be changed (but not reassigned):

    const user={name : "chethan"};
    console.log(user);
    user.name="chiluveri";
    console.log(user);

// | Keyword | Scope    | Reassignment | Redeclaration | Hoisted | Best Use Case                     |
// | ------- | -------- | ------------ | ------------- | ------- | --------------------------------- |
// | `var`   | Function | ✅ Yes        | ✅ Yes         | ✅ Yes   | Older JS code, function-level     |
// | `let`   | Block    | ✅ Yes        | ❌ No          | ✅ Yes\* | Loops, conditionals, reassignable |
// | `const` | Block    | ❌ No         | ❌ No          | ✅ Yes\* | Constants, objects/arrays         |

// | If...                           | Use     |
// | ------------------------------- | ------- |
// | Variable won't change           | `const` |
// | Variable may change             | `let`   |
// | You're working with old JS code | `var`   |



// Data types

// 1. Primitive 
// 2. Non primitive

        // 1. Primitive 

            // 1.1 String
            // 1.2 Numbers
            // 1.3 Undefiend
            // 1.4 Bool
            // 1.5 Biglnt
            // 1.6 Symbol
            // 1.7 Null


        // 2. Non Primitive 

            // 2.1 TypedArray
            // 2.2 Function
            // 2.3 RegExp
            // 2.4 Array
            // 2.5 Math 
            // 2.6 Date
            // 2.7 Error
            // 2.8 Map
            // 2.9 Set



        // 1. Primitive 
        console.log("                         Primitive"); 
        // 1.1 String
        let message="Hello World";
        console.log(message);
        console.log(typeof message);

        // 1.2 Numbers
        let number = 42;
        console.log(number);
        console.log(typeof number);

        // 1.3 Undefiend
        let notDefined;
        console.log(notDefined);
        console.log(typeof notDefined);


        // 1.4 Bool
        let isTrue=true;
        console.log(isTrue);
        console.log(typeof isTrue);

        // 1.5 Biglnt
        let bigIntValue=900719925124740998n;
        console.log(bigIntValue);
        console.log(typeof bigIntValue);


        // 1.6 Symbol
        let sym=Symbol("javascript");
        console.log(sym);
        console.log(typeof sym);

        // 1.7 Null 
        let empty=null;
        console.log(empty)
        console.log(typeof empty);



// 2. Non Primitive 
console.log("                         Non Primitive ");


    // 2.1 Object 
    console.log("                Object");
    // JavaScript is used to group objects, data, or functions.

        const student= {fristName:"chethan kumar",
                    lastName:"kumar chiluveri",
                    class: 10
                    };
        console.log(student);
        console.log(typeof student);

    // 2.2 Array
        // n JavaScript, an array is used to group data of the same type.
    console.log("                Array");
        const colors=['yellow','pink','blue','white'];
        console.log(colors);
        console.log(typeof colors);
        const students=[
                    {fristName:"chethan",
                    lastName:"chiluveri",
                    class: 10
                    },
                    {fristName:"chethan kumar",
                    lastName:"kumar chiluveri",
                    class: 10
                    }
                    ];
        console.log(students);

    // 2.3 Function
            //In JavaScript, the function is used to define a function.
    console.log("                Function");

            function Hello(){
                console.log("hello, world");
            }
            Hello();
            console.log(typeof Hello);

            function Name(Na){
                return `hello, ${Na}`;
            }
            console.log(Name("Chethan"));

            function Add(num1,num2){
                var ADD=num1+num2;
                console.log(ADD);
            }
            Add(10,20);



    // 2.1 TypedArray
    console.log("                TypeArray");
        // Typed arrays allow you to work with binary data.

        let buffer=new ArrayBuffer(4);
        let view=new Uint8Array(buffer);
        view[0]=255;
        console.log(view);
    // 2.2 Function
        // Functions are first-class objects in JavaScript.
            function greet(name) {
            return `Hello, ${name}`;
            }
            console.log(greet("Chethan")); // Hello, Chethan



    // 2.3 RegExp
    console.log("                RegExp");
        // Used for pattern matching in strings. 
        let pattern = /chethan/i;
        console.log(pattern.test("chethan Kumar")); // true
   
    // 2.4 Array
    console.log("                Array");
        // A list-like object.
        let fruits = ["apple", "banana", "mango"];
        console.log(fruits[1]); // banana

        //Create Arrays
            let fru=['apple','banana','orange'];
            let numb=new Array(5,10,15,20);
            console.log(fru);
            console.log(numb);
        // Length of Array
        console.log(fru.length);
        console.log(numb.length);
        console.log(numb[2]);

        // Access and Update Elements
        numb[1]=11;
        console.log(numb);

        // Add / Remove Elements
        numb.push(25);   // Add at end
        console.log(numb);
        numb.unshift(0); // add at start
        console.log(numb);

        numb.pop();   // remove from end
        console.log(numb);

        numb.shift();   // remove from start
        console.log(numb);
        
        console.log(fruits[1]);    // "banana"
        fruits[1] = "kiwi";        // Update
        console.log(fruits);       // ["apple", "kiwi", "orange"]
        
        // Loop Through Array
            for (let i = 0; i < fruits.length; i++) {
                console.log(fruits[i]);
                }

                // OR using forEach
                fruits.forEach(function(item) {
                console.log(item);
                });

                //  Searching in Array
                let index = fruits.indexOf("orange");  // returns index
                let found = fruits.includes("apple");  // returns true/false
                console.log(index);
                console.log(found);

                // Slice vs Splice

                let colors1 = ["red", "green", "blue", "yellow"];
                console.log(colors1);
                let part = colors1.slice(1, 3);  // ["green", "blue"]
                colors1.splice(2, 1);            // remove 1 item at index 2 => ["red", "green", "yellow"]
                console.log(colors1);
                console.log(part);



    // 2.5 Math 
    // 2.6 Date
    // 2.7 Error
    // 2.8 Map
    // 2.9 Set
