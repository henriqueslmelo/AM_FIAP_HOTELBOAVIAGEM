<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Sobre nós ::</title>
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
						<li class="active"><a href="sobre.jsp">Sobre nós</a></li> |
						<li><a href="contato.jsp">Contato</a></li>
						<div class="clear"></div>
					</ul>
					<!-- start profile_details -->
				</div>
				<div class="clear"></div>
				<div class="top-nav">
					<nav class="clearfix">
						<ul>
						<li><a href="index.jsp">Home</a></li> |
						<li><a href="quartos.jsp">Quartos</a></li> |
						<li><a href="reserva.jsp">Reserva</a></li> |
						<li><a href="atividades.jsp">Atividades</a></li>|
						<li class="active"><a href="sobre.jsp">Sobre nós</a></li> |
						<li><a href="contato.jsp">Contato</a></li>
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
					<h2>Sobre nós</h2>
					<div class="det_pic">
						<img src="images/det_pic.jpg" alt="" />
					</div>
					<div class="det_text">
						<p class="para">O Hotel Boa Viagem é um empreendimento que tem, por tradição, oferecer a seus hóspedes, atendimento personalizado, 
						serviços especiais e garantia de satisfação.
						A estrutura moderna e funcional do hotel conta com um amplo restaurante de cozinha internacional, auditório para reuniões e eventos, 
						sauna, piscina, área de ginástica e internet banda larga em todos os apartamentos com suporte técnico.
						Há, também, um elevador especial para cadeira de rodas, equipamentos e acomodações preparadas para o atendimento aos deficientes físicos.
						O Hotel Boa Viagem, é hoje, referencial para o turismo de negócios e lazer na capital, tendo como filosofia proporcionar uma estadia 
						agradável a todos, preservando, em alto nível, a tradicional hospitalidade mineira.
						Estamos esperando por você. Faça agora sua reserva.
</p>
					<div class="date_btn">
						<form action="reserva.jsp">
							<input type="submit" value="Reservar" style="width: 82px;">
						</form>
					</div>
					</div>
				</div>
			</div>
		</div>
	</div>
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