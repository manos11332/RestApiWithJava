<?php
 ini_set('short_open_tag', 'on');
//print_r($_GET);
 $xml1= "<?xml version=\"1.0\" encoding=\"utf-8\"?><mitroo>"
                + " <address>"+"test333"+"</address>"
                + "    <afm>"+"test333"+"</afm>"
                + "    <amka>"+"test333"+"</amka>"
                + "    <at>"+"test333"+"</at>"
                + "    <bdate>"+"test333"+"</bdate>"
                + "    <fylo>"+"test333"+"</fylo>"
                + "    <lname>"+"test333"+"</lname>"
                + "    <name>"+"test333"+"</name>"
                + "</mitroo>";
?>
$xml = '<?xml version="1.0" encoding="ISO-8859-1"?>
<?php error_reporting (E_ALL ^ E_NOTICE); ?>
<html>
<body>
    <div >
        <h3>Εμφάνηση όλων των εγγαρφών στο μητρώο</h3>
        <form name="lirli1" action="http://localhost:8080/nefosrest2/webresources/mitroa" method="get">
<label>Εμφάνησε όλα τα Μητρώα</label>
<input type="Submit" name="Submit"> 
</form>
    </div>

<!-- Λειτουργία εισαγωγής νέας εγγαφής -->
<div>
  <form  action="http://localhost:8080/nefosrest2/webresources/mitroa/mitroo" method="POST">
    <h3>Εισαγωγή νέας εγγραφής</h3>
<label>Εισάγετε τα στοιχεία του μητρώου και πατήστε υποβολή . Στην συνέχεια πατήστε Εκτύπωση.</label><br>
<label>at</label> <input type="text" name="at"><br>
<label>name</label> <input type="text" name="name"><br>
<label>lname</label> <input type="text" name="lname"><br>
<label>fylo</label> <input type="text" name="fylo"><br>
<label>bdate</label> <input type="text" name="bdate"><br>
<label>afm</label> <input type="text" name="afm"><br>
<label>amka</label> <input type="text" name="amka"><br>
<label>address</label> <input type="text" name="address"><br>

<input type="submit" name="submit"> 
</form>
</div>

<!-- Λειτουργία αναζήτησης με το ΑΦΜ και διαγραφή της εγγραφής -->
<div>
  <form  method="POST">
    <h3>Αναζήτηση με βάση το ΑΦΜ</h3>
<label>Εισάγετε το ΑΦΜ που αναζητάτε και πατήστε υποβολή . Στην συνέχεια πατήστε Εκτύπωση.</label>
<input type="text" name="afm">
<input type="submit" name="submit"> 
</form>
<?php
$a=$_POST["afm"];
echo $a ;
?>
<form name="lirli" action="http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/afm/<?php echo($a);  ?>" method="get">
<input type="Submit" name="Submit" value="Εκτύπωση με το ζητούμενο ΑΦΜ"> 
</form>  
<!-- κωδικας για delete request-->
</div>


<!-- Λειτουργία αναζήτησης με το ονομα και το επονυμο και ανανέωση του ΑΜΚΑ και της Διευθυνσης -->
<div>
    <h3>Αναζήτηση με βάση το Όνομα</h3>
    <form name="lirl3"  method="Post">
<label>Εισάγετε το Όνομα. Στην συνέχεια πατήστε Εκτύπωση.</label>
<input type="text" name="name">
<input type="submit" name="submit"> 
</form>
<?php
$a2=$_POST["name"];
echo $a2 ;
?>
<form name="lirli" action="http://localhost:8080/nefosrest2/webresources/mitroa/mitroo/name/<?php echo($a2);  ?>" method="get">
<input type="Submit" name="Submit" value="Εκτύπωση εγγραφής με βάση το Όνομα που ζητήθηκε"> 
</form>
<!-- κωδικας για put request-->
</div>

</body>
</html>
