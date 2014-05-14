<jsp:include page="cabecalho.jsp"></jsp:include>

<br/>
<br/>
<br/>

<form action="ServletCadastroUsuario" method="post">
	<fieldset>
		<br/>
		<legend>Cadastro</legend>

		<label for="nome">Nome*: </label> <input value="${usuario.nome}"
			type="text" name="nome" id="nome" /><br/> <br/> <label for="email">E-mail*:
		</label> <input value="${usuario.email}" type="text" name="email" id="email" /><br/>

		<br/> <label for="senha">Senha*: </label> <input type="password"
			name="senha" id="senha" /><br/> <br/> <label for="confsenha">Confirmar
			Senha*: </label> <input type="password" name="confsenha" id="confsenha" /><br/> <br/>
		<input value="Cadastrar" type="submit" /> <br/> <br/>
	</fieldset>
</form>
<jsp:include page="rodape.jsp"></jsp:include>
