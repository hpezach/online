<html>  
<body>  
<head>
<script src="js/jquery-3.2.1.min.js" ></script>
<script type="text/javascript">
$(document).ready(function(){
	window.onload=function(){
		alert("message");
	}
});
</script>
</head>
<h2>Hello World!</h2>

<form action="/index/login.htm" method="post">  
    <input id="name" name="name" value="张三"/><br/>  
    <input id="password" name="password" value="123456"/><br/>  
    <input type="submit" value="提交"/>  
</form>  
</body>  
</html>
