// array5.js
// 요소(태그)생성: document.createElement('element')
// 상위요소 > 하위요소: 상위요소.appendChild(하위요소);

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

document.write('<button onclick="createTable()">생성</button>');
document.write('<div id="show"></div>');
// 표(table) 형식으로 생성.
function createTable() {
    let tableTag, thTag, trTag, tdTag;

    tableTag = document.createElement('table');
    tableTag.style.border = '1px solid black';
    console.log(tableTag);
    trTag = document.createElement('tr');
    tableTag.appendChild(trTag);

    // Table 헤더 생성부분
    for (let field in users[0]) {
        thTag = document.createElement('th');
        thTag.innerHTML = `${field}`;
        trTag.appendChild(thTag);
        // thTag.style.border = '1px solid black';
    }

    // Table 바디 생성부분
    for (let user of users) {
        trTag = document.createElement('tr');
        tableTag.appendChild(trTag);

        for (let field in user) {
            tdTag = document.createElement('td');
            tdTag.innerHTML = `${user[field]}`;
            trTag.appendChild(tdTag);
            // tdTag.style.border = '1px solid black';
        }
    }

    document.getElementById('show').appendChild(tableTag);
    tableTag.setAttribute('border', '1');
}


// <ul><li>아이디, 이름, 점수</li></ul>
function createUl() {
    let ulTag, liTag;

    ulTag = document.createElement('ul');
    console.log(ulTag);

    for (let user of users) {
        liTag = document.createElement('li');
        liTag.innerHTML = `${user.name}, ${user.id}, ${user.point}`;
        ulTag.appendChild(liTag);
    }

    document.getElementById('show').appendChild(ulTag);
}