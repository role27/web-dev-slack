function submitForm() {
  // 요소 선택
  const usernameInput = document.querySelector("#username");
  const passwordInput = document.querySelector("#password");
  const confirmPasswordInput = document.querySelector("#confirmPassword");
  const nameInput = document.querySelector("#name");
  const emailInput = document.querySelector("#email");
  const phoneInput = document.querySelector("#phone");

  const result1 = document.querySelector("#result1");
  const result2 = document.querySelector("#result2");
  const result3 = document.querySelector("#result3");
  const result4 = document.querySelector("#result4");
  const result5 = document.querySelector("#result5");
  const result6 = document.querySelector("#result6");

  // 값 추출
  const username = usernameInput.value.trim();
  const password = passwordInput.value.trim();
  const confirmPassword = confirmPasswordInput.value.trim();
  const name = nameInput.value.trim();
  const email = emailInput.value.trim();
  const phone = phoneInput.value.trim();

  // result1에 아이디 값 표시
  result1.textContent = username;

  // 아이디 유효성 검사
  const usernameRegex = /^[a-zA-Z][a-zA-Z0-9]{3,11}$/;
  if (!usernameRegex.test(username)) {
    result1.textContent += " ❌ 아이디는 영문자로 시작하고 4~12자여야 합니다.";
    return;
  } else {
    result1.textContent += " ✅ 사용 가능한 아이디입니다.";
  }

  const passwordRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[\W_]).{8,15}$/;
  if (!passwordRegex.test(password)) {
    result2.textContent = "❌ 비밀번호는 영문자, 숫자, 특수문자 포함 8~15자여야 합니다.";
    return;
  } else {
    result2.textContent = "✅ 올바른 비밀번호 형식입니다.";
  }

  if (password !== confirmPassword) {
    result3.textContent = "❌ 비밀번호가 일치하지 않습니다.";
    return;
  } else {
    result3.textContent = "✅ 비밀번호가 일치합니다.";
  }

  const nameRegex = /^[가-힣]{2,}$/;
  if (!nameRegex.test(name)) {
    result4.textContent = "❌ 이름은 한글 2자 이상이어야 합니다.";
    return;
  } else {
    result4.textContent = "✅ 올바른 이름입니다.";
  }

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailRegex.test(email)) {
    result5.textContent = "❌ 이메일 형식이 올바르지 않습니다.";
    return;
  } else {
    result5.textContent = "✅ 유효한 이메일입니다.";
  }

  const phoneRegex = /^\d{2,3}-\d{3,4}-\d{4}$/;
  if (!phoneRegex.test(phone)) {
    result6.textContent = "❌ 전화번호 형식이 올바르지 않습니다. (예: 010-1234-5678)";
    return;
  } else {
    result6.textContent = "✅ 유효한 전화번호입니다.";
  }

  alert("🎉 회원가입이 완료되었습니다!");
}

function resetForm() {
  // input 요소 초기화
  document.querySelector("#username").value = "";
  document.querySelector("#password").value = "";
  document.querySelector("#confirmPassword").value = "";
  document.querySelector("#name").value = "";
  document.querySelector("#email").value = "";
  document.querySelector("#phone").value = "";

  // 결과 메시지 초기화
  for (let i = 1; i <= 6; i++) {
    document.querySelector(`#result${i}`).textContent = "";
  }
}