<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Home ::</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700'
	rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.min.js"></script>
<!--start slider -->
<link rel="stylesheet" href="css/fwslider.css" media="all">
<script src="js/jquery-ui.min.js"></script>
<script src="js/css3-mediaqueries.js"></script>
<script src="js/fwslider.js"></script>
<!--end slider -->
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
						<li class="active"><a href="index.jsp">Home</a></li> |
						<li><a href="quartos.jsp">Quartos</a></li> |
						<li><a href="reserva.jsp">Reserva</a></li> |
						<li><a href="atividades.jsp">Atividades</a></li>|
						<li><a href="sobre.jsp">Sobre nós</a></li> |
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
							<li><a href="reserva.jsp">Reserva</a></li>
							<li><a href="atividades.jsp">Atividades</a></li>
							<li><a href="sobre.jsp">Sobre nós</a></li> 
							<li><a href="contato.jsp">Contato</a></li>
							<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
							
						</ul>
						<a href="#" id="pull">Menu</a>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!----start-images-slider---->
	<div class="images-slider">
		<!-- start slider -->
		<div id="fwslider">
			<div class="slider_container">
			
				<!-- /Duplicate to create more slides -->
				<div class="slide">
					<video id="video" src="images/home.mp4" muted loop autoplay style="width:100%; height:100%;"/>
				</div>
				<div class="online_reservation">
					<div class="b_room">
						<div class="booking_room">
							<h4>Faça sua reserva</h4>
							<p>Saia da rotina e escolha uma de nossas acomodações, você desfrutará da comodidade de quartos amplos e 
							confortáveis, além de contar com serviços personalizados. </p>
						</div>
						<div class="reservation">
							<ul>
								<li class="span1_of_1">
									<h5>Tipo do Quarto</h5> <!----------start section_room----------->
									<div class="section_room">
										<select id="country" onchange="change_country(this.value)"
											class="frm-field required">
											<option value="null">Selecione o Quarto</option>
											<option value="AX"">Master Luxo</option>
											<option value="AX">Luxo</option>
											<option value="AX">Master</option>
											<option value="AX">Standard</option>
										</select>
									</div>
									
								</li>
								<li class="span1_of_1 left">
									<h5>Check-In</h5>
									<div class="book_date">
										<form>
											<input class="date" id="datepicker" type="text"
												value="DD/MM/YY" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = 'DD/MM/YY';}">
										</form>

									</div>
								</li>
								<li class="span1_of_1 left">
									<h5>Check-Out</h5>
									<div class="book_date">
										<form>
											<input class="date" id="datepicker1" type="text"
												value="DD/MM/YY" onfocus="this.value = '';"
												onblur="if (this.value == '') {this.value = 'DD/MM/YY';}">
										</form>
									</div>
									
									<li class="span1_of_2">
									<h5>Quantidade Quartos:</h5> <!----------start section_room----------->
									<div class="section_room">
										<select id="country" onchange="change_country(this.value)"
											class="frm-field required">
											<option value="null">1</option>
											<option value="AX"">2</option>
											<option value="AX">3</option>
											<option value="AX">4</option>
										</select>
									</div>
									
								</li>
								<li class="span1_of_2">
									<h5>Adultos:</h5> <!----------start section_room----------->
									<div class="section_room">
										<select id="country" onchange="change_country(this.value)"
											class="frm-field required">
											<option value="null">1</option>
											<option value="AX"">2</option>
											<option value="AX">3</option>
											<option value="AX">4</option>
										</select>
									</div>
									
								</li>
								<li class="span1_of_2 left">
									<h5>Crianças de 0-2:</h5>
									<div class="section_room">
										<select id="country" onchange="change_country(this.value)"
											class="frm-field required">
											<option value="null">1</option>
											<option value="AX"">2</option>
											<option value="AX">3</option>
											<option value="AX">4</option>
										</select>
									</div>
								</li>
								<li class="span1_of_2 left">
									<h5>Crianças de 3-5:</h5>
									<div class="section_room">
										<select id="country" onchange="change_country(this.value)"
											class="frm-field required">
											<option value="null">1</option>
											<option value="AX"">2</option>
											<option value="AX">3</option>
											<option value="AX">4</option>
										</select>
									</div>
								</li>
								<li class="span1_of_3">
									<div class="date_btn">
										<form action="reserva.jsp">
											<input type="submit" class="reservar" value="Reservar" />
										</form>
									</div>
								</li>
								<div class="clear"></div>
							</ul>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<!--/slide -->
			</div>
		</div>
		<!--/slider -->
	</div>
	<!--start main -->
	<div class="main_bg">
		<div class="wrap">

			<!--start grids_of_3 -->
			<div class="grids_of_3">
				<div class="grid1_of_3">
					<div class="grid1_of_3_img">
						<a href="details.html"> <img src="images/quartoC1m.jpg" alt="" />

						</a>
					</div>
					<h4>
						<a href="#">Standard<span>R$200,00</span></a>
					</h4>
					<p>Isolamento acústico, ar condicionado com controle de temperatura na cabeceira,
						minibar, TV a cabo com 71 canais, cofre digital, banheiro com secador de cabelos,
						telefone com o mesmo ramal do quarto, mesa de trabalho com ponto de internet banda larga,
						pode ser configurado como casal ou solteiro duplo,metragem aproximada: 25 m2.</p>
				</div>
				<div class="grids_of_3">
					<div class="grid1_of_3">
						<div class="grid1_of_3_img">
							<a href="details.html"> <img src="images/pic2.jpg" alt="" />
							</a>
						</div>
						<h4>
							<a href="#">Master<span>R$260,00</span></a>
						</h4>
						<p>Isolamento acústico, ar condicionado com controle de temperatura na cabeceira,minibar,
							TV a cabo com 71 canais (sinal digital),TV LCD de 32, cofre digital, banheiros amenities diferenciados com secador de cabelos,
							telefone com o mesmo ramal do quarto, mesa de trabalho com ponto de internet banda larga,
							poltronas com descanso para os pés, pode ser configurado como casal, solteiro duplo ou solteiro triplo,
							metragem aproximada: 30 m2.

