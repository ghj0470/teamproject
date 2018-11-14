<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
  if (document.f.id.value.indexOf(" ") >= 0) {
            alert("아이디에 공백을 사용할 수 없습니다.")
            document.f.id.focus()
            document.f.id.select()
            return false;
        }
     
        if (document.f.id.value.length<4) {
            alert("아이디를 4까지 입력해주세요.")
            document.f.id.focus()
            document.f.id.select()
            return false;
        }
    
        if (document.f.pwd.value.length<8) {
            alert("비밀번호를 입력하지 않았습니다.")
            document.f.pwd.focus()
            return false;
        }
       
        if (document.f.pwd.value.length<8) {
            alert("비밀번호를 8 입력해주세요.")
            document.f.pwd.focus()
            document.f.pwd.select()
            return false;
        }
 
        //비밀번호와 비밀번호 확인 일치여부
        if (document.f.pwd.value != document.f.pwdChk.value) {
            alert("비밀번호가 일치하지 않습니다")
            document.f.pwdChk.value = ""
            document.f.pwdChk.focus()
            return false;
        }
  
        if (document.f.age.value.length<=1 || document.f.my_pwd.value.length>131) {
            alert("나이 입력해주세요.")
            document.f.age.focus()
            document.f.age.select()
            return false;
        }
        if (document.f.email.value == "") {
            alert("이메일을 입력하지 않았습니다.")
            document.f.email.focus()
            return false;
        }
 
        </script>
          <form name="f" method="post" onsubmit="return sendIt();">
        <table>
      
            <tr align="left">
               <label for="id">아이디 :</label>
                <td><input type="text" name="id" id="id" maxlength="12">4~12자의 영문 대소문자와 숫자로만 입력</td>
            </tr>
               <tr align="left">
                <label for="pwd">나이 :</label>
                <td><input type="password" name="pwd" id="pwd">8자의 영문 대소문자와 숫자로만 입력</td>
            </tr>
            <tr>
               <label for="pwdChk">비밀번호 확인 :</label>
                <td><input type="password" name="pwdChk"></td>
            </tr>
                <tr>
                <label for="age">나이 :</label>
                <td><input type="text" name="age"></td>
            </tr>
            <tr align="left">
                <td align="center" bgcolor="lightgreen"><b>메일 주소:</b></td>
                <td><input type="text" name="email" id="email" >ID@DOMAIN</td>
            </tr>
            
        </table>
         </form>
</body>
</html>