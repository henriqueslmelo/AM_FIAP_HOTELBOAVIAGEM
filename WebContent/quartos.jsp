<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Quartos ::</title>
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
						<li class="active"><a href="quartos.jsp">Quartos</a></li> |
						<li><a href="reserva.jsp">Reserva</a></li> |
						<li><a href="atividades.jsp">Atividades</a></li> |
						<li><a href="contato.jsp">Contato</a></li>
						<div class="clear"></div>
					</ul>
					<!-- start profile_details -->
				</div>
				<div class="clear"></div>
				<div class="top-nav">
					<nav class="clearfix">
						<ul>
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a href="quartos.jsp">Quartos</a></li>
							<li><a href="reserva.jsp">Reserva</a></li>
							<li><a href="Atividades.jsp">Atividades</a></li>
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
				<div class="content">
					<div class="room">
						<h4>hill view room</h4>
						<p class="para">There are many variations of passages of Lorem
							Ipsum available, but the majority have suffered alteration in
							some form, by injected humour, or randomised words which don't
							look even slightly believable. If you are going to use a passage
							of Lorem Ipsum, you need to be sure there isn't anything
							embarrassing hidden in the middle of text. All the Lorem Ipsum
							generators on the Internet tend to repeat.</p>
					</div>
					<div class="grids_of_2">
						<div class="grids_of_img">
							<img src="images/pic4.jpg" alt="" />
						</div>
						<div class="grids_of_para">
							<p class="para">There are many variations of passages of
								Lorem Ipsum available, but the majority have suffered alteration
								in some form, by injected humour, or randomised words which
								don't look even slightly believable. If you are going to use a
								passage of Lorem Ipsum, you need to be sure there isn't anything
								embarrassing hidden in the middle of text. All the Lorem Ipsum
								generators on the Internet tend to repeat.</p>
						</div>
						<div class="clear"></div>
					</div>
					<div class="grids_of_2">
						<div class="grids_of_img">
							<img src="images/pic5.jpg" alt="" />
						</div>
						<div class="grids_of_para">
							<p class="para">There are many variations of passages of
								Lorem Ipsum available, but the majority have suffered alteration
								in some form, by injected humour, or randomised words which
								don't look even slightly believable. If you are going to use a
								passage of Lorem Ipsum, you need to be sure there isn't anything
								embarrassing hidden in the middle of text. All the Lorem Ipsum
								generators on the Internet tend to repeat.</p>
						</div>
						<div class="clear"></div>
					</div>

				</div>
				<div class="sidebar">
					<div class="date_btn">
						<form action="reserva.jsp">
							<input type="submit" value="Reservar" style="width: 82px;">
						</form>
					</div>
					<h4>room features</h4>
					<ul class="s_nav">
						<li><a href="#">laptop-size safe</a></li>
						<li><a href="#">Lorem ipsum dolor sit amet, consectetur
								adipiscing elit.</a></li>
						<li><a href="#">Etiam malesuada leo ornare</a></li>
						<li><a href="#">Sed eu magna sed lorem tincidunt</a></li>
						<li><a href="#">Proin id diam eleifend neque auctor
								scelerisque.</a></li>
					</ul>
					<h4>Formas de Pagamento</h4>
					<ul class="s_nav1">
						<li><a class="icon1" href="#"></a></li>
						<li><a class="icon2" href="#"></a></li>
						<li><a class="icon3" href="#"></a></li>
						<li><a class="icon4" href="#"></a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<!--start main -->
	<div class="footer_bg">
		<div class="wrap">
			<div class="footer">
				<div class="copy">
					<p class="link">
						<span>� Todos os direitos reservados | Template by&nbsp;
							DFAB</a>
						</span>
					</p>
				</div>
				<div class="f_nav">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="quartos.jsp">Quartos</a></li>
						<li><a href="reserva.jsp">Reserva</a></li>
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