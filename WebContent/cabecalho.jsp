<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <title>Ask Tech F�rum </title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
  
<!--     <header> -->
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="cadastroUsuario.jsp">Ask Tech<span class="logo_colour">Forum</span></a></h1>
          <h2><a href="login.jsp">Entre</a> <a href="cadastroUsuario.jsp">Cadastre-se</a></h2>
        </div>
        <form method="post" action="#" id="search">
          <input class="search" type="text" name="search_field" value="search....." onclick="javascript: document.forms['search'].search_field.value=''" />
          <input name="search" type="image" style="float: right;border: 0; margin: 20px 0 0 0;" src="images/search.png" alt="search" title="search" />
        </form>
      </div>
<!--       <nav> -->
        <ul class="sf-menu" id="nav">
          <li class="current"><a href="index.html">Perguntas</a></li>
          <li><a href="usuarios.jsp">Usu�rios</a></li>
          <li><a href="#">Tags</a>
            <ul>
              <li><a href="#">Java</a></li>
              <li><a href="#">Android</a>
                <ul>
                  <li><a href="#">Exce��es</a></li>
                  <li><a href="#">Telas</a></li>
                  <li><a href="#">Persist�ncia</a></li>
                </ul>
              </li>
              <li><a href="#">Redes</a></li>
              <li><a href="#">JavaScript</a></li>
              <li><a href="#">SQL</a></li>
              <li><a href="#">HTML</a></li>
              <li><a href="#">CSS</a></li>
            </ul>
          </li>
          <li><a href="sobre.jsp">Sobre</a></li>
            <li><a href="contact.php">Pergunte</a></li>
        </ul>
<!--       </nav> -->
<!--     </header> -->