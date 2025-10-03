<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Customer</title>
      <link rel="stylesheet" href="../css/homepage.css">
    <link rel="icon" href="../assets/img/bb-fav.png" type="image/png">
</head>

<body>
<div class="mainContainer">
    <h2> Fill Below Form to Add New Customer</h2>
    <div class="formitem">
        <form action="/bank-mis-fs/add-customer-record" method="post">
            <label for="">Enter the name of Customer: </label>
            <input type="text" name="Customername" required>
            <br><br><br>
            <label for="">Enter the Address: </label>
            <input type="text" name="customerAddress" required>
            <br><br><br>
            <label for="">Enter Balance: </label>
            <input type="number" minlength="1" , maxlength="10" required name="customerbalance">
            <br><br><br>
            <label for="">Enter AccountNumber: </label>
            <input type="number" minlength="1" , maxlength="12" required name="AccountNumber">
            <br><br><br>
            <label for="">Enter Contact: </label>
            <input type="number" minlength="1" , maxlength="10" required name="customercontact">
            <br><br><br>
            <label for="">Enter bid: </label>
            <input type="number" minlength="1" , maxlength="10" required name="customerbid">
            <br><br>
            <input type="submit" value="submit" id="submit">
        </form>
    </div>

</div>
</body>

</html>