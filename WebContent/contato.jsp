<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Contato</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.min.js"></script>
<script type="text/javascript"  src="js/validacaoForm.js"></script>
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
				<li><a href="atividades.jsp">Atividades</a></li>|
				<li><a href="sobre.jsp">Sobre nós</a></li> |
				<li class="active"><a href="contato.jsp">Contato</a></li>
				<div class="clear"></div>
			</ul>
			<!-- start profile_details -->
		</div>
		<div class="clear"></div>
		<div class="top-nav">
		<nav class="clearfix">
				<ul>
				<li class="active"><a href="index.jsp">Hotel</a></li> 
				<li><a href="quartos.jsp">Quartos</a></li> 
				<li><a href="reserva.jsp">Reserva</a></li> 
				<li><a href="atividades.jsp">Atividades</a></li> 
				<li><a href="sobre.jsp">Sobre nós</a></li> 
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
		<div class="contact">				
				<div class="contact_left">
					<div class="contact_info">
			    	 	<h3>Nos encontre aqui</h3>
			    	 		<div class="map">
					   			<iframe width="100%" height="175" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3657.4175809059857!2d-46.62553648495763!3d-23.55344146718508!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce59055d7a016b%3A0xdf6c0437e95dd2bf!2sR.+da+Mooca%2C+200+-+Mooca%2C+S%C3%A3o+Paulo+-+SP%2C+Brasil!5e0!3m2!1spt-BR!2sus!4v1445361618038"></iframe><br><small><a href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265" style="color: #242424;text-shadow: 0 1px 0 #ffffff;text-align: left;font-size: 0.7125em;padding: 5px;font-weight: 600;"></a></small>
					   		</div>
      				</div>
      			<div class="company_address">
				     	<h3>Nossa Localização :</h3>
						<p>Rua da Mooca, 200 </p>
						<p>São Paulo - SP - Brasil</p>
				   		<p>Telefone:(11) 6666-6666</p>
				   		<p>Siga-nos: <a href="www.facebook.com.br">Facebook</a>, <a href="www.twitter.com">Twitter</a></p>
				   </div>
				</div>				
				<div class="contact_right">
				  <div class="contact-form">
				  	<h3>Entre em contato conosco</h3>
					    <form name ="formContato" onSubmit="return ( verificaEmail() )" method="post" action="#">
					    	<div>
						    	<span><label>NOME</label></span>
						    	<span><input name="nome" type="text" placeholder="Nome" class="textbox" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    </div>
						    <div>
						    	<span><label>E-MAIL</label></span>
						    	<span><input name="email" type="text" placeholder="E-mail" class="textbox" onblur="checarEmail()" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    </div>
						    <div>
						     	<span><label>TELEFONE</label></span>
						    	<span><input name="telefone" type="text" placeholder="Telefone" class="textbox" required="required" onkeyup="mascara( this, mtel );" maxlength="15"></span>
						    </div>
						    <div>
						    	<span><label>MENSAGEM</label></span>
						    	<span><textarea name="mensagem" placeholder="Digite sua mensagem" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')" maxlength="120"> </textarea></span>
						    </div>
						   <div>
						   		<span><input type="submit" value="ENVIAR"></span>
						  </div>
					    </form>
				    </div>
  				</div>		
  				<div class="clear"></div>		
		  </div>
	</div>
</div>
</div>		
<!--start main -->
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