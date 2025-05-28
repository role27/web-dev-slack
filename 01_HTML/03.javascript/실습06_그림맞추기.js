const imageList = [
  "assets/spy1.jpg",
  "assets/spy2.jpg",
  "assets/spy3.jpg"
];

// 이미지 태그 요소 가져오기
const images = document.querySelectorAll("#container img");
const message = document.querySelector("h2");

let clickCounter = 0; // 클릭 횟수 저장 변수

// 메시지 숨기기
  message.style.display = "none";

// 버튼 클릭 이벤트 함수
window.Startbtn = function () {
  let selectedImages = [];
  
  clickCounter++; // 클릭할 때마다 증가



  document.getElementById("clickCount").textContent = clickCounter;

  // 각 이미지에 랜덤 이미지 설정
  images.forEach((img) => {
    const randomIndex = Math.floor(Math.random() * imageList.length);
    const randomImage = imageList[randomIndex];
    img.src = randomImage;
    selectedImages.push(randomImage);
  });

  // 세 이미지가 모두 같으면 메시지 출력
  const allSame = selectedImages.every((val) => val === selectedImages[0]);
  if (allSame) {
    message.style.display = "block";
  } else {
    message.style.display = "none";
  }
};

// 재시작 버튼 함수
window.Restartbtn = function () {
  // 기본 이미지로 초기화
  images[0].src = "assets/spy1.jpg";
  images[1].src = "assets/spy2.jpg";
  images[2].src = "assets/spy3.jpg";

  // 메시지 숨기기
  message.style.display = "none";
};

