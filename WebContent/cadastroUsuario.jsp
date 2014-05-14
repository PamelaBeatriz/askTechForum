<%@ include file="cabecalho.jsp" %>

<br/>
<br/>
<br/>

<form action="ServletCadastroUsuario" method="post">
	<fieldset>
		<br/>
		<legend>Cadastro</legend>
	
		<table border = "1">
			<td>
				<label for="nome">Nome*: </label>
				<br/><br/>
				
				<label for="dataNascimento">Data de Nascimento: </label>
				<br/><br/>
				
				<label for="email">E-mail*: </label>
				<br/><br/>
				
				<label for="localizacao">Localização: </label>
				<br/><br/>

				<label for="senha">Senha*: </label>
				<br/><br/>

				<label for="confsenha">Confirmar Senha*: </label>
				<br/><br/>
			</td>
			<td>
				<input value="${usuario.nome}" type="text" name="nome" id="nome" />
				<br/><br/>
				
				<input type="date" value="${usuario.dataNascimento}" name="dataNascimento" id="dataNascimento" />
				<br/><br/>
				
				<input value="${usuario.email}" type="email" name="email" id="email" />
				<br/><br/>
				
				<input value="${usuario.localizacao}" type="text" name="localizacao" id="localizacao" />
				<br/><br/>
				
				<input type="password" name="senha" id="senha" />
				<br/><br/>
				
				<input type="password" name="confsenha" id="confsenha" />
				<br/><br/>
			</td>
		</table>
		
		<label>Os campos com * são obrigatórios.</label>
		<br/><br/>
		
		<input value="Cadastrar" type="submit" />
		<br/><br/>
	</fieldset>
</form>
<jsp:include page="rodape.jsp"></jsp:include>
