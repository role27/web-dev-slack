// 1번 문제 : 안녕하세요를 result1에 출력

function printText() {
  const id = document.querySelector("#result1");
  id.textContent = "안녕하세요";
  console.log(id);
}

// 2번 문제
function printInputValue() {
  const customer = document.querySelector("#customer");
  console.log(customer.value);
}

// 3번 문제
function changeColor() {
  const div = document.querySelector(".div-test");
  div.style.backgroundColor = "yellow";
}
// 4번 문제
function stringLength() {
  const text = document.querySelector("#text");
  console.log(stringLength);
}

// 5번 문제
function stringSplit() {
  const la = document.querySelector("#result5");
  console.log(la.innerHTML);
}

// 6번 문제
function arrayTest() {}

// 7번 문제 : prompt로  이름, 나이, 주소 순으로 입력받아서 출력
function addStudent() {}

// 8번
function addItem() {}

// 9번
function toggleClass() {}

// 10번
function addToCart() {}
