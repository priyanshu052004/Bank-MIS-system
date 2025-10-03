<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Database</title>
<link rel="stylesheet" href="./css/homepage.css">
<link rel="icon" href="./assets/img/bb-fav.png" type="image/png">
</head>
<body>
<div class="mainContainer">
        <h1 id="mainheading">Select the Database you want to View</h1>
        <form action="/bank-mis-fs/printdb" method="get">
           <input type="radio" name="DBtoprint" id="" value="stateoffice"> 
           <label for="">State Office</label>
           <br> <br>
           <button type="submit">View</button>
        </form>
        
    </div>
</body>
</html>