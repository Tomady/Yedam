//func3.js

function multiplyWithReturn(num) {
    // 3단.
    let str = '<h1>구구단' + num + '단</h1> \
    <table border="1">';
    // document.write('<h1>구구단' + num + '단</h1>');
    // document.write('<table border="1">');

    for (let i = 1; i <= 9; i++) {
        // document.write('<tr><td>' + num + '</td>' + '<td> * </td>' + '<td>' +  i + '</td>' + '<td> = </td>' + '<td>' + (num * i) + '</td></tr>');
        str = str + '<tr><td>' + num + '</td>' + '<td> * </td>' + '<td>' + i + '</td>' + '<td> = </td>' + '<td>' + (num * i) + '</td></tr>';
    }

    // document.write('</table>');
    str = str + '</table>';

    return str;
}

let result = multiplyWithReturn(6);
document.write(result);

let table = document.querySelector('table');
table.style.width = '250px';
table.style.height = '250px';
table.style.textAlign = 'center';
table.style.borderColor = 'yellow';

let tr = document.querySelector('tr:nth-child(2)');
tr.style.color = 'red';

let td = document.querySelector('tr:nth-child(2)>td:nth-child(2)');
td.style.color = 'blue';
