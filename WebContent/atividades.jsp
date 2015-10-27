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
				<li><a href="sobre.jsp">Sobre n�s</a></li> |
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
				<li><a href="reservas.jsp">Reservas</a></li> 
				<li><a href="atividades.jsp">Atividades</a></li> 
				<li><a href="sobre.jsp">Sobre n�s</a></li> 
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
								<img src="images/ser_pic1.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Sed condimentum</h3>
						<p class="para">There are many variations of passages of Lorem Ipsum available,</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic2.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Integer facilisis</h3>
						 <p class="para">Our website design and development provides quality web,</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic3.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Morbi sit amet mauris</h3>
						 <p class="para">There are many variations of passages of Lorem Ipsum available,</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic4.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						<h3>Nulla commodo erat</h3>
						 <p class="para">Lorem ipsum dolor sit amet, consectetur elit,EIUSMOD tempor,</p>
					</li>
					<div class="clear"></div>
				</ul>
				<ul class="service_list top">
					<li>
						<div class="ser_img">
								<img src="images/ser_pic5.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Nulla commodo erat</h3>
						 <p class="para">There are many variations of passages of Lorem Ipsum available,</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic6.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>						
						 <h3>Morbi sit amet mauris</h3>
						 <p class="para">Lorem ipsum dolor sit amet, consectetur elit,EIUSMOD tempor,</p>
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic7.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>	
						<h3>Integer facilisis</h3>
						<p class="para">There are many variations of passages of Lorem Ipsum available,</p>
											
					</li>
					<li>
						<div class="ser_img">
								<img src="images/ser_pic8.jpg" alt="" />
								<span class="next"> </span>
							</a>
						</div>		
						 <h3>Sed condimentum</h3>
						 <p class="para">Our website design and development provides quality web,</p>
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
				<p class="link"><span>� Todos os direitos reservados | Template DFAB</a></span></p>
			</div>
			<div class="f_nav">
				<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="quartos.jsp">Quartos</a></li>
						<li><a href="reserva.jsp">Reserva</a></li>
						<li><a href="atividades.jsp">Atividades</a></li>
						<li><a href="sobre.jsp">Sobre n�s</a></li>
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