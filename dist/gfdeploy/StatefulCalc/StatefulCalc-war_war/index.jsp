
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator Landing Page</title>
</head>
<body>
<h2>Calculator</h2>
<form method="post" action="Calculator">

    <center><input type="text" name="value" value="${display}"/></center>
<center>

      <table>
<tr><td><input type="submit" name ="tujuh" value=" 7 "/></td><td>
<input type="submit" name ="delapan" value=" 8 " style="height:50px;width:50px"/></td><td>
<input type="submit" name ="sembilan" value=" 9 "/></td><td>
<input type="submit" name ="Div" value=" / "/></td></tr>
<tr><td><input type="submit" name ="empat" value=" 4 "/></td><td>
<input type="submit" name ="lima" value=" 5 "></td><td>
<input type="submit" name ="enam" value=" 6 "/></td><td>
<input type="submit" name ="Mul" value=" * "/></td></tr>
<tr><td><input type="submit" name ="satu" value=" 1 "/></td><td>
<input type="submit" name ="dua" value=" 2 "/></td><td>
<input type="submit" name ="tiga" value=" 3 "/></td><td>
<input type="submit" name ="Sub" value=" - "/></td></tr>
<tr><td><input type="submit" name ="nol" value=" 0 "/></td><td>
<input type="submit" name ="hasil" value=" = "/></td><td>
<input type="submit" name ="titik" value=" . "/></td><td>
<input type="submit" name ="Add" value=" + "/></td></tr>
</table>

<input type="submit" name ="Reset" value=" Clr "/>
</center>
</form>
</body>
</html>
