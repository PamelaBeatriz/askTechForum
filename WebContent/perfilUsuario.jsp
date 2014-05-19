<%@ include file="cabecalho.jsp"%>

<br />
<br />
<br />

<div id="site_content">
	<div class="content">
		<h1>Perfil de ${usuario.nome}</h1>
		<div class="content_item">
			<div class="form_settings_perfil">
				<form id="formPerfilUsuario" action="ServletAlteracaoUsuario" method="post">
				
					<p>
						<span>Nome: </span>
						<label>${usuario.nome}</label>
					</p>
					<p>
						<span>Data de Nascimento: </span>
						<label><fmt:formatDate pattern="dd/MM/yyyy" value="${usuario.dataNascimento}"/></label>
					</p>
					<p>
						<span>E-mail: </span>
						<label>${usuario.email}</label>
						<input type="radio" name="pesquisaUsuarioEmail" id="pesquisaUsuarioEmail" value="${usuario.email}" checked="checked" />
					</p>
					<p>
						<span>Localiza��o: </span>
						<label>${usuario.localizacao}</label>
					</p>
					<p>
						<span>Administrador </span>
						<c:if test="${usuario.admin == false}"><label>N�o</label></c:if>
						<c:if test="${usuario.admin == true}"><label>Sim</label></c:if>
					</p>
				</form>
				<form id="formExclusaoPerfilUsuario" action="ServletExclusaoUsuario" method = "post">
					<p>
						<input value="Editar Perfil" type="button" class="submit" onclick="alterarUsuario()" />
						<input value="Excluir Cadastro" type="button" class="submit" onclick="excluirUsuario()" />
						<input value="Voltar" type="button" class="submit" onclick="voltar()" />
						<input type="radio" name="exclusaoUsuarioEmail" id="exclusaoUsuarioEmail" value="${usuario.email}" checked="checked" />
					</p> 
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />
<br />

<script>
	function alterarUsuario() {
		var formulario;
		formulario = document.getElementById("formPerfilUsuario");
		formulario.submit();
	}
</script>

<script>
	function excluirUsuario() {
		alert("=( Que pena! Voc� est� deixando o AskTechForum. Toda nossa comunidade est� de luto por 3 dias. N�s esperamos que voc� retorne logo.");
		var formulario;
		formulario = document.getElementById("formExclusaoPerfilUsuario");
		formulario.submit();
	}
</script>

<script>
	function voltar() {
		history.back();
	}
</script>

<jsp:include page="rodape.jsp"></jsp:include>