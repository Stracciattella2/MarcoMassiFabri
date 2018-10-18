<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Registrazione</h2>
<br><br>

<form method="POST" action="registrazione">

		<label for="nome">Nome: </label> <input type="text" id="nome"
			name="nome" /> 
			<br> <label for="cognome">Cognome: </label> <input
			type="text" id="cognome" name="cognome" /> 
			<br> <label for="eta">Eta: </label>
			<input type="text" id="eta" name="eta" /> 
			<br> <label for="codiceFiscale">Codice Fiscale: </label>
			<input type="text" id="codiceFiscale" name="codiceFiscale" /> 
			<br> <label for="password">Password: </label>
			<input type="text" id="password" name="password" /> 
			<br> <label for="confermaPassword">Conferma Password: </label>
			<input type="text" id="confermaPassword" name="confermaPassword" /> 
			
			<br><br> <input type="submit" value="REGISTRATI" />

	</form>


</body>
</html>