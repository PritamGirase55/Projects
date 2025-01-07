<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
    table {
        width: 80%;
    }
    table, td {
        padding: 10px;
        border: 1px solid #ddd;
    }
    h1 {
        color: #BAE549;
    }
</style>
</head>
<body>
    <div align="center">
        <h1>Employee Registration Form</h1>
        <form action="EmployeeServlet" method="post">
            <table>
                <tr>
                    <td>Emp id</td>
                    <td><input type="text" name="empid"></td>
                </tr>
                <tr>
                    <td>First name</td>
                    <td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td>Last name</td>
                    <td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td><input type="text" name="contact"></td>
                </tr>
            </table>
            <br>
            <input type="submit" name="submit" value="Submit">
            <input type="reset" name="cancel" value="Cancel">
        </form>
    </div>
</body>
</html>
