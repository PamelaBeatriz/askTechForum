<%@ include file="cabecalho.jsp"%>

<br />
<br />
<br />

<form id="formPesquisaUsuario" action="ServletPesquisaUsuario"
	method="post">

	<div id="site_content">
		<div class="content">
			<h1>Pesquisar Usu�rios</h1>
			<div class="content_item">
				<br /> <input type="radio" name="pesquisaRadio" id="nome"
					value="nomeRadio" checked="checked" /> <label for="nome">
					Nome: </label><input value="${usuario.nome}" type="text" name="nome"
					id="nome" /> <br />
				<br /> <input type="radio" name="pesquisaRadio" id="email"
					value="emailRadio" /> <label for="email"> E-mail: </label><input
					value="${usuario.email}" type="text" name="email" id="email" /> <br>
				<br /> <input type="radio" name="pesquisaRadio" id="listarTodos"
					value="listartodosRadio" /> <label for="listarTodos">
					Listar Todos</label> <br />
				<br /> <input value="Pesquisar" type="submit" /> <input value="Exibir" type="button" /> <br />
				<br />

				<c:if test="${not empty usuarios}">
					<table id="tabelaListaUsuarios" border="1">
						<thead>
							<tr class="tabelaPesquisa">
								<td></td>
								<td>Id</td>
								<td>Nome</td>
								<td>Data de Nascimento</td>
								<td>Email</td>
								<td>Localiza��o</td>
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
				</c:if>
			</div>
		</div>
	</div>
</form>
<br />
<br />
<br />

<jsp:include page="rodape.jsp"></jsp:include>