// 1번 문제 : 안녕하세요를 result1에 출력

function printText() {
  const id = document.querySelector("#result1");
  id.textContent = "안녕하세요";
  console.log(id);
}

// 2번 문제
function printInputValue() {
  const result2 = document.querySelector("#result2");
  const customer = document.querySelector("#customer");
   //input 값(customer)을 가지고 오기
  console.log(customer.value);
  // 가지고 와서 result2에 출력
  result2.textContent=customer.value;
}


// 3번 문제
function changeColor() {
  const divTest = document.querySelector(".div-test");
  divTest.style.backgroundColor = "yellow";
}


// 4번 문제
function stringLength() {
  const text = document.querySelector("#text");
  const result4 = document.querySelector("#result4");
  console.log(text.value.length);
  result4.innerHTML = text.value.length;
  //입력한 글자 비우기
  text.value = "";
}

// 5번 문제
const la = document.querySelector("#la");
const result5 = document.querySelector("#result5");
function stringSplit() {
  // 1. "사과, 바나나, 오렌지, 포도" 문자 가지고 오기
  console.log(la.innerHTML);
  const laText = la.innerHTML;
  // 2. 가지고 온 문자열 분리하기 -> 배열로 만들기 (split)
  console.log(laText.split(","));
  const laArr = laText.split(",");

  // 6. ul 태그 만들기
  const ul = document.createElement("ul");

  // 3. 배열 값 하나씩 가지고 오기 -> 반복문!
  for (let i = 0; i < laArr.length; i++) {
    //console.log(laArr[i]);
    // 4. li 태그 만들기
    const li = document.createElement("li");
    // 5. li 태그에 값 넣기
    li.innerHTML = laArr[i];
    console.log(li);

    // 7. ul 태그에 만들어놓은 li 태그들 추가하기
    // ul.appendChild(li);
    // ul.innerHTML = "<li>" + laArr[i] + "</li>";
    ul.innerHTML += `<li>${laArr[i]}</li>`;
  }
  console.log(ul);
  // 8. result5에 ul 담기
  result5.appendChild(ul);
}

// 6번 문제
function arrayTest() {
  const preview = document.querySelector("#preview");
  const remove = document.querySelector("#remove");
  const add =document.querySelector("#add");

  console.log(preview.textContent.split(" "));
  const preArr = preview.textContent.split(" ");
  for(let i = 0; i <preArr.length; i++){
    //이미 가지고 있는 값에서 내가 삭제할 값이 일치하면 배열에서 제거
    if(preArr[i]===remove.value){
      preArr.splice(i,1);
    }
    preArr.push(add.value);
  }
console.log(preArr.join(" "));
preview.textContent=preArr.join(" ");
}

// 7번 문제 : prompt로  이름, 나이, 주소 순으로 입력받아서 출력
const names=document.querySelectorAll(".name");
const ages = document.querySelectorAll(".age");
const addr = document.querySelectorAll(".addr");
function addStudent() {
console.log(names);
for(let i = 0 ; i < 3; i++){
  const name =prompt(`${i}번째 학생 이름`);
  const age = prompt(`${i}번째 나이`);
  const add = prompt(`${i}번째 주소`);
  names[i].textContent=name;
  ages[i].textContent=age;
  addr[i].textContent=add;
}


  }
// 8번
function addItem() {
const list = document.querySelector("#list");
const li = document.createElement("li");
li.textContent="테스트";
list.appendChild(li);

}

function removeItem(){
  console.log(list.childNodes);
  //list.removeChild(list.childNodes[0]);
const li = document.querySelector("#list li");
console.log(li);
li.remove();
}




// 9번
function toggleClass() {
  const result9 = document.querySelector("#result9");
  result9.classList.toggle("active");
}

// 10번
let sum = 0;
function addToCart() {
  const item = document.querySelector("#item");
  const price = document.querySelector("#price");
  const cart = document.querySelector("#cart");
  const total = document.querySelector("#total span");
  cart.innerHTML += `<li>${item.value} - ${price.value}</li>`;

  sum += Number(price.value);
  total.innerHTML = sum;
  console.log(sum);

  item.value="";
  price.value="";





}
