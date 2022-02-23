<!-- <html>
<body>
<h2>Jersey RESTful Web Application!</h2>
<p><a href="webresources/myresource">Jersey resource</a>
<p>Visit the <a href="http://jersey.java.net">Project Jersey website</a>
for more information on Jersey!
</body>
</html>
-->

<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>login</title>
<!-- <link type="text/css" rel="stylesheet" 	href="webjars/bootstrap/3.0.3/css/bootstrap.min.css" /> -->
<link type="text/css" rel="stylesheet"	href="login/login-form.css?v=1330110121" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script type="text/javascript" src="webjars/jquery/1.9.0/jquery.min.js"></script>
<script type="text/javascript" 	src="webjars/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<style>
 
</style>
</head>
<body>
        <div class="wrapper">  
            <div class="container-mine">
                <header class="banner">
                    <div class="banner__left-logo">
                         <img src="login/LOGO_GGPS_new.png" />
                    </div>
                    <div class="banner__right-logo">
                         <img src="login/logo_el.png" />
                    </div>
                </header>
                <div class="header-area">    
                    <h3>Αυθεντικοποίηση Χρήστη</h3>
                </div>
                <div class="error-area">
                </div>
                <div class="form-horizontal">
                
            <form id="login-form" action="sevlet1" method="GET">
                           <div class="form-header-group">
                                <h2>Σύνδεση</h2>
                                <p class="form-sub-header">Παρακαλώ εισάγετε τους κωδικούς σας στο <strong>TaxisNet</strong> για να συνδεθείτε.</p>
                                <hr />
                            </div>
            <div class="input-wrapper">
            <div class="form-group">
            <label for="j_username">Χρήστης:</label> 
                <input  id="v" type="text" name="j_username" class="form-control">
            </div>    
            </div>    
            <div class="input-wrapper">
            <div class="form-group">
                <label>Κωδικός</label>
                <input type="password" name="j_password" class="form-control ">
            </div>
            </div>
           <!-- <input type="Submit" name="Submit" value="Σύνδεση"> --> 
          <div class="input-wrapper"> <input id="btn-login-submit" class="btn btn-primary submit-button" type="submit" value="submit"/>
                            </div>
                          
        </form>
        
		</div>

                <hr/>
                <div>
                    <h7 class="form-footer"><a href="https://gsis.gr/dimosia-dioikisi/ked">Κέντρο Διαλειτουργικότητας (ΚΕ.Δ.) Υπουργείου Ψηφιακής Διακυβέρνησης</a> </h7>
                </div>
            </div>
        </div>


        
    

</body>
</html>
