<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<!-- jQuery -->
<script src="http://code.jquery.com/jquery-1.12.0.js"></script>
<script>
        $(document).ready(function() {
      $('#btnLogin').click(function() {
        var action = $('#frmLogin').attr("action");
        var form_data = {
                          id: $('#id').val(),
                          pw: $('#pw').val()
        };
        $.ajax({
                  type: "POST",
                  url: action,
                  data: form_data,
                  success: function(response) {
                    if(response.trim() == "success") {
                      sessionStorage.setItem("user_id", form_data.user_id);
                      $('#msg').html("login:ok");
                    } else {
                      $('#msg').html("login:fail");
                    }
                  },
        });
      });
    });
  </script>
</head>
<body>
	<form id="frmLogin" name="frmLogin" action="login_ok.jsp" method="post">
		<input type="text" id="id" name="id" placeholder="아이디" /><br />
		<input type="password" id="pw" name="pw" placeholder="패스워드" /><br />
		<input type="button" id="btnLogin" value="로그인" />
	</form>
	<div id="msg"></div>
</body>
</html>