</p>
					</div>
					<div class="grid1_of_3">
						<div class="grid1_of_3_img">
							<a href="details.html"> <img src="images/pic1.jpg" alt="" />

							</a>
						</div>
						<h4>
							<a href="#">Luxo<span>R$330,00</span></a>
						</h4>
						<p>Apartamentos localizados nos últimos andares com acabamento sofisticado 
							e decoração especial: cama de casal, poltrona, espelho de corpo inteiro e iluminação indireta.	
							ar condicionado com controle de temperatura na cabeceira, isolamento acústico,
							MP3 player, minibar, TV a cabo com 71 canais (sinal digital), TV LCD de 32" com giro em torno do próprio eixo,
							cofre digital, banheiros com piso especial antiderrapante e secador de cabelos,
							produtos básicos de higiene pessoal em necessaire exclusiva, telefone com o mesmo ramal do quarto,
							ampla bancada de trabalho com ambiente para leitura e ponto de internet banda larga, metragem aproximada: 30 m2.</p>
					</div>
					<div class="grid1_of_3">
						<div class="grid1_of_3_img">
							<a href="details.html"> <img src="images/pic3.jpg" alt="" />

							</a>
						</div>
						<h4>
							<a href="#">Master Luxo<span>R$400,00</span></a>
						</h4>
						<p>Apartamentos localizados nos últimos andares com acabamento 
							sofisticado e decoração especial: cama de casal, poltrona, 
							espelho de corpo inteiro e iluminação indireta, antesala com TV LCD 21" e mesa de vidro com 4 cadeiras,
							isolamento acústico, ar condicionado com controle de temperatura na cabeceira,
							MP3 player, minibar, TV a cabo com 71 canais (sinal digital), TV LCD de 32",
							cofre digital,banheiros com piso especial antiderrapante e secador de cabelos,
							produtos básicos de higiene pessoal em necessaire exclusiva, telefone com o mesmo ramal do quarto,
							ampla bancada de trabalho com ambiente para leitura e ponto de internet banda larga.
						</p>
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
							<span>© Todos os direitos reservados | Template by DFAB
						</p>
					</div>
					<div class="f_nav">
						<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="quartos.jsp">Quartos</a></li>
						<li><a href="reserva.jsp">Reserva</a></li>
						<li><a href="atividades.jsp">Atividades</a></li>
						<li><a href="sobre.jsp">Sobre nós</a></li>
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