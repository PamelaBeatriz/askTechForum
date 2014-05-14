<%@ include file="cabecalho.jsp" %>

<br/>
<br/>
<br/>

<form action="ServletAlteracaoUsuario" method="post">
	<fieldset>
		<br/>
		<legend>Alterar Usuário</legend>
		
		<label for="nome"> Nome: </label><input value="${usuario.nome}"type="text" name="nome" id="nome" />
		<br/><br/>
		
		<label for="email"> E-mail: </label><input value="${usuario.email}" type="text" name="email" id="email" />
		<br><br/>
		
		<input value="Alterar" type="submit" />
		<br/><br/><br/>
		
	</fieldset>
</form>
<br/>
<br/>
<br/>

<jsp:include page="rodape.jsp"></jsp:include>