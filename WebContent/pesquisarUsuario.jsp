<%@ include file="cabecalho.jsp"%>

<br />
<br />
<br />

<form id="formPesquisaUsuario" action="ServletPesquisaUsuario"
	method="post">

	<div id="site_content">
		<div class="content">
			<h1>Pesquisar Usuários</h1>
			<div class="content_item">
			
				<table border="0">
					<td>
						<input type="radio" name="pesquisaRadio" id="nome" value="nomeRadio" />
						<br />
						<br />
						<input type="radio" name="pesquisaRadio" id="email" value="emailRadio" />
						<br />
						<br />
						<input type="radio" name="pesquisaRadio" id="listarTodos" value="listartodosRadio" />
					</td>
					<td>
						<label for="nome"> Nome: </label><input class="input" value="${usuario.nome}" type="text" name="nome" id="nome" />
						<br />
						<br /> 
						<label for="email"> E-mail: </label><input class="input" value="${usuario.email}" type="text" name="email" id="email" />
						<br/>
						<br />
						<label for="listarTodos">Listar Todos</label>
					</td>
				</table>	
				<p style="color:red; font-size:12px;">* Selecione uma das opções acima para pesquisar.</p> 
				<input value="Pesquisar" type="submit" class="submit"/> 
				<br/><br/>
	
				<c:if test="${not empty usuarios}">
					<table id="tabelaListaUsuarios" border="0">
						<thead>
							<tr class="tabelaPesquisa">
								<td>Id</td>
								<td>Nome</td>
								<td>Data de Nascimento</td>
								<td>Email</td>
								<td>Localização</td>
								<td>Exibir Perfil</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${usuarios}" var="usuarios">
								<tr>
									<td><label><c:out value="${usuarios.idUsuario}" /></label></td>
									<td><c:out value="${usuarios.nome}" /></td>
									<td><fmt:formatDate pattern="dd/MM/yyyy" value="${usuarios.dataNascimento}"/></td>
									<td><c:out value="${usuarios.email}" /></td>
									<td><c:out value="${usuarios.localizacao}" /></td>
									<td><a href="ServletPerfilUsuario?emailUsuario=<c:out value="${usuarios.email}"/>">Exibir Perfil</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if>
				
			</div>
		</div>
	</div>
</form>
<br />
<br />
<br />

<jsp:include page="rodape.jsp"></jsp:include>