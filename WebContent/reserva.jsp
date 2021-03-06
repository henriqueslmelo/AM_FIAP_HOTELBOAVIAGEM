<%@page import="br.com.fiap.am.beans.TipoQuarto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Reserva ::</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700'
	rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.min.js"></script>
<!---strat-date-piker---->
<link rel="stylesheet" href="css/jquery-ui.css" />
<script src="js/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker,#datepicker1").datepicker();
	});
</script>
<!---/End-date-piker---->
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
						<li class="active"><a href="reserva.jsp">Reserva</a></li>
						<li><a href="atividades.jsp">Atividades</a></li> |
						<li><a href="sobre.jsp">Sobre n�s</a></li> |
						<li><a href="contato.jsp">Contato</a></li>|
						<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
						
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
							<li><a href="reserva.jspl">Reserva</a></li>
							<li><a href="atividades.jsp">Atividades</a></li>
							<li><a href="sobre.jsp">Sobre n�s</a></li>
							<li><a href="contato.jsp">Contato</a></li>
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
				<div class="res_online">
					<h4>Fa�a sua reserva</h4>
					<p class="para">Informe a data de entrada e a data de sa�da do
						hotel, a quantidade de hospedes, o limite � de 4 pessoas por
						quarto, escolha o tipo e a quantidade de quartos.</p>
				</div>
				<div class="span_of_2">
					<div class="span2_of_1">
						<form action="Servlet" >
							<h4>Check-In:</h4>
							<div class="book_date btm">

								<input name="checkin" class="date" id="datepicker" type="text"
									value="DD/MM/YY" onfocus="this.value = '';"
									onblur="if (this.value == '') {this.value = 'DD/MM/YY';}" />


							</div>
							<div class="book_date btm">
								</br>
								<h4>Tipo do Quarto</h4>
								<select  name="tipoQuarto" value="${tipo.tipoQuarto}" id="country"
									onchange="change_country(this.value)"
									class="frm-field required">
									<option>Selecione o tipo do quarto</option>
									<option>MASTER LUXO</option>
									<option>LUXO</option>
									<option>MASTER</option>
									<option>STANDART</option>
								</select>
							</div>


							<div class="sel_room">
								<h4>Adultos</h4>
								<select name="adultos" id="country"
									onchange="change_country(this.value)"
									class="frm-field required">
									<option value="null">1</option>
									<option value="AX">2</option>
									<option value="AX">3</option>
									<option value="AX">4</option>
								</select>
							</div>

							<div class="sel_room left">
								<h4>N� Quartos</h4>
								<select name="nrQuartos" id="country"
									onchange="change_country(this.value)"
									class="frm-field required">
									<option value="null">1</option>
									<option value="AX">2</option>
									<option value="AX">3</option>
									<option value="AX">4</option>
								</select>
							</div>
					</div>
					<div class="span2_of_1">
						<h4>Check-Out</h4>
						<div class="book_date btm">
							<input name="checkout" id="datepicker1" class="date" type="text"
								value="DD/MM/YYYY" onfocus="this.value = '';"
								onblur="if (this.value == '') {this.value = 'DD/MM/YY';}" />
						</div>
						<div class="sel_room">
							</br>
							<h4>Crian�as de 0-2:</h4>
							<select name="crianca0a2" id="country"
								onchange="change_country(this.value)" class="frm-field required">
								<option value="null">0</option>
								<option value="AX">1</option>
								<option value="AX">2</option>
								<option value="AX">3</option>
								<option value="AX">4</option>
							</select>
						</div>
						<div class="sel_room left">
							</br>
							<h4>Crian�as de 3-5:</h4>
							<select name="crianca3a5" id="country"
								onchange="change_country(this.value)" class="frm-field required">
								<option value="crianca1">0</option>
								<option value="AX">1</option>
								<option value="AX">2</option>
								<option value="AX">3</option>
								<option value="AX">4</option>
							</select>
						</div>
						<div class="res_btn"></br></br>	</br></br></br>	</br> 
							<input type="submit" value="Consultar" 	style="width: 150px; height: 30px;"></a></br>
							</br>
						</div>
						</form>
					</div>

					<div class="clear"></div>
				</div>
				<div class="res_btn">
					<form action="login.jsp" method="post">
						<input type="submit" value="Reservar" style="width: 280px;"></a>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--start main -->
	<div class="footer_bg">
		<div class="wrap">
			<div class="footer">
				<div class="copy">
					<p class="link">
						<span>� Todos os direitos reservados | Template DFAB</a>
						</span>
					</p>
				</div>
				<div class="f_nav">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="quartos.jsp">Quartos</a></li>
						<li><a href="reserva.jsp">Reserva</a></li>
						<li><a href="atividades.jsp">Atividades</a></li>
						<li><a href="sobre.jsp">Sobre n�s</a></li>
						<li><a href="contato.jsp">Contato</a></li>
						<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
						
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