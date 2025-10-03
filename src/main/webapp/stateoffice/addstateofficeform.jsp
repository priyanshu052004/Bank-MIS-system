<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New StateOffice</title>
    <link rel="stylesheet" href="../css/homepage.css">
    <link rel="icon" href="../assets/img/bb-fav.png" type="image/png">
</head>

<body>
    <div class="mainContainer">
        <h2> Fill Below Form to Add New StateOffice</h2>
        <div class="formitem">
            <form action="/bank-mis-fs/add-state-office" method="post">
            <label for="">Enter the name of State Office: </label>
            <input type="text" name="stateofficeName" required>
            <br><br><br>
            <label for="">Enter the Address: </label>
            <!-- <textarea name="" id="" cols="30" rows="5"></textarea> -->
            <input type="text" name="stateofficeAddress" required>
            <br><br><br>
            <label for="">Enter Pincode: </label>
            <input type="number" minlength="6" , maxlength="6" required name="stateofficePincode">
            <br><br><br>
            <label for="">Enter City: </label>
            <input type="text" name="stateofficeCity" required>
            <br>
            <input type="submit" value="submit" id="submit">
        </form>
        </div>

    </div>
</body>

</html>