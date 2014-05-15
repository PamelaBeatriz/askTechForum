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
						<input type="radio" name="pesquisaRadio" id="nome" value="nomeRadio" checked="checked" />
						<br />
						<br />
						<input type="radio" name="pesquisaRadio" id="email" value="emailRadio" />
						<br />
						<br />
						<input type="radio" name="pesquisaRadio" id="listarTodos" value="listartodosRadio" />
					</td>
					<td>
						<label for="nome"> Nome: </label><input value="${usuario.nome}" type="text" name="nome" id="nome" />
						<br />
						<br /> 
						<label for="email"> E-mail: </label><input value="${usuario.email}" type="text" name="email" id="email" />
						<br/>
						<br />
						<label for="listarTodos">Listar Todos</label>
					</td>
				</table>	
				
				<input value="Pesquisar" type="submit" /> 
				<br/><br/>

				<c:if test="${not empty usuarios}">
					<table id="tabelaListaUsuarios" border="0">
						<thead>
							<tr class="tabelaPesquisa">
								<td></td>
								<td>Id</td>
								<td>Nome</td>
								<td>Data de Nascimento</td>
								<td>Email</td>
								<td>Localização</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${usuarios}" var="users">
								<tr>
									<td><input type="radio" name="usuario" id="usuario" /></td>
									<td><c:out value="${users.idUsuario}" /></td>
									<td><c:out value="${users.nome}" /></td>
									<td><c:out value="${users.dataNascimento}" /></td>
									<td><c:out value="${users.email}" /></td>
									<td><c:out value="${users.localizacao}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				<input value="Exibir" type="button" />
				<br/><br/><br/>
				</c:if>
			</div>
		</div>
	</div>
</form>
<br />
<br />
<br />

<jsp:include page="rodape.jsp"></jsp:include>