<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TMPS00034</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/superfish.css" media="screen">
<script src="js/jquery-1.9.0.min.js"></script>
<script src="js/hoverIntent.js"></script>
<script src="js/superfish.js"></script>
<script>

		// initialise plugins
		jQuery(function(){
			jQuery('#example').superfish({
				//useClick: true
			});
		});

		</script>
	
		
</head>

<body>

<div class="header-wrapper">
	<div class="wrapper">
		<h2>Achieve Privacy-Preserving Priority
Classification on Patient Health Data in
Remote eHealthcare System</h2>
    	<div class="menu">
      <ul class="sf-menu" id="example">
        <li><a href="index.html">Home</a></li>
       

          
      </ul>
    </div>
    <div class="clear"></div>
    </div>
    <div class="clear"></div>
</div>
<!---header-wrapper--->
<div class="clear"></div>
<div class="page-content">
<div class="page">
<div class="panel">
<div class="title">
	<h1>REGISTER</h1>
 
</div>
	
    
 <div class="content"> 
        <form name="myform" action="register" method="post" onsubmit="return validateform()">
          <div class="contact-form mar-top30">
            <label> <span>Full Name</span>
            <input type="text" class="input_text" name="name" id="name"/>
            </label>
            <label> <span>Email</span>
            <input type="email" class="input_text" name="email" id="email" required/>
            </label>
            <label> <span>Password</span>
            <input type="password" class="input_text" name="password" id="subject"/>
            </label>
            <label> <span>Address</span>
            <textarea class="message" name="address" id="feedback"></textarea>
            <input type="submit" class="button" value="Submit" />
            </label>
          </div>
        </form>
        <div class="address">
         
        
        </div>
      </div>   
    
    
    
</div>
</div>
<div class="clear"></div>
</div><!---page-content--->

<div class="footer-wrapper">
	
    <div class="clear"></div>
</div><!---footer-wrapper--->
<script>

function validateform(){  
	var name=document.myform.name.value;  
	var password=document.myform.password.value;  
	  
	if (name==null || name==""){  
	  alert("Name can't be blank");  
	  return false;  
	}else if(password.length<6){  
	  alert("Password must be at least 6 characters long.");  
	  return false;  
	  }  
	}  
</script>
</body>
</html>
