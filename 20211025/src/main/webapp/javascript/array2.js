// array2.js
const numbers = [3, 34, 28, 12, 5];

let sum = 0;

numbers.forEach(function (val, ind, ary) {
    // console.log(val, ind, ary);
    // if(val > 10) {
    //     sum = sum + val;
    // }
    document.write(`<h1>${val}</h1>`);
});

console.log(`합계: ${sum}`);

document.write('<button onclick="createList()">생성</button>');
document.write('<div id="show"></div>');

function createList() {
    let fruits = ['Apple', 'Banana', 'Cherry'];
    let ulTag, liTag;

    ulTag = document.createElement('ul');   //<ul></ul>
    console.log(ulTag);

    for(let fruit of fruits) {
        liTag = document.createElement('li');   //<li></li>
        liTag.innerHTML = fruit;  // <li>Apple</li>
        liTag.id = fruit.toLowerCase();
        liTag.setAttribute('class', fruit);
        ulTag.appendChild(liTag);
    }

    // liTag = document.createElement('li');   //<li></li>
    // liTag.innerHTML = 'Apple';  // <li>Apple</li>
    // liTag.id = 'apple';
    // ulTag.appendChild(liTag);   // <ul><li>Apple</li></ul>

    // liTag = document.createElement('li');
    // liTag.innerHTML = 'Banana';
    // liTag.id = 'banana';
    // ulTag.appendChild(liTag);

    // liTag = document.createElement('li');
    // liTag.innerHTML = 'Cherry';
    // liTag.id = 'cherry';
    // ulTag.appendChild(liTag);

    document.getElementById('show').appendChild(ulTag);

    console.log(ulTag);
}

function User(id, name, point) {
    this.name = name;
    this.id = id;
    this.point = point;
};

const users = [
    new User('user1', '사용자1', 90), 
    new User('user2', '사용자2', 90),
    new User('user3', '사용자3', 90)
];
console.log(users);
let str;

function showList() {
    str = '<h1>회원리스트</h1>';
    str = str + '<table border="1">';
    str = str + '<tbody>';
    users.forEach(callBackFnc);
    str = str + '</tbody>';
    str = str + '</table>';
    
    document.write(str);
}


function callBackFnc(val, ind, ary) {
    str = str + '<tr><td>' + val.id + '</td><td>' + val.name + '</td><td>' + val.point + '</td></tr>';
}