
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator Landing Page</title>
</head>
<body>
<center><h2>Calculator</h2>
<form method="post" action="Calculator">

    <input type="text" name="value" value="${display}" style="height:20px;width:160px"/></center>
<center>

      <table>
<tr><td><input type="submit" name ="tujuh" value=" 7 "/></td><td>
<input type="submit" name ="delapan" value=" 8 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="sembilan" value=" 9 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="Div" value=" / " style="height:25px;width:38px"/></td></tr>
<tr><td><input type="submit" name ="empat" value=" 4 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="lima" value=" 5 " style="height:25px;width:38px"></td><td>
<input type="submit" name ="enam" value=" 6 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="Mul" value=" * " style="height:25px;width:38px"/></td></tr>
<tr><td><input type="submit" name ="satu" value=" 1 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="dua" value=" 2 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="tiga" value=" 3 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="Sub" value=" - " style="height:25px;width:38px"/></td></tr>
<tr><td><input type="submit" name ="nol" value=" 0 " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="hasil" value=" = " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="titik" value=" . " style="height:25px;width:38px"/></td><td>
<input type="submit" name ="Add" value=" + " style="height:25px;width:38px"/></td></tr>
</table>

<input type="submit" name ="Reset" value=" Clr "/>
</center>
</form>
</body>
</html>
