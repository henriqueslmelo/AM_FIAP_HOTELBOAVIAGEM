<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Boa Viagem | Registrar Consumo</title>
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
				<li class="active"><a href="Consumo.jsp">Registrar Consumo</a></li> 
				<li><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
				<div class="clear"></div>
			</ul>
			<!-- start profile_details -->
		</div>
		<div class="clear"></div>
		<div class="top-nav">
		<nav class="clearfix">
				<ul>
				<li class = "active"><a href="AcessoInterno.jsp">Acesso Interno</a></li> 
				<li><a href="Consumo.jsp">Registrar Consumo</a></li> 
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
				<div class="contact_right">
				  <div class="contact-form">
				  	<h3>Registrar Consumo</h3>
					    <form name ="formContato" onSubmit="return ( verificaEmail() )" method="post" action="#">
					    	<div>
						    	<span><label>CODIGO HOSPEDAGEM</label></span>
						    	<span><input name="nome" type="text" placeholder="CODIGO HOSPEDAGEM" class="textbox" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    </div>
						    <div>
						    	<span><label>CODIGO FUNCIONARIO</label></span>
						    	<span><input name="email" type="text" placeholder="CODIGO FUNCIONARIO" class="textbox" onblur="checarEmail()" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    </div>
						      <div>
						    	<span><label>DATA SOLICITACAO</label></span>
						    	<span><input name="email" type="text" placeholder="DATA SOLICITACAO" class="textbox" onblur="checarEmail()" required="required" oninvalid="this.setCustomValidity('Preencha esse campo')"></span>
						    </div>
						    
						    <div>
						     	<span><label>PRODUTO/SERVICO</label></span>
						    	<span><input name="telefone" type="text" placeholder="PRODUTO/SERVICO" class="textbox" required="required" onkeyup="mascara( this, mtel );" maxlength="15"></span>
						    </div>
						    <div>
						     	<span><label>QUANTIDADE</label></span>
						    	<span><input name="telefone" type="text" placeholder="QUANTIDADE" class="textbox" required="required" onkeyup="mascara( this, mtel );" maxlength="15"></span>
						    </div>
						   <div>
						   		<span><input type="submit" value="REGISTRAR"></span>
						   		
						  </div>
						   <div>
						   		<span><input type="submit" value="EXCLUIR"></span>
						   		
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
						<li><a href="AcessoInterno.jsp">Acesso Interno</a></li>
						<li><a href="Consumo.jsp">Consumo</a></li>
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