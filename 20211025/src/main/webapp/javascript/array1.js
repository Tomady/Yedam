//array1.js
const persons = [];

function addFnc() {
    let addBtn = document.getElementById('add');
    console.log(addBtn.value);

    // persons.push(addBtn.value);  //마지막 요소 추가
    persons.unshift(addBtn.value); //첫번째 요소 추가
    console.log(persons);
}

function remFnc() {
    // persons.pop();  //마지막 요소 삭제
    // persons.shift();    //첫번째 요소 삭제
    let findVal = document.getElementById('add').value;
    let i = 0;

    for (i = 0; i < persons.length; i++) {
        if (persons[i] === findVal) {
            break;
        }
    }

    persons.splice(i, 1);
    console.log(persons);
}

document.write('<input type="text" id="add" value="hong">');
document.write('<button onclick="addFnc()">추가</button>');
document.write('<button onclick="remFnc()">삭제</button>');

const ary = ['hong', 'hwang'];
console.log(ary[0]);
ary[0] = 'hong1';
ary[1] = 'hwang1';
ary[2] = 'park';
ary[ary.length] = 'kim';
ary[4] = 'choi';
ary[ary.length] = 'lee';
ary.push('new');
ary.push('new2');

// delete ary[3];
// ary.pop();
// ary.splice(3, 2, 'new park', 'new kim', 'new lee');

// for (let i = 0; i<ary.length; i++) {
//     console.log(ary[i]);
// }

console.log('------------');

for(let val of ary) {
    console.log(val);
}

const newAry = ary.slice(1, 2); // slice(include, exclued)
console.log(newAry);

const mergeAry = ary.concat(newAry);

mergeAry.sort();
mergeAry.reverse();
console.log(mergeAry);

const numbers = [2, 10, 100, 24, 4];
numbers.sort( function (f, l) {
    return f - l;
});
console.log(numbers);

const s1 = {
    name: 'hwang',
    score: 70
}
const s2 = {
    name: 'park',
    score: 80
}
const s3 = {
    name: 'choi',
    score: 90
}
const students = [s1, s2, s3];
students.sort(function (f, l) {
    if(f.score < l.score) {
        return -100;
    } else {
        return 1;
    }
    
});

console.log(students);