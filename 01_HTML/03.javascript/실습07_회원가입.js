//  아이디

username.addEventListener("input", (e) => {
        let uesrnameregExp = /^[a-zA-Z][a-zA-Z0-9]{3,11}$/;
        
        if (uesrnameregExp.test(e.target.value)) {
            console.log("가능")
          result1.innerHTML = "OK!";
          result1.style.color = "green";
        } else {console.log("불가능")
          result1.innerHTML = "NO!";
          result1.style.color = "red";
        }
      });

// 비밀번호
password.addEventListener("input", (e) => {
        let passwordregExp = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,15}$/;
        if (passwordregExp.test(e.target.value)) {
            console.log("가능")
          result2.innerHTML = "OK!";
          result2.style.color = "green";
        } else {console.log("불가능")
          result2.innerHTML = "NO!";
          result2.style.color = "red";
        }
      });

// // 비밀번호 다시확인(동일한지)
//          if (result2 === result3) {
//             console.log("일치")
//           result3.innerHTML = "OK!";
//           result3.style.color = "green";
//         } else {console.log("불일치")
//           result3.innerHTML = "NO!";
//           result3.style.color = "red";
//         };
// 이름
name1.addEventListener("input", (e) => {
        let name1regExp = /^[가-힣]{2,}$/;
        if (name1regExp.test(e.target.value)) {
            console.log("가능")
          result4.innerHTML = "OK!";
          result4.style.color = "green";
        } else {console.log("불가능")
          result4.innerHTML = "NO!";
          result4.style.color = "red";
        }
      });

// 이메일
email.addEventListener("input", (e) => {
        let emailregExp = /^[\w.-]+@[\w.-]+\.[A-Za-z]{2,}$/;
        if (emailregExp.test(e.target.value)) {
            console.log("가능")
          result5.innerHTML = "OK!";
          result5.style.color = "green";
        } else {console.log("불가능")
          result5.innerHTML = "NO!";
          result5.style.color = "red";
        }
      });
//전화번호
phone.addEventListener("input", (e) => {
        let phoneregExp = /^010-\d{4}-\d{4}$/;
        if (phoneregExp.test(e.target.value)) {
            console.log("가능")
          result6.innerHTML = "OK!";
          result6.style.color = "green";
        } else {console.log("전화번호 형식이 올바르지 않습니다. (예: 010-1234-5678)")
          result6.innerHTML = "NO!";
          result6.style.color = "red";
        }
      });

//회원가입 버튼





    
