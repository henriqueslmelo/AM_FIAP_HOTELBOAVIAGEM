<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Painel Administrativo ::</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700'
	rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/JFGrid.css" />
<link type="text/css" rel="stylesheet" href="css/JFFormStyle-1.css" />
<script type="text/javascript" src="js/JFCore.js"></script>
<script type="text/javascript" src="js/JFForms.js"></script>
<!-- Set here the key for your domain in order to hide the watermark on the web server -->
<script type="text/javascript">
	(function() {
		JC.init({
			domainKey : ''
		});
	})();
</script>
<!--nav-->
<script>
	$(function() {
		var pull = $('#pull');
		menu = $('nav ul');
		menuHeight = menu.height();

		$(pull).on('click', function(e) {
			e.preventDefault();
			menu.slideToggle();
		});

		$(window).resize(function() {
			var w = $(window).width();
			if (w > 320 && menu.is(':hidden')) {
				menu.removeAttr('style');
			}
		});
	});
</script>
</head>
<body>
	<!-- start header -->
	<div class="header_bg">
		<div class="wrap">
			<div class="header">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo.png" alt=""></a>
				</div>
				<div class="h_right">
					<!--start menu -->
					<ul class="menu">
						<li><a href="index.jsp">Home</a></li> |
						<li><a href="quartos.jsp">Quartos</a></li> |
						<li><a href="reserva.jsp">Reserva</a></li> |
						<li><a href="atividades.jsp">Atividades</a></li>|
						<li><a href="sobre.jsp">Sobre nós</a></li> |
						<li><a href="contato.jsp">Contato</a></li>|
						<li class="active"><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
						<div class="clear"></div>
					</ul>
					<!-- start profile_details -->
				</div>
				<div class="clear"></div>
				<div class="top-nav">
					<nav class="clearfix">
						<ul>
						<li class="active"><a href="index.jsp">Home</a></li> |
						<li><a href="quartos.jsp">Quartos</a></li> |
						<li><a href="reserva.jsp">Reserva</a></li> |
						<li><a href="atividades.jsp">Atividades</a></li>|
						<li><a href="sobre.jsp">Sobre nós</a></li> |
						<li><a href="contato.jsp">Contato</a></li>|
						<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
						
						</ul>
						<a href="#" id="pull">Menu</a>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!--start main -->
	<div class="main_bg">
		<div class="wrap">
			<div class="main">
				<div class="details">
					<h2>Painel Administrativo</h2>
					<div class="det_pic">
						<img src="images/acesso.jpg" alt="" />
					</div>
				<div class="contact_right">
				  <div class="contact-form">
				  	<h3>Acesso exclusivo do Hotel</h3>
					    <form>
					    	<div>
						    	<span><label>CODIGO FUNCIONÁRIO</label></span>
						    	<span><input name="codigo" type="text" placeholder="Codigo" class="textbox" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    
					<div class="date_btn">
						<form action="Consumo.jsp">
							<input type="submit" value="Conectar" style="width: 82px;">
							
						</form>
					</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	</div>
	
</br></br></br></br></br></br></br></br>







	
	<!--start footer -->
	<div class="footer_bg">
		<div class="wrap">
			<div class="footer">
				<div class="copy">
					<p class="link"><span>© Todos os direitos reservados | Template by DFAB</a></span></p>
				</div>
				<div class="f_nav">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="quartos.jsp">Quartos</a></li>
						<li><a href="reserva.jsp">Reserva</a></li>
						<li><a href="atividades.jsp">Atividades</a></li>
						<li><a href="sobre.jsp">Sobre nós</a></li>
						<li><a href="contato.jsp">Contato</a></li>
						
						
					</ul>
				</div>
				<div class="soc_icons">
					<ul>
						<li><a class="icon1" href="#"></a></li>
						<li><a class="icon2" href="#"></a></li>
						<li><a class="icon3" href="#"></a></li>
						<li><a class="icon4" href="#"></a></li>
						<li><a class="icon5" href="#"></a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
</body>
</html>