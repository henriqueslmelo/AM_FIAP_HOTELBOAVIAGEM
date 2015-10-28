<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Atividades ::</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
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
					domainKey: ''
				});
				})();
		</script>
<!--nav-->
<script>
		$(function() {
			var pull 		= $('#pull');
				menu 		= $('nav ul');
				menuHeight	= menu.height();

			$(pull).on('click', function(e) {
				e.preventDefault();
				menu.slideToggle();
			});

			$(window).resize(function(){
        		var w = $(window).width();
        		if(w > 320 && menu.is(':hidden')) {
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
				<li class="active"><a href="atividades.jsp">Atividades</a></li> |
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
				<li><a href="reservas.jsp">Reservas</a></li> 
				<li><a href="atividades.jsp">Atividades</a></li> 
				<li><a href="sobre.jsp">Sobre nós</a></li> 
				<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
				
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
<!-- start main_content -->
				<ul class="service_list">
					<li>
						<div class="ser_img">
								<img src="images/ativ1.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Piscina</h3>
						<p class="para">Adulto e infantil</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ativ2.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Lavanderia</h3>
						 <p class="para">Serviço de lavanderia</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ativ3.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Cabelereiro</h3>
						 <p class="para">Serviço de cabelereiro masculino e feminino</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ativ4.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						<h3>Spa</h3>
						 <p class="para">Spa com massagem e energização</p>
					</li>
					<div class="clear"></div>
				</ul>
				<ul class="service_list top">
					<li>
						<div class="ser_img">
								<img src="images/ativ5.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Ofurô</h3>
						 <p class="para">Ofurô para relaxamento</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ativ6.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Almoço e Jantar</h3>
						 <p class="para">Serviço de almoço e jantar</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ativ7.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Deck Bar</h3>
						<p class="para">Cardapio de vinhos e cervejas</p>
											
					</li>
					<li>
						<div class="ser_img">
								<img src=images/ativ8.jpg alt="" />
								<span class="next"> </span>
							</a>
						</div>		
						 <h3>Cozinha Profissional</h3>
						 <p class="para">Cozinheiros especializados</p>
					</li>
					<div class="clear"></div>
				</ul>
		<div class="clear"></div>
	<!-- end main_content -->

	</div>
</div>
</div>		
<!--start main -->
<div class="footer_bg">
<div class="wrap">
<div class="footer">
			<div class="copy">
				<p class="link"><span>© Todos os direitos reservados | Template DFAB</a></span></p>
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