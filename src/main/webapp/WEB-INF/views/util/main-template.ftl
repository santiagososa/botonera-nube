<#import "/spring.ftl" as spring/> <#macro main>
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC 
  "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title><@spring.message code="message.appName"/></title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" href="/static/css/foundation.min.css">
	<link rel="stylesheet" type="text/css" href="/static/css/botonera.css" media="all">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
</head>
<body>
	
	<div class="container">
	
		<div class="header">
			<div class="row">
		  		<div class="large-12 large-centered columns">
		  			<h1 class="title centered-content"><@spring.message code="message.appName"/></h1>
				</div>
			</div>
		</div>
		
		<div class="body">
			<#nested>
		</div>
		
		<div class="footer">
			<div class="row">
		  		<div class="large-4 columns centered-content">
					<a href="http://www.tiendanube.com" target="_blank">
						<img src="http://d26lpennugtm8s.cloudfront.net/assets/insti/img/landing/logo.png" />
					</a>
				</div>
				<div class="large-4 columns centered-content">	
					<a href="http://www.nuvemshop.com.br" target="_blank">
						<img src="http://d26lpennugtm8s.cloudfront.net/assets/insti/img/landing/logo-bra.png" />
					</a>
				</div>	
			</div>
		</div>
	
	</div>
	
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="/static/js/botonera.js"></script>
	
</body>

</html>
</#macro>
