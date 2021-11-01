//func4.js

const persons = [{
    name: '이바다',
    eng: 80,
    math: 90,
    grade: 'A'
}, {
    name: '김영오',
    eng: 85,
    math: 90,
    grade: 'A+'
}, {
    name: '오재준',
    eng: 90,
    math: 80,
    grade: 'A'
}];

function makeTr(persons) {
    // let str = '<tr>'

    // str = str + '<td>' + persons.name + '</td>';
    // str = str + '<td>' + persons.eng + '</td>';
    // str = str + '<td>' + persons.math + '</td>';
    // str = str + '</tr>'

    let tr = '<tr>';
    for (let field in persons) {
        tr = tr + '<td>' + persons[field] + '</td>';
    }

    tr = tr + '</tr>';

    return tr;
}

function makeHead(obj) {
    let tr = '<tr>';

    for(let field in obj) {
        tr = tr + '<th>' + field + '</th>';
    }
    tr = tr + '</th>';

    return tr;
}

persons[0]['math'] = 90;

let str = '<table border=1><tbody>';
str = str + makeHead(persons[0]);   //{name: '이바다', eng: 80, math: 90}

for (let i = 0; i < persons.length; i++) {
    str = str + makeTr(persons[i]);
}

str = str + '</tbody></table>';

document.write(str);

