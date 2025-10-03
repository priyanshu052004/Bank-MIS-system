<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete state office</title>
 <link rel="stylesheet" href="../css/homepage.css">
<link rel="icon" href="../assets/img/bb-fav.png" type="image/png">
</head>
<body>
<div class="mainContainer">
        <h2> Fill Below Form to delete StateOffice</h2>
        <div class="formitem">
            <form action="/bank-mis-fs/delete-state-office" method="post">
            <label for="">Enter Sid: </label>
            <input type="number"  required name="stateofficeID">
            <br>
            <input type="submit" value="submit" id="submit">
        </form>
        </div>

    </div>
</body>
</html>