// array3.js(Array.map)

function User(id, name, point) {
    this.name = name;
    this.id = id;
    this.point = point;
};

const users = [
    new User('user1', '사용자1', 91),
    new User('user2', '사용자2', 92),
    new User('user3', '사용자3', 93),
    new User('user4', '사용자3', 94)
];
console.log(users);

const newUsers = users.map(function (val, ind, ary) {
    let newObj = {}
    newObj.uid = val.id;
    newObj.uname = val.name;
    newObj.score = val.point;
    newObj.idx = ind;

    return newObj;
    // return val.id + '-' + ind;
});
console.log(newUsers);

const filterUsers = newUsers.filter(function (val, ind) {
    return val.idx; //  true or false
}); //return 참
console.clear();
console.log(filterUsers);

// let resultAry = [];
// let sum = filterUsers.reduce(function (prevObj, curObj, ind, ary) {
//     // console.log(prevObj, curObj.score);
//     console.log(prevObj, curObj);
//     let result = prevObj + curObj.score;
//     return prevObj + curObj.score;
// }, 0); //초기값(첫시작 prevObj)
// console.log(`합계: ${sum}`);

let sum = filterUsers.reduce(function (initVal, obj, ind, ary) {
    // if(ind != 0) {
    //     console.log(initVal[ind].uid, initVal[ind].uname, initVal[ind].score);
    // }
    console.log(initVal, obj, ind);
    initVal.push(obj);
    return initVal;
}, []); // 참조값... a=3, a={}
console.log(sum);

let sum2 = function sum(num1, num2) {
    return num1 + num2;
}

// sum2 = (num1, num2) => {
//     return num1, num2;
// }

sum2 = (num1, num2) => num1 + num2;

let trueOrFalse = [45, 4, 9, 16, 25].every(function (val, ind, ary) {
    return val > 10;
});
console.log(trueOrFalse);

trueOrFalse = [45, 4, 9, 16, 25].some(function (val, ind, ary) {
    return val > 10;
});
console.log(trueOrFalse);

const fruits = ['Apple', 'Orange', 'Apple', 'Mango'];
console.log(fruits.indexOf('Apple', 1));
console.log(fruits.lastIndexOf('Apple'));
console.log(fruits.includes('Apple'));
console.log(fruits.find(function (val, ind, ary) {
    return val == 'Apple';
}));

console.log(Array.from('ABCD'));
console.log('A,B,C,D'.split(","));

console.log(fruits.keys());

for (let x of fruits.keys()) {
    console.log(x);
}

let user1 = new User('user1', '사용자1', 90);
// console.log(user1.keys);
for (let x of user1.keys()) {
    console.log(x);
}