<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<div
style="text-align: center; border-style: double;style="font-size:60px;" width: 1200pt; height: 120%; float: center;">

 <h1>Create Account</h1>
 </br>
<form action="../BookStoreProject/Account/register" method ="post">




    <div class="container" style="background-color: MediumSeaGreen;">
     
      <input size="65"; height=900px; font-size=14pt; type="text" placeholder="Enter Username" name="uname" required>
      </br>
      
      
   <input size="65"; height=900px; font-size=14pt; type="text" placeholder="Enter your email id" name="emailId" required>
      </br>
      
      <input size="65"; height=900px; font-size=14pt; type="password" placeholder="Enter Password" name="psw" required>
      </br>
      
      <input size="65"; height=900px; font-size=14pt; type="password" placeholder="Repeat your Password" name="psw" required>
      </br>
      
      <input size="65"; height=900px; font-size=14pt; type="text" placeholder="Enter your age" name="age" required>
      </br>
      
      
        <input type="checkbox" checked="checked" name="agree"><td>I agree all Statement on <b>Terms of Service</b>
	</td>
      </label>
      </br>
      
      <button size="65"; height=900px; font-size=14pt; type="submit">Sign Up</button>
      </br>
      
     <td>Have already an account? <b>login here</b>
	</td>
    

    
      
    </div>
  </form>
</div>

</body>
</html>