<%@ include file="cabecalho.jsp"%>

<br />
<br />
<br />
<form id="formPerfilUsuario" action="ServletPerfilUsuario"
	method="post">

	<div id="site_content">
		<div class="content">
			<h1>Perfil de ${usuario.nome}</h1>
			<div class="content_item">
				<div class="form_settings_perfil">
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
					</p>
					<p>
						<span>Localização: </span>
						<label>${usuario.localizacao}</label>
					</p>
					<p>
						<span>Administrador </span>
						<c:if test="${usuario.admin == false}"><label>Não</label></c:if>
						<c:if test="${usuario.admin == true}"><label>Sim</label></c:if>
					</p>
					<p>
						<input class="submit" value="Editar Perfil" type="button" /> 
						<input class="submit" value="Excluir Cadastro" type="button" />
						<input class="submit" value="Voltar" type="button" />
					</p> 
				</div>
			</div>
		</div>
	</div>
	
</form>
<br />
<br />
<br />

<jsp:include page="rodape.jsp"></jsp:include>