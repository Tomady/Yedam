//func2.js
let str = '<h1>Hello</h1>';
str = str + '<ul><li>Apple</li><li>Banana</li><li>Cherry</li></ul>';

document.write(str);

let li = document.querySelector('ul>li');
console.log(li);
li.style.color = 'red';
li.style.background = 'yellow';
// li.remove();

console.log(this.document.body);  //this는 현재 실행된 웹브라우저

//object => {key: value, key1: value1}
obj = {
    key: 'value',
    key1: 'value1',
    key2: {
        key3: 'value3',
        key4: 'value4',
        key5: {
            key6: 'value6',
            key7: {
                key8: 'key8'
            }
        }
    }
}
console.log(obj.key2['key5']['key6']);  //접근을 .으로 해도 되고, []인덱스로 해도 된다.