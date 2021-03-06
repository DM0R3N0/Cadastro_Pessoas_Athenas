<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Cadastro de Pessoas</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style.css" />
</head>

<body>
	<div class="container">
		<a class="links" id="paracadastro"></a> <a class="links"
			id="paralogin"></a>

		<div class="content">

			<!--FORMUL?RIO DE CADASTRO-->
			<div id="cadastro">
				<form method="post" action="">
					<h1>Cadastro</h1>

					<p>
						<label for="nome_cad">Seu nome</label> <input id="nome_cad"
							name="nome_cad" required="required" type="text"
							placeholder="Seu Nome" />
					</p>

					<p>
						<label for="nasc_cad">Sua data de Nascimento</label> <input
							id="nasc_cad" name="nasc_cad" required="required" type="date"
							placeholder="01/01/2021" />
					</p>

					<p>
						<label for="cpf_cad">Seu CPF</label> <input id="cpf_cad"
							name="cpf_cad" required="required" type="number"
							placeholder="Ex. 12345678901" />
					</p>
					<p>

						<label for="sexo_cad">Seu Sexo</label> <input id="sexo_cad"
							name="sexo_cad" required="required" type="text"
							placeholder="F ou M" />

					</p>
					<p>
						<label for="altura_cad">Sua Altura</label> <input id="altura_cad"
							name="altura_cad" required="required" type="number"
							placeholder="Ex. 1.80" />
					</p>
					<p>
						<label for="peso_cad">Seu Peso</label> <input id="peso_cad"
							name="peso_cad" required="required" type="password"
							placeholder="Ex. 80" />
					</p>
		
					<p>
						<input type="submit" value="Cadastrar" />
					</p>

					<p class="link">
						J? tem conta? <a href="#paralogin"> Ir para Login </a>
					</p>
				</form>
			</div>
		</div>
	</div>
</body>
</html>