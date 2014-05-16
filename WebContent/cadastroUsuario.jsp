<%@ include file="cabecalho.jsp"%>

<br />
<br />
<br />

<form action="ServletCadastroUsuario" method="post">
	<div id="site_content">
		<div class="content">
			<h1>Cadastre-se</h1>
			<div class="content_item">

<!-- 				<table border="0"> -->
<!-- 					<td><label for="nome">Nome*: </label> <br /> <br /> <label -->
<!-- 						for="dataNascimento">Data de Nascimento: </label> <br /> <br /> -->
<!-- 						<label for="email">E-mail*: </label> <br /> <br /> <label -->
<!-- 						for="localizacao">Localização: </label> <br /> <br /> <label -->
<!-- 						for="senha">Senha*: </label> <br /> <br /> <label -->
<!-- 						for="confsenha">Confirmar Senha*: </label> <br /> <br /></td> -->
<%-- 					<td><input value="${usuario.nome}" type="text" name="nome" --%>
<!-- 						id="nome" /> <br /> <br /> <input type="date" -->
<%-- 						value="${usuario.dataNascimento}" name="dataNascimento" --%>
<!-- 						id="dataNascimento" /> <br /> <br /> <input -->
<%-- 						value="${usuario.email}" type="email" name="email" id="email" /> --%>
<%-- 						<br /> <br /> <input value="${usuario.localizacao}" type="text" --%>
<!-- 						name="localizacao" id="localizacao" /> <br /> <br /> <input -->
<!-- 						type="password" name="senha" id="senha" /> <br /> <br /> <input -->
<!-- 						type="password" name="confsenha" id="confsenha" /> <br /> <br /></td> -->
<!-- 				</table> -->



				<div class="form_settings_cadastro">
				<p><span>Nome*</span><input class="contact" value="${usuario.nome}" type="text" name="nome"
						id="nome" /> </p>
				<p>	<span>	Data de Nascimento </span><input class="contact" type="date"
						value="${usuario.dataNascimento}" name="dataNascimento"
						id="dataNascimento" /></p>
				<p> <span>E-mail* </span><input class="contact"
						value="${usuario.email}" type="email" name="email" id="email" /> </p>
				<p><span>Localização</span><input class="contact" value="${usuario.localizacao}" type="text"
						name="localizacao" id="localizacao" /></p>
				<p><span>Senha* </span><input class="contact"
						type="password" name="senha" id="senha" /></p>
			    <p><span>Confirmar Senha*</span><input class="contact"
						type="password" name="confsenha" id="confsenha" /></p>
			
				<p style="color:red; font-size:12px;">Os campos com * são obrigatórios.</p> 
				   <input class="submit"
					value="Cadastrar" type="submit" /> 
				</div>	
			</div>
		</div>
	</div>
</form>
<jsp:include page="rodape.jsp"></jsp:include>
