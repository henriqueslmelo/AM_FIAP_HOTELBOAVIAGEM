<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<title>The Paradise-Hotel Website Template | Details :: w3layouts</title>
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
			<a href="index.html"><img src="images/logo.png" alt=""></a>
		</div>
		<div class="h_right">
			<!--start menu -->
			<ul class="menu">
				<li class="active"><a href="index.html">hotel</a></li> |
				<li><a href="rooms.html">rooms & suits</a></li> |
				<li><a href="reservation.html">reservation</a></li> |
				<li><a href="activities.html">activities</a></li> |
				<li><a href="contact.html">contact</a></li>
				<div class="clear"></div>
			</ul>
			<!-- start profile_details -->
					<form class="style-1 drp_dwn">
						<div class="row">
							<div class="grid_3 columns">
								<select class="custom-select" id="select-1">
									<option selected="selected">EN</option>
									<option>USA</option>
									<option>AUS</option>
									<option>UK</option>
									<option>IND</option>
								</select>
							</div>		
						</div>		
					</form>
		</div>
		<div class="clear"></div>
		<div class="top-nav">
		<nav class="clearfix">
				<ul>
				<li class="active"><a href="index.html">hotel</a></li> 
				<li><a href="rooms.html">rooms & suits</a></li> 
				<li><a href="reservation.html">reservation</a></li> 
				<li><a href="activities.html">activities</a></li> 
				<li><a href="contact.html">contact</a></li>
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
			<h2>Lorem ipsum dolor sit amet consectetur adipisicing</h2>
			<div class="det_pic">
				  <img src="images/det_pic.jpg" alt="" />
			</div>
			<div class="det_text">
				<p class="para">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. </p>
				<p class="para">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics</p>
				<div class="read_more">
					 <a href="details.html">read more</a>
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
				<p class="link"><span>� All rights reserved | Template by&nbsp;<a href="http://w3layouts.com/"> W3Layouts</a></span></p>
			</div>
			<div class="f_nav">
				<ul>
					<li><a href="index.html">home</a></li>
					<li><a href="rooms.html">rooms & suits</a></li>
					<li><a href="reservation.html">reservation</a></li>
					<li><a href="contact.html">Contact</a></li>
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